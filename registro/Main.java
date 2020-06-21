package registro;
public class Main {
    public static void main(String[] args) {

        RegistroDeDatos rdd1= new RegistroDeDatos();
        RegistroDeCompras rdc1= new RegistroDeCompras();
        
        rdd1.inserts();
        rdd1.mostrar();
        rdc1.inserts();
        rdc1.mostrar();

    }
}
