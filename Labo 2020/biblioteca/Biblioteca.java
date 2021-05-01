package biblioteca;

import java.util.*;

public class Biblioteca {

    public void agregarEditorial(HashSet<String> editoriales, String editorial){
        editoriales.add(editorial);
    }

    public void printLibrosPorDia(ArrayList<DiaConVenta> semana){
        for(DiaConVenta d: semana){
            d.printVentas();
        }
    }

    public static void main(String[] args) {

        HashMap<Editorial, Integer> ventas = new HashMap<>();
        Libro l1 = new Libro("Tormenta de Espadas", 1800, 3515, 7,Editorial.interzona);
        HashSet<String> editorialesConDescuento = new HashSet<>();
        ArrayList<DiaConVenta> ventasSemanales = new ArrayList<>();
        ventasSemanales.add(DiaConVenta.Domingo);
        ventasSemanales.add(DiaConVenta.Lunes);
        ventasSemanales.add(DiaConVenta.Martes);
        ventasSemanales.add(DiaConVenta.Miercoles);
        ventasSemanales.add(DiaConVenta.Jueves);
        ventasSemanales.add(DiaConVenta.Viernes);
        ventasSemanales.add(DiaConVenta.Sabado);

    }
}