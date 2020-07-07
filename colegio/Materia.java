package colegio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Materia {

    String nombre;
    HashMap<Alumno, Float> listaDeNotas;

    public String getNombre() {
        return nombre;
    }

    public HashMap<Alumno, Float> getListaDeNotas() {
        return listaDeNotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaDeNotas(HashMap<Alumno, Float> listaDeNotas) {
        this.listaDeNotas = listaDeNotas;
    }

    public float getMayorNota(){
        Float mayor = 1.0f;
        for(Map.Entry<Alumno, Float> nota: this.listaDeNotas.entrySet()){
            if(mayor < nota.getValue()){
                mayor=nota.getValue();
            }
        }
        return mayor;
    }

    public float getMenorNota(){
        Float menor = 1.0f;
        for(Map.Entry<Alumno, Float> nota: this.listaDeNotas.entrySet()){
            if(menor > nota.getValue()){
                menor=nota.getValue();
            }
        }
        return menor;
    }

    public void agregarNota(Map.Entry<Alumno, Float> notaAAgregar){
        listaDeNotas.put(notaAAgregar.getKey(), notaAAgregar.getValue());
    }

}
