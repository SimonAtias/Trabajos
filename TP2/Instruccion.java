package calculadora;

public class Instruccion {
    private String operacionHacer;
    private int parametroNumerico;
    private String nombreVariable;

    //constructores
    public Instruccion(String operacionHacer, int parametroNumerico) {
        this.operacionHacer = operacionHacer;
        this.parametroNumerico = parametroNumerico;
    }

    public Instruccion(String operacionHacer, String nombreVariable) {
        this.operacionHacer = operacionHacer;
        this.nombreVariable = nombreVariable;
    }

    public Instruccion(String operacionHacer){
        this.operacionHacer=operacionHacer;
    }

    //getters y setters
    public void setOperacionHacer(String operacionHacer) {
        this.operacionHacer = operacionHacer;
    }

    public void setParametroNumerico(int parametroNumerico) {
        this.parametroNumerico = parametroNumerico;
    }

    public void setNombreVariableVariable(String nombreVariable) {
        this.nombreVariable = nombreVariable;
    }

    public String getOperacionHacer() {
        return operacionHacer;
    }

    public int getParametroNumerico() {
        return parametroNumerico;
    }

    public String getNombreVariable() {
        return nombreVariable;
    }
}
