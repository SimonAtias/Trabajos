public class ProductoAlimenticio {

    private int idProducto;
    private String nombre;
    private int precio;
    private String fechaElaboracion;
    private String fechaVencimiento;
    private int peso;
    private int stock;

    ProductoAlimenticio (int id) {
        this.idProducto=id;
        this.nombre="";
        this.precio=0;
        this.fechaElaboracion="";
        this.fechaVencimiento="";
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

    public String getFechaElaboracion() {
        return this.fechaElaboracion;
    }

    public String getFechaVencimiento() {
        return this.fechaVencimiento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setFechaElaboracion(String fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
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


}
