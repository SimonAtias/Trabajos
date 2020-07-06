package mascotas;

import personas.Persona;

public class Gato extends Mascota {

    String saludo;
    int alegria;

    public Gato(){
        this.saludo="miau";
        this.nombre="";
        this.tipo="Gato";
        alegria=1;
    }

    public Gato(String name, Persona duenio){
        super(name, "Gato", duenio);
        this.saludo="miau";
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

    public int getAlegria() {
        return alegria;
    }

    @Override
    public void alimentar(){
        this.alegria+=1;
    }

}
