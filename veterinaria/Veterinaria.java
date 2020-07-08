package veterinaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Veterinaria {

    HashMap<Mascota, Integer> mascotasYVisitas = new HashMap<Mascota, Integer>();

    public HashMap<Mascota, Integer> getMascotasYVisitas() {
        return mascotasYVisitas;
    }

    public void setMascotasYVisitas(HashMap<Mascota, Integer> mascotasYVisitas) {
        this.mascotasYVisitas = mascotasYVisitas;
    }

    public HashSet<String> razasDePerroQueNoTenganAsistenciaPerfecta(){
        HashSet<String> razas = new HashSet<>();
        for(Map.Entry<Mascota, Integer> mYv: mascotasYVisitas.entrySet()){
            if(mYv.getKey().getClass()==Perro.class){
                if(!mYv.getKey().cumpleVisitasNecesariasDesdeNacimiento()){
                    Perro aux = (Perro) mYv.getKey();
                    razas.add(aux.getRaza());
                }
            }
        }
        return razas;
    }

    public Object animalConMejorAsistencia(){
        HashMap<Class, Integer> asistencia = new HashMap<Class, Integer>();
        asistencia.put(Perro.class, 0);
        asistencia.put(Gato.class, 0);
        asistencia.put(Tortuga.class, 0);
        for(Map.Entry<Mascota, Integer> mYv: mascotasYVisitas.entrySet()){
            if(mYv.getKey().cumplioVisitasNecesariasEsteAnio()){
                if(mYv.getKey().cumpleVisitasNecesariasDesdeNacimiento()){
                    asistencia.put(mYv.getClass(), asistencia.get(mYv.getClass())+1);
                }
            }
        }
        boolean in = true;
        Map.Entry<Class, Integer> mejorAsistencia = null;
        for(Map.Entry<Class, Integer> mYv: asistencia.entrySet()){
            if(in){
                mejorAsistencia = mYv;
                in = false;
            }
            else if(mYv.getValue()>mejorAsistencia.getValue()){
                mejorAsistencia = mYv;
            }
        }
        return mejorAsistencia;
    }

}
