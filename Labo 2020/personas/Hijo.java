package personas;

public class Hijo extends Persona{

    private String escuela;
    private String juegoFavorito;

    public Hijo(String nombreX, int edadX, int dniX, String escuelaX, String juegoFavX){
        super(nombreX, edadX, dniX);
        this.escuela=escuelaX;
        this.juegoFavorito=juegoFavX;
    }

    public Hijo(){
        super();
        this.escuela="ipm";
        this.juegoFavorito="monopoly";
    }

    public String getEscuela() {
        return escuela;
    }

    public String getJuegoFavorito() {
        return juegoFavorito;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public void setJuegoFavorito(String juegoFavorito) {
        this.juegoFavorito = juegoFavorito;
    }



}
