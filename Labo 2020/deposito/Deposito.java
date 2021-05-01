package deposito;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Deposito {

    private ArrayList<ProductoAlimenticio> productos;
    private int idDeposito;

    Deposito (int id){
        this.idDeposito=id;
        this.productos= new ArrayList<>();
    }

    public void printProductos() {
        System.out.println("Los productos en este deposito son:");
        for ( ProductoAlimenticio p : this.productos){
            System.out.println(p);
        }
    }

    public ProductoAlimenticio getProductoPorId(int i) {
        return productos.get(i);
    }

    public int getIdDeposito() {
        return idDeposito;
    }

    // Metodo para agregar un producto al arreglo de productos del deposito
    public void agregarProducto (ProductoAlimenticio p) {
        this.productos.add(p);
    }

    // Metodo para ingresar un producto al arreglo de productos del deposito
    public void ingresarProducto (ProductoAlimenticio nuevo) {

        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese el nombre");

        String name = "";
        name = ingreso.nextLine();
        nuevo.setNombre(name);

        System.out.println("Ingrese el precio");

        int precio = 0;
        precio = ingreso.nextInt();
        ingreso.nextLine();
        nuevo.setPrecio(precio);

        System.out.println("Ingrese el peso");

        int peso = 0;
        peso = ingreso.nextInt();
        ingreso.nextLine();
        nuevo.setPeso(peso);

        System.out.println("Ingrese el stock");

        int stock = 0;
        stock = ingreso.nextInt();
        ingreso.nextLine();
        nuevo.setStock(stock);

        System.out.println("Ingrese la fecha de elaboracion");

        Fecha fechaElaboracion = new Fecha();
        int d = ingreso.nextInt();
        ingreso.nextLine();
        int m = ingreso.nextInt();
        ingreso.nextLine();
        int a = ingreso.nextInt();
        ingreso.nextLine();
        nuevo.setFechaElaboracion(d,m,a);

        System.out.println("Ingrese la fecha de vencimiento");

        Fecha fechaVencimiento = new Fecha();
        d = ingreso.nextInt();
        ingreso.nextLine();
        m = ingreso.nextInt();
        ingreso.nextLine();
        a = ingreso.nextInt();
        ingreso.nextLine();
        nuevo.setFechaVencimiento(d,m,a);

        this.productos.add(nuevo);

        System.out.println("Los productos fueron ingresados correctamente!");
    }

    // Metodo para sacar un producto del arreglo de productos. Mi idea original era hacerlo con un for each, pero la comunidad de stack overflow me recomendaba haerlo con iterador
    public void removeProduct (int id){
        for ( int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getIdProducto()==id){
                productos.remove(i);
            }
        }
    }

    // Metodo para imprimir los productos sin stock
    public void printNoStock () {
        boolean hay = false;
        for ( ProductoAlimenticio p : this.productos) {
            System.out.println("Imprimiendo productos sin stock ... ");
            if ( p.getStock() == 0){
                hay = true;
                System.out.println("id: " + p.getIdProducto());
                System.out.println("nombre: " + p.getNombre());
            }
        }
        if(!hay){
            System.out.println("No hay productos sin stock.");
        }
    }

    // Metodo para conseguir el stock de un producto con nombre
    public int getStockXNombre(String name) {
        boolean existe = false;
        for ( ProductoAlimenticio p : this.productos){
            if(p.getNombre().equals(name)) {
                existe=true;
                return p.getStock();
            }
        }
        if (!existe) {
            System.out.println("No se encontro producto con ese nombre");
        }
        return 0;
    }


    // Metodo para imprimir el ID de aquellos productos que tienen menos de 15 unidades
    public void printMenosDe15(){
        for ( ProductoAlimenticio p : this.productos) {
            System.out.println("Los productos con stock menor a 15 son los siguientes ...");
            if ( p.getStock() < 15) {
                System.out.println(p.getNombre());
            }
        }
    }

    public ArrayList<ProductoAlimenticio> getProductos() {
        return productos;
    }

    public void setIdDeposito(int idDeposito) {
        this.idDeposito = idDeposito;
    }

    public void setProductos(ArrayList<ProductoAlimenticio> productos) {
        this.productos = productos;
    }

}
