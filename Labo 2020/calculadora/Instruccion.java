package calculadora;

public class Instruccion {

    private String operacionHacer;

    public Instruccion(){
        this.operacionHacer = "";
    }

    public Instruccion(String operacionHacer){
        this.operacionHacer=operacionHacer;
    }

    //getters y setters
    public void setOperacionHacer(String operacionHacer) {
        this.operacionHacer = operacionHacer;
    }

    public String getOperacionHacer() {
        return operacionHacer;
    }

    public Object getParametro(){
        return "";
    }


}
