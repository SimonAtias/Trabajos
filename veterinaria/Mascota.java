package veterinaria;

import personas.Persona;

import java.util.Date;
import java.util.HashSet;
import java.util.Map;

public class Mascota {

    private String nombre;
    private Persona duenio;
    private Date fechaNac;
    private HashSet<Date> visitas;
    private int asistenciasMinimas;

    Mascota(){
        this.nombre="Angelica";
        this.duenio=new Persona();
        this.fechaNac= new java.util.Date();
        asistenciasMinimas=0;
        visitas = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public int getAsistenciasMinimas() {
        return asistenciasMinimas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setAsistenciasMinimas(int asistenciasMinimas) {
        this.asistenciasMinimas = asistenciasMinimas;
    }

    public boolean cumplioVisitasNecesariasEsteAnio(){
        Date fechaDeHoy = new java.util.Date();
        int asistencias=0;
        for(Date v: visitas){
            if(v.getYear()==fechaDeHoy.getYear()){
                asistencias++;
            }
        }
        if(asistencias>=asistenciasMinimas){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean cumpleVisitasNecesariasDesdeNacimiento(){
        Date fechaDeHoy = new java.util.Date();
        int asistencias=visitas.size();
        if(asistencias>=asistenciasMinimas*(fechaDeHoy.getYear()-this.fechaNac.getYear())){
            return true;
        }
        else{
            return false;
        }
    }

}
