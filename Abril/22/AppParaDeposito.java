import java.util.Scanner;

public class AppParaDeposito {
    public static void main(String[] args) {

        Scanner ingreso = new Scanner(System.in);

        Deposito deposito = new Deposito(1);

        int rta = 0;

        int id = 1; //Creo un id que se va a ir constantemente incrementando para hacer que los id de los productos en un deposito sean autoincrementables

        int n = 0;

        String palabra = "";

        String saltoLinea = "";

        ProductoAlimenticio p = new ProductoAlimenticio(0);
        p.setNombre("serenito");
        p.setPeso(90);
        p.setPrecio(60);
        p.setFechaElaboracion("2020-01-15");
        p.setFechaVencimiento("2020-12-20");
        p.setStock(0);
        deposito.agregarProducto(p);


        while (true) {

            System.out.println("Que desea hacer?");
            System.out.println("1. Ingresar producto");
            System.out.println("2. Dar de baja un producto (ingresando id)");
            System.out.println("3. Mostrar los productos sin stock");
            System.out.println("4. Mostrar stock de un producto especifico (por nombre)");
            System.out.println("5. Mostrar los productos con menos de 15 de stock");

            rta = ingreso.nextInt();
            saltoLinea = ingreso.nextLine();

            if (rta > 0 && rta < 6) {
                switch (rta) {
                    case 1:
                        ProductoAlimenticio nuevo= new ProductoAlimenticio(id);
                        id++;
                        deposito.ingresarProducto(nuevo);
                        break;
                    case 2:
                        n = ingreso.nextInt();
                        saltoLinea = ingreso.nextLine();
                        deposito.removeProduct(n);
                        break;
                    case 3:
                        deposito.printNoStock();
                        break;
                    case 4:
                        palabra = ingreso.nextLine();
                        System.out.println(deposito.getStockXNombre(palabra));
                        break;
                    case 5:
                        deposito.printMenosDe15();
                        break;
                }
            }
        }
    }
}
