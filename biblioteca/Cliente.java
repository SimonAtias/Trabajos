package biblioteca;

import personas.Persona;

import java.util.HashMap;

public class Cliente extends Persona {

    private int idCliente;
    private HashMap<Libro, Integer> venta = new HashMap<Libro, Integer>();

    public HashMap<Libro, Integer> getVenta() {
        return venta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setVenta(HashMap<Libro, Integer> venta) {
        this.venta = venta;
    }

}
