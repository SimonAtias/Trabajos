package personas;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MainPersonas {
    public static void main(String[] args) {

        ArrayList<PersonaSinDni> personasIngresadas = new ArrayList<>();

        JFrame ventana=new JFrame();
        ventana.setLayout(null);
        ventana.setSize(290, 290);

        JLabel ingrese=new JLabel();
        ingrese.setText("Ingrese nombre, apellido, edad y ocupacion");
        ingrese.setLocation(10, 10);
        ingrese.setSize(250, 25);
        ventana.add(ingrese);

        JTextField nombre=new JTextField();
        nombre.setLocation(10,40);
        nombre.setSize(225,25);
        ventana.add(nombre);

        JTextField apellido=new JTextField();
        apellido.setLocation(10,70);
        apellido.setSize(225,25);
        ventana.add(apellido);

        JTextField edad=new JTextField();
        edad.setLocation(10,110);
        edad.setSize(25,25);
        ventana.add(edad);

        JTextField ocupacion=new JTextField();
        ocupacion.setLocation(10,150);
        ocupacion.setSize(225,25);
        ventana.add(ocupacion);

        JButton botonIngreso=new JButton("Registrar");
        botonIngreso.setLocation(10,190);
        botonIngreso.setSize(225, 25);
        ventana.add(botonIngreso);

        JLabel mensajeDeRespuesta = new JLabel();
        mensajeDeRespuesta.setLocation(10, 220);
        mensajeDeRespuesta.setSize(250, 25);
        ventana.add(mensajeDeRespuesta);
        mensajeDeRespuesta.setVisible(false);


        ingrese.setVisible(true);
        edad.setVisible(true);
        nombre.setVisible(true);
        apellido.setVisible(true);
        ventana.setVisible(true);
        ocupacion.setVisible(true);

        botonIngreso.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e){

                if(nombre.getText().isBlank() || apellido.getText().isBlank() || edad.getText().isBlank() || ocupacion.getText().isBlank()){
                    mensajeDeRespuesta.setText("Hubo un error, asegurese de ingresar todos los datos bien");
                }
                else{
                    int edadEnInt = Integer.parseInt(edad.getText());
                    PersonaSinDni personaNueva = new PersonaSinDni(nombre.getText(), apellido.getText(), edadEnInt, ocupacion.getText());
                    personasIngresadas.add(personaNueva);
                    mensajeDeRespuesta.setText("Ingresado correctamente");
                }
                mensajeDeRespuesta.setVisible(true);
                System.out.println(personasIngresadas.get(0).getApellido());
                System.out.println(personasIngresadas.get(0).getEdad());
                System.out.println(personasIngresadas.get(0).getNombre());
                System.out.println(personasIngresadas.get(0).getOcupacion());
            }

        });

    }
}
