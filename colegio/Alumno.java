package colegio;

import personas.Persona;

import java.util.HashMap;
import java.util.Map;

public class Alumno extends Persona {

    private HashMap<Materia, Float> materiaYPromedio;

    public HashMap<Materia, Float> getMateriaYPromedio() {
        return materiaYPromedio;
    }

    public void setMateriaYPromedio(HashMap<Materia, Float> materiaYPromedio) {
        this.materiaYPromedio = materiaYPromedio;
    }

    public Float getPromedioFinal(){
        int cantMaterias=0;
        Float promedio= 0.0f;
        for(Map.Entry<Materia, Float> nota: materiaYPromedio.entrySet()){
            promedio+=nota.getValue();
            cantMaterias++;
        }
        return promedio;
    }

    public Float getPromedioMateria(Materia mat){
        for(Map.Entry<Materia, Float> nota: materiaYPromedio.entrySet()){
            if(nota.getKey()==mat){
                return nota.getValue();
            }
        }
        return -1.0f;
    }

    public void agregarMateria(Materia mat, Float avg){
        materiaYPromedio.put(mat, avg);
    }

    public float getMayorNota(){
        Float mayor = 1.0f;
        for(Map.Entry<Materia, Float> nota: this.materiaYPromedio.entrySet()){
            if(mayor < nota.getValue()){
                mayor=nota.getValue();
            }
        }
        return mayor;
    }

    public float getMenorNota(){
        Float menor = 1.0f;
        for(Map.Entry<Materia, Float> nota: this.materiaYPromedio.entrySet()){
            if(menor > nota.getValue()){
                menor=nota.getValue();
            }
        }
        return menor;
    }

}
