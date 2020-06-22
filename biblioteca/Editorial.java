package biblioteca;

public enum Editorial {

    Kapelusz(1), Sudamericana(2), Atlantida(3), elAteneo(4), interzona(5), surYAlianza(6);

    private int idEditorial;

    private Editorial(int id){
        this.idEditorial=id;
    }

}
