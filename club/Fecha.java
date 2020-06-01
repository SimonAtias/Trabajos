package club;
import java.util.ArrayList;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    Fecha(int diaX, int mesX, int anioX){
        this.dia=diaX;
        this.anio=anioX;
        this.mes=mesX;
    }

    public int getAnio() {
        return this.anio;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public boolean esDifA(Fecha fechaAux){
        if(this.dia != fechaAux.getDia() || this.mes != fechaAux.getMes() || this.anio != fechaAux.getAnio()){
            return true;
        }
        return false;
    }

    public int getCantDias(Fecha fechaSalida){

        Fecha fecha1 = new Fecha(this.dia, this.mes, this.anio);
        Fecha fecha2;
        fecha2=fechaSalida;

        int cantDias=1;

        // No se puede reemplazar porque no hay un recorrido de un arreglo, sino que hay un booleano usado para comprobar
        while(fecha1.esDifA(fecha2)) {
            if (fecha1.getMes() == 1 || fecha1.getMes() == 3 || fecha1.getMes() == 5 || fecha1.getMes() == 7 || fecha1.getMes() == 8 || fecha1.getMes() == 10 || fecha1.getMes() == 12) {
                if (fecha1.getDia() == 31) {
                    if (fecha1.getMes() == 12) {
                        fecha1.setMes(1);
                        fecha1.setDia(1);
                        fecha1.setAnio(fecha1.getAnio()+1);
                        cantDias++;
                    }
                    else {
                        fecha1.setMes(fecha1.getMes()+1);
                        fecha1.setDia(1);
                        cantDias++;
                    }
                }
                else {
                    fecha1.setDia(fecha1.getDia()+1);
                    cantDias++;
                }
            }
            else if ((fecha1.getMes() == 4 || fecha1.getMes() == 6 || fecha1.getMes() == 9 || fecha1.getMes() == 11)) {
                if(fecha1.getDia()==30){
                    fecha1.setMes(fecha1.getMes()+1);
                    fecha1.setDia(1);
                    cantDias++;
                }
                else{
                    fecha1.setDia(fecha1.getDia()+1);
                    cantDias++;
                }
            }
            else{
                if(fecha1.getDia()==28  &&  fecha1.getAnio() % 4  !=  0 || fecha1.getDia()==29  &&  fecha1.getAnio() % 4  ==  0){
                    fecha1.setDia(1);
                    fecha1.setMes(fecha1.getMes()+1);
                    cantDias++;
                }
            }
        }
        return cantDias;
    }

}

