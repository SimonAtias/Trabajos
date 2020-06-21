package restaurante;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Date;

public class Pedido {

    private ArrayList<Plato> platos;
    private int idPedido;
    private boolean entregado;
    private Mesa mesa;

    Pedido(int id, Mesa mesaX, ArrayList<Plato> platosPedidos){
        this.idPedido=id;
        this.mesa=mesaX;
        platos = new ArrayList<>();
        this.platos.addAll(platosPedidos);
    }

    Pedido(){
        ArrayList<Plato> platos;
        int idPedido;
        boolean entregado;
        Mesa mesa = new Mesa();
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setEntregado() {
        this.entregado = !this.entregado;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }


    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }


    public void printPlatos(){
        for (Plato p : platos){
            System.out.println(p.getNombre());
        }
    }

}
