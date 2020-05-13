

import java.util.ArrayList;

public class Programa {
    private ArrayList<Instruccion> rutinas;

    //constructores
    public Programa() {
        this.rutinas = new ArrayList<>();
    }
    //getters y setters
    public ArrayList<Instruccion> getRutinas() {
        return rutinas;
    }
    public void setRutinas(ArrayList<Instruccion> rutinas) {
        this.rutinas = rutinas;
    }
    //metodos
    public void agregarInstruccion(String nombreDeRutina, Instruccion nuevaInstruccion){
        nuevaInstruccion.setRutinaPertenece(nombreDeRutina);
        rutinas.add(nuevaInstruccion);
    }
}
