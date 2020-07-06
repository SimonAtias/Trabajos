package calculadora;
import java.util.ArrayList;

/*
 * los nombres de paquetes deben escribirse sin ninguna mayúscula
 * y se debe evitar colocarle más de una palabra. 
 * 
 */

/*Preguntas
* en el momento de probarlo, deberia crear y agregar esas variables en memoria no?
* Si, pero podrían agregar más casos para verificar el correcto funcionamiento
* de los métodos.
*/
public class Calculadora {
    private ArrayList<Integer> pila;
    private ArrayList<Variable> memoria;
    private Programa programa;

    //constructor
    public Calculadora(){
        this.memoria=new ArrayList<>();
        this.pila=new ArrayList<>();
    }

    //getters y setters
    public void setPila(ArrayList<Integer> pila) {
        this.pila = pila;
    }

    public void setMemoria(ArrayList<Variable> memoria) {
        this.memoria = memoria;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public ArrayList<Integer> getPila() {
        return pila;
    }

    public ArrayList<Variable> getMemoria() {
        return memoria;
    }

    public Programa getPrograma() {
        return programa;
    }

    //metodos

    public boolean rutinaEnPrograma(String rutina){
        for(Rutina rutinaActual : programa.listaRutinas){
            if(rutinaActual.getNombre().equals(rutina)){
                return true;
            }
        }
        return false;
    }

    public Variable variableEnMemoria(String nombreVar){
        for (Variable variableActual: memoria) {
            if(variableActual.getNombre().equals(nombreVar)) {
                return variableActual;
            }
        }
        return null;
    }

    public void cargarPrograma(Programa p){
        this.programa=p;
    }

    public ArrayList<Integer> conseguirTopeDeLaPila(){
        ArrayList<Integer>topeDePila=new ArrayList<>();
        if(pila.size()==0){
            topeDePila.add(0);
            topeDePila.add(0);
        }
        else if(pila.size()==1){
            topeDePila.add(pila.get(0));
            topeDePila.add(0);
        }
        else{
            topeDePila.add(pila.get(pila.size()-1));
            topeDePila.add(pila.get(pila.size()-2));
        }
        return topeDePila;
    }

    public int add(){
        int numero1=conseguirTopeDeLaPila().get(0);
        int numero2=conseguirTopeDeLaPila().get(1);
        return numero1 + numero2;
    }

    public void push(int variablePushear){
        pila.add(variablePushear);
    }

    public int sub(){
        int numero1=conseguirTopeDeLaPila().get(0);
        int numero2=conseguirTopeDeLaPila().get(1);
        return numero1 - numero2;
    }

    public int mul(){
        int numero1=conseguirTopeDeLaPila().get(0);
        int numero2=conseguirTopeDeLaPila().get(1);
        return numero1 * numero2;
    }

    public void write(Variable variableRecibida){
        int numero1=conseguirTopeDeLaPila().get(0);
        variableRecibida.setValor(numero1);

    }

    public void read(Variable variableRecibida){
        pila.add(variableRecibida.getValor());
    }

    public void elegirOperacionEjecutar(Instruccion instruccion){
        switch (instruccion.getOperacionHacer()){
            case "PUSH":
                push((Integer) instruccion.getParametro());
                break;
            case "ADD":
                push(add());
                break;
            case "SUB":
                push(sub());
                break;
            case "MUL":
                push(mul());
                break;
            case "WRITE":
                Variable variableEscribir=variableEnMemoria((String) instruccion.getParametro());
                if(variableEscribir!=null){
                    write(variableEscribir);
                }
                else {
                    System.out.println("Error, la variable indicada no fue inicializada en memoria");
                }
                break;
            case "READ":
                Variable variableLeer=variableEnMemoria((String) instruccion.getParametro());
                if(variableLeer!=null){
                    read(variableLeer);
                }
                else {
                    System.out.println("Error, la variable indicada no fue inicializada en memoria");
                    pila.add(0);
                }
                break;
            default:
                System.out.println("Operacion invalida");
                break;
        }
    }

    public void ejecutar(String nombreRutina){//busco segun la rutina y ejecuto todas las instrucciones
        if(rutinaEnPrograma(nombreRutina) ){
            for(Rutina rutinaActual : programa.listaRutinas){
                if(rutinaActual.getNombre().equals(nombreRutina)){
                    for (Instruccion instruccionActual:rutinaActual.getInstrucciones()) {
                        elegirOperacionEjecutar(instruccionActual);
                    }
                }
            }
            System.out.println("Ejecucion terminada");
        }
        else{
            System.out.println(programa.getRutinas() + "-" + nombreRutina);
            System.out.println("Error, la rutina ingresada no existe.");
        }

    }

    public static void main(String[] args) {
        Programa p = new Programa();

        p.agregarInstruccion("rutinaA", new InstruccionConNumero("PUSH", 2));
        p.agregarInstruccion("rutinaA", new Instruccion("ADD"));
        p.agregarInstruccion("rutinaA", new InstruccionConVariable("WRITE", "y"));
        p.agregarInstruccion("rutinaA", new InstruccionConVariable("READ", "x"));
        p.agregarInstruccion("rutinaB", new InstruccionConVariable("READ", "x"));
        p.agregarInstruccion("rutinaB", new Instruccion("MUL"));
        p.agregarInstruccion("rutinaB", new InstruccionConVariable("WRITE", "x"));
        p.agregarInstruccion("rutinaB", new InstruccionConNumero("PUSH", 2));

        Calculadora calc = new Calculadora();
        calc.cargarPrograma(p);

        calc.pila.add(4);
        Variable variableNueva=new Variable("y",2);
        Variable variableNueva2=new Variable("x",2);
        calc.memoria.add(variableNueva);
        calc.memoria.add(variableNueva2);
        
        calc.ejecutar("rutinaB");
    }
    
     /*
    Muy buenos trabajos! Felicitaciones!
    Recordar:
    
    - aplicar el concepto de alta cohesión.

    - colocar nombres de empaquetamiento declarativos.
    La idea es crear nuestra propia librería de clases y las
    mismas deben estar empaquetadas correctamente.

     */
}


