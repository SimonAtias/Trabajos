package mascotas;

import personas.Persona;

public class Pez extends Mascota {

    int vidas;

    Pez(){
        this.vidas=10;
        this.nombre="";
        this.tipo="Pez";
    }

    Pez(String nom, Persona duenio){
        super(nom, "Pez", duenio);
        this.vidas=10;
    }

    public int getVidas() {
        return vidas;
    }

    public void saludar(Persona p){
        if(p!=this.duenio){
            vidas-=1;
        }
    }

    @Override
    public void alimentar(){
        vidas+=1;
    }

}
