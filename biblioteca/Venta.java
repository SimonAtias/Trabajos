package biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;

public class Venta {

    private ArrayList<Libro> librosComprados;
    private Cliente comprador;
    private Date fecha;

    public Venta(){
        this.librosComprados=new ArrayList<>();
        this.comprador=new Cliente();
        this.fecha=new java.util.Date();
    }

    public Venta(Cliente c){
        this.librosComprados=new ArrayList<>();
        this.comprador=c;
        this.fecha=new java.util.Date();
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public ArrayList<Libro> getLibrosComprados() {
        return librosComprados;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public void setLibrosComprados(ArrayList<Libro> librosComprados) {
        this.librosComprados = librosComprados;
    }
}
