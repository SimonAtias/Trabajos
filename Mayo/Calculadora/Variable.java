

public class Variable {
    private String nombre;
    private int valor;

    //constructores
    public Variable(String nombre){
        this.nombre = nombre;
    }
    public Variable(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public int getValor() {
        return valor;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
}