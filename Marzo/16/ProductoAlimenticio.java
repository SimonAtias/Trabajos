
        /*
2) Crear la clase ProductoAlimenticio:
        Atributos:
        nombre, precio, fecha de elaboración, fecha de vencimiento y peso
        Métodos:
        * método que retorne true si el producto supera los 5 kg de peso
        * método que retorne true si ya está vencido (pasar fecha actual como parámetro)
        * getters y setters
        */

public class ProductoAlimenticio {

    private String nombre;
    private int precio;
    private String fechaElaboracion;
    private String fechaVencimiento;
    private int peso;



    public int getPeso() {
        return peso;
    }

    public int getPrecio() {
        return precio;
    }

    public String getFechaElaboracion() {
        return fechaElaboracion;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getNombre() {
        return nombre;
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

    public Boolean pesoMayOr5(){
        if(this.peso>5){
            return true;
        }
        else{
            return false;
        }
    }

}
