package sistemas.administracion.hospitales;
public class Pacientes {

    private String nombre;
    private String apelllido;
    private int idPaciente;
    private int edad;

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getApelllido() {
        return apelllido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApelllido(String apelllido) {
        this.apelllido = apelllido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

}
