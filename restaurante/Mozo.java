package restaurante;

import java.util.HashSet;

public class Mozo {

    private HashSet<Pedido> pedidosDiarios;
    private String nombre;
    private int dni;

    Mozo(String n, int doc){
        this.pedidosDiarios = new HashSet<>();
        this.nombre=n;
        this.dni=doc;
    }

    Mozo(){
        this.pedidosDiarios = new HashSet<>();
        nombre="Fulano Jaimito Magoya";
        dni=1000000;
    }

    public String getNombre() {
        return nombre;
    }

    public HashSet<Pedido> getPedidosDiarios() {
        return pedidosDiarios;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPedidosDiarios(HashSet<Pedido> pedidosDiarios) {
        this.pedidosDiarios = pedidosDiarios;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void addPedido(Pedido p){
        this.pedidosDiarios.add(p);
    }

}
