package calculadora;
import java.util.ArrayList;

public class Rutina {
    private String nombre;
    private ArrayList<Instruccion> instrucciones;
    //constructor
    public Rutina(String nombre){
        this.nombre=nombre;
        this.instrucciones=new ArrayList<>();
    }
    //getters y setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInstrucciones(ArrayList<Instruccion> instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Instruccion> getInstrucciones() {
        return instrucciones;
    }
}
