
public class Instruccion {
    private String rutinaPertenece;
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
        this.operacionHacer = operacionHacer;
    }
    //getters y setters
    public String getRutinaPertenece() {
        return rutinaPertenece;
    }
    public void setRutinaPertenece(String rutinaPertenece) {
        this.rutinaPertenece = rutinaPertenece;
    }
    public String getOperacionHacer() {
        return operacionHacer;
    }
    public void setOperacionHacer(String operacionHacer) {
        this.operacionHacer = operacionHacer;
    }
    public int getParametroNumerico() {
        return parametroNumerico;
    }
    public void setParametroNumerico(int parametroNumerico) {
        this.parametroNumerico = parametroNumerico;
    }
    public String getNombreVariable() {
        return nombreVariable;
    }
    public void setNombreVariable(String parametroVariable) {
        this.nombreVariable = parametroVariable;
    }
}
