package hotel;
import multiuso.Fecha;

public class Huesped extends Persona{

    private String apellido;
    private Fecha fechaEntrada;
    private Fecha fechaSalida;
    private int vecesHospedado;

    public Huesped(){
        super("",0,0);
        this.apellido = "";
        this.fechaEntrada = new Fecha();
        this.fechaSalida = new Fecha();
        vecesHospedado = 0;
    }

    public Huesped(String nombre, int edad, int dni){
        super(nombre, edad, dni);
        this.apellido = "";
        this.fechaEntrada = new Fecha();
        this.fechaSalida = new Fecha();
        vecesHospedado = 0;
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

    public void setApellido(String apellido) {
        this.apellido = apellido;
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



    // No hay un loop recorriendo un arreglo, asi que no se puede hacer un For Each
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
        System.out.println("El hospedaje de" + this.getNombre() + " es del " + this.fechaEntrada.getDia() + "/" + this.fechaEntrada.getMes() + "/" + this.fechaEntrada.getAnio() + " hasta " + this.fechaSalida.getDia() +"/"+this.fechaSalida.getMes() + "/" + this.fechaSalida.getAnio());
    }


}

