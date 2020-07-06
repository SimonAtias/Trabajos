package mascotas;

import personas.Persona;

public class Pajaro extends Mascota {

    String saludo;
    int alegria;

    public Pajaro(){
        this.saludo="pio";
        this.nombre="";
        this.tipo="Pajaro";
        alegria=1;
    }

    public Pajaro(String name, Persona duenio){
        super(name, "Pajaro", duenio);
        saludo="pio";
        alegria=1;
    }

    @Override
    public void imprimirSaludo(Persona p){
        if(p==this.duenio){
            for(int i=alegria; i>0; i--){
                System.out.println(saludo);
            }
        }
        else{
            System.out.println("...");
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
