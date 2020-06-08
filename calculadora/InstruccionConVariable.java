package calculadora;

public class InstruccionConVariable extends Instruccion {

    private String nombreVariable;

    public InstruccionConVariable(String operacionHacer, String nombreVariable) {
        super();
        this.nombreVariable = nombreVariable;
    }

    public String getNombreVariable() {
        return nombreVariable;
    }

    public void setNombreVariableVariable(String nombreVariable) {
        this.nombreVariable = nombreVariable;
    }

}
