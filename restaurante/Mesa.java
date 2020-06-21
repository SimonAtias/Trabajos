package restaurante;

public class Mesa {

    private int numero;
    private boolean ocupada;
    private boolean disponible;
    private int tamanioEnPersonas;
    private String lugar;
    private int vecesOcupada;

    public int getNumero() {
        return numero;
    }

    public int getTamanioEnPersonas() {
        return tamanioEnPersonas;
    }

    public String getLugar() {
        return lugar;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public void setTamanioEnPersonas(int tamanioEnPersonas) {
        this.tamanioEnPersonas = tamanioEnPersonas;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getVecesOcupada() {
        return vecesOcupada;
    }

    public void setVecesOcupada(int vecesOcupada) {
        this.vecesOcupada = vecesOcupada;
    }

}
