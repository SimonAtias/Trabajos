package biblioteca;

import personas.Persona;

import java.util.HashMap;

public class Cliente extends Persona {

    private int idCliente;
    private HashMap<Libro, Integer> compras = new HashMap<Libro, Integer>();

    public HashMap<Libro, Integer> getVenta() {
        return compras;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setVenta(HashMap<Libro, Integer> venta) {
        this.compras = venta;
    }

}
