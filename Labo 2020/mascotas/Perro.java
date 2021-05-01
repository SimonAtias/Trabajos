package mascotas;

import personas.Persona;

public class Perro extends Mascota {

    String saludo;
    int alegria;

    Perro(){
        this.saludo="guau";
        this.nombre="";
        this.tipo="Perro";
        alegria=1;
    }

    Perro(String name, Persona duenio){
        super(name,"Perro", duenio);
        this.saludo="guau";
        alegria=1;
    }

    @Override
    public void imprimirSaludo(Persona p){
        if(p==this.duenio){
            String saludoADuenio=saludo.toUpperCase();
            for(int i=alegria; i>0; i--){
                System.out.println(saludoADuenio.concat("!"));
            }
        }
        else{
            for(int i=alegria; i>0; i--){
                System.out.println(saludo);
            }
        }
    }

    public String getSaludo() {
        return saludo;
    }

    @Override
    public void alimentar(){
        this.alegria+=1;
    }

}
