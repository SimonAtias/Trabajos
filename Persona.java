import java.util.ArrayList;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int DNI;
    private Fecha fechaEntrada;
    private Fecha fechaSalida;
    private int vecesHospedado;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaEntrada() {
        return fechaEntrada;
    }

    public Fecha getFechaSalida() {
        return fechaSalida;
    }


    public String getApellido() {
        return apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setFechaEntrada(Fecha fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setFechaSalida(Fecha fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setVecesHospedado(int vecesHospedado) {
        this.vecesHospedado = vecesHospedado;
    }

    public int getVecesHospedado() {
        return vecesHospedado;
    }

    public void printDNIs(){
        System.out.println(this.DNI);
    }


    public int getDNI() {
        return this.DNI;
    }

    public int getCantDias(){

        Fecha fecha1;
        fecha1=this.fechaEntrada;
        Fecha fecha2;
        fecha2=this.fechaSalida;

        int cantDias=1;

        while(fecha1.getDia() != fecha2.getDia() || fecha1.getMes() != fecha2.getMes() || fecha1.getAnio() != fecha2.getAnio()) {
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


    public void agregarDias(int cantDiasAAgregar) {
        int i = 0;
        Fecha fecha1;
        fecha1=this.fechaSalida;
        while (i < cantDiasAAgregar) {
            if (fecha1.getMes() == 1 || fecha1.getMes() == 3 || fecha1.getMes() == 5 || fecha1.getMes() == 7 || fecha1.getMes() == 8 || fecha1.getMes() == 10 || fecha1.getMes() == 12) {
                if (fecha1.getDia() == 31) {
                    if (fecha1.getMes() == 12) {
                        fecha1.setMes(1);
                        fecha1.setDia(1);
                        fecha1.setAnio(fecha1.getAnio()+1);
                        cantDiasAAgregar--;
                    }
                    else {
                        fecha1.setMes(fecha1.getMes()+1);
                        fecha1.setDia(1);
                        cantDiasAAgregar--;
                    }
                }
                else {
                    fecha1.setDia(fecha1.getDia()+1);
                    cantDiasAAgregar--;
                }
            }
            else if (fecha1.getMes() == 4 || fecha1.getMes() == 6 || fecha1.getMes() == 9 || fecha1.getMes() == 11) {
                if (fecha1.getDia() + cantDiasAAgregar > 30) {
                    fecha1.setMes(fecha1.getMes()+1);
                    fecha1.setDia(1);
                    cantDiasAAgregar--;
                } else {
                    fecha1.setDia(fecha1.getDia()+1);
                    cantDiasAAgregar--;
                }
            }
            else {
                if (fecha1.getDia()==28 && fecha1.getAnio()%4!=0 || fecha1.getDia()==29 && fecha1.getAnio()%4==0) {
                    fecha1.setDia(1);
                    fecha1.setMes(fecha1.getMes()+1);
                    cantDiasAAgregar--;
                }
            }
        }
        System.out.println(fecha1.getDia()+"/"+fecha1.getMes()+"/"+fecha1.getAnio());
    }

    public void getFechasES() {
        System.out.println("El hospedaje es del " + this.fechaEntrada.getDia() + "/" + this.fechaEntrada.getMes() + "/" + this.fechaEntrada.getAnio() + " hasta " + this.fechaSalida.getDia() +"/"+this.fechaSalida.getMes() + "/" + this.fechaSalida.getAnio());
    }


}

