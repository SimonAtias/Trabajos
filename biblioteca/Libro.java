package biblioteca;

public class Libro {

    private String nombre;
    private int precio;
    private int ISBN;
    private int ventas;
    private Editorial editorial;

    public Libro(){
        this.nombre = "";
        this.precio = 0;
        this.ISBN = 0;
        this.ventas = 0;
        this.editorial = Editorial.Atlantida;
    }

    public Libro(String name, int price, int isbn, int sales, Editorial editorialX){
        this.nombre=name;
        this.precio=price;
        this.ISBN=isbn;
        this.ventas=sales;
        this.editorial=editorialX;
    }

    public String getNombre() {
        return nombre;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

}
