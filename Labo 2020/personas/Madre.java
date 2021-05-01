package personas;

import java.util.HashSet;

public class Madre extends Persona{

    private String empresa;
    private HashSet<Hijo> hijos;

    public Madre(){
        super();
        this.hijos = new HashSet<>();
        this.empresa = "";
    }

    public Madre(String nombreX, int edadX, int dniX, String empresaX){
        super(nombreX, edadX, dniX);
        this.empresa=empresaX;
        hijos = new HashSet<>();
    }

    public void agregarHijo(Hijo h){
        hijos.add(h);
    }

    public HashSet<Hijo> menoresDeEdad(){
        HashSet<Hijo> menores = new HashSet<>();
        for( Hijo h : this.hijos ){
            if(h.getEdad()<18){
                menores.add(h);
            }
        }
        return menores;
    }

    public HashSet<Hijo> getHijos() {
        return hijos;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setHijos(HashSet<Hijo> hijos) {
        this.hijos = hijos;
    }

}
