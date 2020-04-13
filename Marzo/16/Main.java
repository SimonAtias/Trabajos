/*
Enunciado día 16 de Marzo

1) Crear la clase OrdenDeCompra:
   Atributos:
   fecha, hora, importe a pagar,
   cliente, cantidad total de productos, forma de pago

   Métodos:
   * método que retorne true si la cantidad de productos
	 es menor a 255.
   * método que indique si el cliente pagará en efectivo.
   * getters y setters

2) Crear la clase ProductoAlimenticio:
   Atributos:
   nombre, precio, fecha de elaboración, fecha de vencimiento y peso
   Métodos:
   * método que retorne true si el producto supera los 5 kg de peso
   * método que retorne true si ya está vencido (pasar fecha actual como parámetro)
   * getters y setters


Comentarios:
- Los nombres de las clases siempre comienzan con mayúscula
- Por ahora, las fechas se escribirán como strings.
 */
public class Main {

    public static void main(String[] args) {
        OrdenDeCompra o1= new OrdenDeCompra();
        o1.menor255();
        o1.efectivO();
    }
}
