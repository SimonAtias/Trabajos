package restaurante;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Date;

public class Pedido {

    private ArrayList<Plato> platos = new ArrayList<>();
    private int idPedido;
    private boolean entregado;
    private Mesa mesa;

    // No hice un constructor de pedidos sin parametro porque no se cual seria la utilidad
    Pedido(int id, Mesa mesaX, ArrayList<Plato> platosPedidos){
        this.idPedido=id;
        this.mesa=mesaX;
        this.platos.addAll(platosPedidos);
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
