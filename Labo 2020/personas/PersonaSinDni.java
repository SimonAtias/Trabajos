package personas;

public class PersonaSinDni {

    private String nombre;
    private String apellido;
    private int edad;
    private String ocupacion;

    public PersonaSinDni(){
        this.nombre="Susana";
        this.apellido="Gimenez";
        this.edad=76;
        this.ocupacion="Conductora de TV";
    }

    public PersonaSinDni(String nombrex, int edadx) {
        this.nombre = nombrex;
        this.edad = edadx;
        this.apellido = "-";
    }

    public PersonaSinDni(String nombrex, String apellidox, int edadx, String ocupacionx) {
        this.nombre = nombrex;
        this.edad = edadx;
        this.apellido= apellidox;
        this.ocupacion=ocupacionx;
    }

    public PersonaSinDni(String nombre){
        this.nombre = nombre;
        this.edad = 56;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

}