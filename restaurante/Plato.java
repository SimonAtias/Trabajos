package restaurante;

public class Plato {

    private String nombre;
    private int precio;
    private int vecesPedidoPorDia;

    Plato(){
        nombre="Fideos";
        precio=150;
        vecesPedidoPorDia=0;
    }

    Plato(String nombreX, int precioX, int pedidos){
        this.nombre=nombreX;
        this.precio=precioX;
        this.vecesPedidoPorDia=pedidos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getVecesPedido() {
        return vecesPedidoPorDia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVecesPedido(int vecesPedido) {
        this.vecesPedidoPorDia = vecesPedido;
    }

}
