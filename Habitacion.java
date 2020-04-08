import java.util.ArrayList;

public class Habitacion {

    private int numero;
    private int solicitudes;
    private int capacidad;
    private int precioPorDia;
    private Persona huesped;
    private boolean ocupada;

    Habitacion(int capacidadX){
        if(capacidadX == 1){
            capacidad=capacidadX;
            precioPorDia=545;
        }
        else if(capacidadX == 2){
            capacidad=capacidadX;
            precioPorDia=785;
        }
    }


    private int sacarParametroDelMayor(ArrayList<Habitacion> gente){
        int i=1;
        int parameter = i;
        int mayor=gente.get(0).getSolicitudes();
        while(i<gente.size()){
            if(gente.get(i).getSolicitudes()>mayor){
                mayor = gente.get(i).getSolicitudes();
                parameter=i;
            }
            i++;
        }
        return parameter;
    }

    void printNumeroHab(){
        System.out.println(this.numero);
    }

    public void setHuesped(Persona huesped) {
        this.huesped = huesped;
    }

    public Persona getHuesped() {
        return huesped;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public int getTiempo() {
        return this.huesped.getCantDias();
    }

    public int getNumero() {
        return this.numero;
    }

    public int getPrecioPorDia() {
        return this.precioPorDia;
    }

    public int getSolicitudes() {
        return this.solicitudes;
    }

    public boolean getOcupada() {
        return this.ocupada;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public void setPrecioPorDia(int precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public void setSolicitudes(int solicitudes) {
        this.solicitudes = solicitudes;
    }

}

