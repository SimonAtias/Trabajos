/*
1) Crear la clase OrdenDeCompra:
   Atributos:
   fecha, hora, importe a pagar,
   cliente, cantidad total de productos, forma de pago

   Métodos:
   * método que retorne true si la cantidad de productos
	 es menor a 255.
   * método que indique si el cliente pagará en efectivo.
   * getters y setters
 */
public class OrdenDeCompra {

    private String fecha;
    private String hora;
    private int importeAPagar;
    private int cliente;
    private int cantProductos;
    private String formaPago;

    public OrdenDeCompra(){
        fecha= "2020-17-3";
        hora= "15:23";
        importeAPagar=1500;
        cliente=1;
        cantProductos=1;
        formaPago= "efectivo";
    }

    public int getCantProductos() {
        return cantProductos;
    }

    public int getCliente() {
        return cliente;
    }

    public int getImporteAPagar() {
        return importeAPagar;
    }

    public String getFecha() {
        return fecha;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public String getHora() {
        return hora;
    }

    public void setCantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setImporteAPagar(int importeAPagar) {
        this.importeAPagar = importeAPagar;
    }

    public Boolean menor255() {
        Boolean x = this.getCantProductos()<255;
        return x;
    }
    public void efectivO() {
        if(this.getFormaPago()=="efectivo"){
            System.out.println("Paga en efectivo");
        }
        else{
            System.out.println("Paga en " + this.getFormaPago());
        }
    }

}
