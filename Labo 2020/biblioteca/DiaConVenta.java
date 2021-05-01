package biblioteca;

import java.util.HashSet;

public enum DiaConVenta {

    Domingo("Domingo"),Lunes("Lunes"),Martes("Martes"),Miercoles("Miercoles"),Jueves("Jueves"),Viernes("Viernes"),Sabado("Sabado");

    private String dia;
    private HashSet<Venta> ventas;

    private DiaConVenta(String d){
        this.dia=d;
        ventas = new HashSet<>();
    }

    public HashSet<Venta> getVentas() {
        return ventas;
    }

    public String getDia() {
        return dia;
    }

    public void printVentas(){
        System.out.println(this.dia);
        for(Venta v: ventas){
            for(Libro l: v.getLibrosComprados()){
                System.out.println(l.getNombre());
            }
        }
    }

}
