import java.util.Scanner;

public class RegistroDeDatos {
    public String nombre;
    public String apellido;
    public int edad;
    public String ocupacion;

    RegistroDeDatos(){
        this.nombre = " ";
        this.apellido = " ";
        this.edad = 0;
        this.ocupacion = " ";
    }

    public void inserts(){
        Scanner ingreso = new Scanner(System.in);
        this.apellido = ingreso.nextLine();
        this.nombre = ingreso.nextLine();
        this.edad = ingreso.nextInt();
        String saltoLinea=ingreso.nextLine();
        this.ocupacion = ingreso.nextLine();
    }

    public void mostrar(){
        System.out.println(this.apellido);
        System.out.println(this.nombre);
        System.out.println(this.edad);
        System.out.println(this.ocupacion);
    }
}