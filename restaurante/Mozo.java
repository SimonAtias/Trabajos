package restaurante;

import java.util.HashSet;

public class Mozo {

    private HashSet<Pedido> pedidosDiarios = new HashSet<>();
    private String nombre;
    private int dni;

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

}
