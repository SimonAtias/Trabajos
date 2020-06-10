package biblioteca;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Date;
import java.util.Map;

public class Biblioteca {

    public void agregarEditorial(HashSet<String> editoriales, String editorial){
        editoriales.add(editorial);
    }

    public static void main(String[] args) {

        HashMap<String, Integer> ventas = new HashMap<String, Integer>();
        Libro l1 = new Libro("Tormenta de Espadas", 1800, 3515, 7,"Interzona");
        HashSet<String> editorialesConDescuento = new HashSet<>();

    }
}