
import java.util.ArrayList;

public class Calculadora {
    private ArrayList<Integer> pila;
    private Programa programa;
    private ArrayList<Variable> memoria;


    //constructores
    public Calculadora() {
        this.pila = new ArrayList<>();
        this.memoria = new ArrayList<>();
    }



    //getters y setters
    public ArrayList<Integer> getPila() {
        return pila;
    }

    public void setPila(ArrayList<Integer> pila) {
        this.pila = pila;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public ArrayList<Variable> getMemoria() {
        return memoria;
    }

    public void setMemoria(ArrayList<Variable> memoria) {
        this.memoria = memoria;
    }



    //metodos
    public boolean rutinaEnPrograma(String rutina){
        for(Instruccion posActual : programa.getRutinas()){
            if(posActual.getRutinaPertenece() == rutina){
                return true;
            }
        }
        return false;
    }

    public void elegirOperacionHacer(Instruccion instruccion){
        switch (instruccion.getOperacionHacer()){
            case "PUSH": push(instruccion.getParametroNumerico());
                break;
            case "ADD": push(add());
                break;
            case "MUL": push(mul());
                break;
            case "SUB": push(sub());
                break;
            case "WRITE":
                    Variable var = variableEnMemoria(instruccion.getNombreVariable());
                    if(var == null){
                        System.out.println("Error, la variable indicada no fue inicializada en memoria");
                    }
                    else{
                        write(var);
                     }
                break;
            case "READ":
                    Variable vari = variableEnMemoria(instruccion.getNombreVariable());
                    if(vari == null){
                        System.out.println("Error, la variable indicada no fue inicializada en memoria");
                     }
                    else{
                        read(vari);
                    }
                break;
            default: System.out.println("Error, operacion no valida.");
                break;
        }
    }

    public void cargarPrograma(Programa p){
        this.programa = p;
    }

    public void ejecutar(String rutinaEjecutar){
        if( rutinaEnPrograma(rutinaEjecutar) ){
            for(Instruccion posActual : programa.getRutinas()){
                if(posActual.getRutinaPertenece() == rutinaEjecutar){
                    elegirOperacionHacer(posActual);
                }
            }
        }
        else{
            System.out.println(programa.getRutinas() + "-" + rutinaEjecutar);
            System.out.println("Error, la rutina ingresada no existe.");
        }
    }

    public ArrayList<Integer> conseguirtopeDeLaPila(){//agarramos los 2 primeros valores de la fila y los retornamos si existen
        ArrayList<Integer> topeDePila = new ArrayList<>();
        if(pila.size() == 0){
            topeDePila.add(0);//retorno 2 ceros xq esta vacio la pila
            topeDePila.add(0);
        }
        else if(pila.size() == 1){
            topeDePila.add( pila.get(0) );
            topeDePila.add(0);
        }
        else{
            topeDePila.add( pila.get( pila.size()-1 ) );
            topeDePila.add( pila.get( pila.size()-2 ) );
        }
        return topeDePila;
    }

    public Variable variableEnMemoria(String nombreVar){
        for (Variable posActual : memoria) {
            if(posActual.getNombre().equals(nombreVar)) return posActual;
        }
        return null;//forma de saber si no la encuentra
    }



    //metodos-operaciones
    public int add(){//hacer comprovacion afuera
        int numero1 = conseguirtopeDeLaPila().get(0);
        int numero2 = conseguirtopeDeLaPila().get(1);
        return numero1 + numero2;
    }

    public void push(int valorPushear){
        pila.add(valorPushear);//comprobar validez
    }
    public int sub(){
        int numero1 = conseguirtopeDeLaPila().get(0);
        int numero2 = conseguirtopeDeLaPila().get(1);
        return numero1 - numero2;
    }

    public int mul(){
        int numero1 = conseguirtopeDeLaPila().get(0);
        int numero2 = conseguirtopeDeLaPila().get(1);
        return numero1 * numero2;
    }

    public void write(Variable variableRecibida){
        int numero1 = conseguirtopeDeLaPila().get(0);
        variableRecibida.setValor(numero1);
    }

    public void read(Variable variableRecibida){
        if(memoria.contains(variableRecibida)){
            pila.add(variableRecibida.getValor());
        }
        else{
            pila.add(0);
        }
    }



    public static void main(String[] args) {
        Programa p = new Programa();

        p.agregarInstruccion("rutinaA", new Instruccion("PUSH", 2));
        p.agregarInstruccion("rutinaA", new Instruccion("PUSH", 2));
        p.agregarInstruccion("rutinaA", new Instruccion("PUSH", 2));

        Calculadora calc = new Calculadora();
        calc.cargarPrograma(p);
        calc.ejecutar("rutinaA");
    }
}
