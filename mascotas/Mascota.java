package mascotas;

import personas.Persona;

public class Mascota {

    String nombre;
    String tipo;
    Persona duenio;

    public Mascota(){
        nombre="";
        tipo="indefinido";
        duenio = new Persona();
    }

    public Mascota(String n, String t, Persona p){
        nombre=n;
        tipo=t;
        duenio=p;
    }

    public void imprimirSaludo(Persona p){
        System.out.println("No hay saludo, negry");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public String getTipo() {
        return tipo;
    }

    public void alimentar(){
        System.out.println("Error");
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}

