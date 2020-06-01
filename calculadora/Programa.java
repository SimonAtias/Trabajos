package calculadora;
import java.util.ArrayList;

public class Programa {
    ArrayList<Rutina> listaRutinas;

    //constructor
    public Programa() {
        this.listaRutinas = new ArrayList<>();
    }

    //getters y setters
    public ArrayList<Rutina> getRutinas() {
        return listaRutinas;
    }

    public void setListaRutinas(ArrayList<Rutina> listaRutinas) {
        this.listaRutinas = listaRutinas;
    }

    public ArrayList<Rutina> getListaRutinas() {
        return listaRutinas;
    }

    public void setRutinas(ArrayList<Rutina> rutinas) {
        this.listaRutinas = rutinas;
    }

    //metodos
    public void agregarInstruccion(String nombreDeRutina, Instruccion nuevaInstruccion) {
        if(listaRutinas.size()==0){
            Rutina nuevaRutina=new Rutina(nombreDeRutina);
            nuevaRutina.getInstrucciones().add(nuevaInstruccion);
            listaRutinas.add(nuevaRutina);
        }
        else{
            for (int i=0; i<listaRutinas.size();i++){
                Rutina rutinaActual=listaRutinas.get(i);
                if(rutinaActual.getNombre().equals(nombreDeRutina)){
                    rutinaActual.getInstrucciones().add(nuevaInstruccion);
                }
                else if(rutinaActual.equals(listaRutinas.get(listaRutinas.size()-1))){
                    Rutina nuevaRutina=new Rutina(nombreDeRutina);
                    nuevaRutina.getInstrucciones().add(nuevaInstruccion);
                    listaRutinas.add(nuevaRutina);
                }
            }
        }

    }
}
