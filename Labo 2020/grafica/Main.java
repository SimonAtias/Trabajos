package grafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args) {

        JFrame ventana=new JFrame();
        ventana.setLayout(null);
        ventana.setSize(555, 200);
        ventana.setVisible(true);

        JLabel texto1 = new JLabel();
        texto1.setText("aaa");
        texto1.setSize(500, 25);
        texto1.setLocation(25, 25);

        JLabel texto2 = new JLabel();
        texto2.setText("bbb");
        texto2.setSize(500, 25);
        texto2.setLocation(25, 55);

        JButton boton = new JButton("Triplicar");
        boton.setSize(500,33);
        boton.setLocation(25,85);

        ventana.add(texto1);
        ventana.add(texto2);
        ventana.add(boton);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String texto = texto1.getText();
                texto= texto + texto + texto;
                texto1.setText(texto);

                texto = texto2.getText();
                texto= texto + texto + texto;
                texto2.setText(texto);
            }
        });

    }
}
