package biblioteca;

public enum Cuaderno {

    veinticuatro(24,200), cuarentaYOcho(48, 300), noventaYOcho(98,350);

    private int cantPags;
    private int precio;

    private Cuaderno(int paginas, int price){
        this.cantPags=paginas;
        this.precio=price;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantPags() {
        return cantPags;
    }

}
