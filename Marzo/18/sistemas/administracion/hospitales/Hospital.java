package sistemas.administracion.hospitales;
import java.util.ArrayList;

public class Hospital {

    private ArrayList<Pacientes> pacientesAatender = new ArrayList<Pacientes>();
    private String nombreHospital;
    private ArrayList<Pacientes> pacientesSiendoAtendidos= new ArrayList<Pacientes>();
    private ArrayList<Pacientes> pacientesAtendidos= new ArrayList<Pacientes>();
    private ArrayList<Doctores> doctoresAtendiendo;
    private ArrayList<Integer> camasDisponibles;

    public int getDoctoresAtendiendo() {  return doctoresAtendiendo.size();  }

    public int getPacientesAatender() {
        return pacientesAatender.size();
    }

    public void getPacientesSiendoAtendidos() {
        int i=0;
        while(i<pacientesSiendoAtendidos.size()){
            System.out.println("Paciente " + pacientesSiendoAtendidos.get(i).getNombre() + " " + pacientesSiendoAtendidos.get(i).getApelllido());
            i++;
        }
    }

    public void insertIntoPacientesAtendidos(ArrayList<Pacientes> pacientesAtendidos) {
        this.pacientesAtendidos = pacientesAtendidos;
    }

    public void insertIntoPacientesAatender(ArrayList<Pacientes> pacientesAatender) {
        this.pacientesAatender = pacientesAatender;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public void setDoctoresAtendiendo(ArrayList<Doctores> doctoresAtendiendo) {
        this.doctoresAtendiendo = doctoresAtendiendo;
    }

    public void insertOnPacientesSiendoAtendidos(Pacientes p) {
        this.pacientesSiendoAtendidos.add(p);
    }

    public void insertOnPacientesAAtender(Pacientes p){
        this.pacientesAatender.add(p);
    }

    public void removePacientesAAtender(Pacientes p, int i){
        this.pacientesAatender.remove(i);
    }

    public void insertOnPacientesAtendidos(Pacientes p){
        this.pacientesAtendidos.add(p);
    }

    public int retCantCamas(ArrayList<Integer> cant){
        return this.camasDisponibles.size();
    }

}
