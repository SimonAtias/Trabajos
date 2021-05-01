package calculadora;

public class InstruccionConNumero extends Instruccion {

    private int parametroNumerico;

    public InstruccionConNumero(String operacionHacer, int parametroNumerico) {
        super();
        this.parametroNumerico = parametroNumerico;
    }

    public void setParametroNumerico(int parametroNumerico) {
        this.parametroNumerico = parametroNumerico;
    }

    @Override
    public Object getParametro() {
        return parametroNumerico;
    }

}
