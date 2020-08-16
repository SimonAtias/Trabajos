package personas;

public class Persona {

    private String nombre;
    private int edad;
    private int dni;
    private String ocupacion;

    public Persona(){
        this("Carolina",23,12345678);
    }

    public Persona(int doc){
        nombre="";
        edad=1;
        dni=doc;
    }

    public Persona(String nombre, int edad, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre){
        this.nombre = nombre;
        this.edad = 56;
        this.dni = 12345678;

    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    public void printDNIs(){
        System.out.println(this.dni);
    }

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return this.dni;
    }

    public int getDni() {
        return dni;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(int dni) {
        this.dni = dni;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

}
