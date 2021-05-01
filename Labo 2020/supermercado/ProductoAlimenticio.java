package supermercado;
import multiuso.Fecha;

public class ProductoAlimenticio {

    private int idProducto;
    private String nombre;
    private int precio;
    private Fecha fechaElaboracion = new Fecha();
    private Fecha fechaVencimiento = new Fecha();
    private int peso;
    private int stock;

    ProductoAlimenticio (int id) {
        this.idProducto=id;
        this.nombre="";
        this.precio=0;
        this.fechaElaboracion.setDia(0);
        this.fechaElaboracion.setMes(0);
        this.fechaElaboracion.setAnio(0);
        this.fechaVencimiento.setDia(0);
        this.fechaVencimiento.setMes(0);
        this.fechaVencimiento.setAnio(0);
        this.peso=0;
        this.stock=0;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public int getStock() {
        return this.stock;
    }

    public int getPeso() {
        return this.peso;
    }

    public int getPrecio() {
        return this.precio;
    }

    public Fecha getFechaElaboracion() {
        return this.fechaElaboracion;
    }

    public Fecha getFechaVencimiento() {
        return this.fechaVencimiento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setFechaVencimiento(int d, int m, int a) {
        this.fechaVencimiento.setAnio(a);
        this.fechaVencimiento.setMes(m);
        this.fechaVencimiento.setAnio(a);
    }

    public void setFechaElaboracion(int d, int m, int a) {
        this.fechaElaboracion.setAnio(a);
        this.fechaElaboracion.setMes(m);
        this.fechaElaboracion.setAnio(a);
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Boolean pesoMayor5(){
        if(this.peso>5){
            return true;
        }
        else{
            return false;
        }
    }

    public Boolean vencido(){
        return fechaVencimiento.posterior();
    }


}
