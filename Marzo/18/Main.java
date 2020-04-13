import sistemas.administracion.hospitales.Hospital;
import sistemas.administracion.hospitales.Pacientes;

public class Main {

    public static void main(String[] args) {
        Hospital Pirovano = new Hospital();
        Pacientes pPirovano = new Pacientes();
        pPirovano.setIdPaciente(1);
        pPirovano.setNombre("Nora");
        pPirovano.setApelllido("Stalinski");
        pPirovano.setEdad(79);
        Pirovano.insertOnPacientesSiendoAtendidos(pPirovano);
        Pirovano.getPacientesSiendoAtendidos();
    }

}
