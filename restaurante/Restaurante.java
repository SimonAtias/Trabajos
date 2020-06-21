package restaurante;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Map;

public class Restaurante {

    private String direccion;
    private String nombreSede;
    private HashMap<Pedido, Mozo> pedidos;
    private HashSet<Mesa> mesas;
    private HashSet<Plato> platos;

    public String getDireccion() {
        return direccion;
    }

    public HashSet<Mesa> getMesas() {
        return mesas;
    }

    public HashSet<Plato> getPlatos() {
        return platos;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setPlatos(HashSet<Plato> platos) {
        this.platos = platos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMesas(HashSet<Mesa> mesas) {
        this.mesas = mesas;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    // Este metodo es opcional en caso de que haya algun error en el codigo que haya resultado en pedidos sin conclusion al finalizar el dia.
    public void nuevoDia(){
        pedidos.clear();
        for ( Mesa m : this.mesas){
            m.setOcupada(false);
        }
    }

    public void agregarPedido(Mesa mesaNueva, Mozo mozoAsignado, ArrayList<Plato> platosPedidos){
        Pedido nuevoPedido = new Pedido(pedidos.size()+1, mesaNueva, platosPedidos);
        this.pedidos.add(nuevoPedido);
    }

    public Plato masPedido(){
        int cantMayorDePedidos = 0;
        Plato platoConMasPedidos = new Plato();
        for( Plato p : platos){
            if(cantMayorDePedidos < p.getVecesPedido()){
                cantMayorDePedidos = p.getVecesPedido();
                platoConMasPedidos = p;
            }
        }
        return platoConMasPedidos;
    }

    public Plato menosPedido(){
        int cantMenorDePedidos = 0;
        Plato platoConMasPedidos = new Plato();
        for( Plato p : platos){
            if(cantMenorDePedidos > p.getVecesPedido()){
                cantMenorDePedidos = p.getVecesPedido();
                platoConMasPedidos = p;
            }
        }
        return platoConMasPedidos;
    }

    public void proximoPedido(){
        System.out.println(pedidos.get(0).getIdPedido());
        System.out.println(pedidos.get(0).getMesa());
        System.out.println(pedidos.get(0).getMozoAsignado().getNombre());
        pedidos.get(0).printPlatos();
    }

}
