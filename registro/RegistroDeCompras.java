import java.util.Scanner;

public class RegistroDeCompras {
    public int precio;
    public String nombre;
    public String marca;
    public int unidades;

    RegistroDeCompras(){
        this.precio = 0;
        this.nombre = " ";
        this.marca = " ";
        this.unidades = 0;
    }

    public void inserts(){
        Scanner ingreso = new Scanner(System.in);
        this.precio = ingreso.nextInt();
        String saltoLinea=ingreso.nextLine();
        this.nombre = ingreso.nextLine();
        this.marca = ingreso.nextLine();
        this.unidades = ingreso.nextInt();
        saltoLinea=ingreso.nextLine();
    }

    public void mostrar(){
        System.out.println(this.precio);
        System.out.println(this.nombre);
        System.out.println(this.marca);
        System.out.println(this.unidades);
    }

}
