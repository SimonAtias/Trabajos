import java.util.Random;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Random n = new Random();

        Hotel Sheraton = new Hotel();

        Persona p1= new Persona();
        Persona p2= new Persona();
        Persona p3= new Persona();

        Fecha f1i=new Fecha();
        f1i.setAnio(2020);
        f1i.setDia(6);
        f1i.setMes(9);

        Fecha f1f=new Fecha();
        f1f.setDia(20);
        f1f.setMes(10);
        f1f.setAnio(2020);

        Fecha f2i=new Fecha();
        f2i.setAnio(2020);
        f2i.setDia(15);
        f2i.setMes(5);

        Fecha f2f=new Fecha();
        f2f.setDia(20);
        f2f.setMes(5);
        f2f.setAnio(2020);

        Fecha f3i=new Fecha();
        f3i.setAnio(2020);
        f3i.setDia(7);
        f3i.setMes(4);

        Fecha f3f=new Fecha();
        f3f.setDia(25);
        f3f.setMes(4);
        f3f.setAnio(2020);

        p1.setApellido("Perez");
        p1.setNombre("Roberto");
        p1.setDNI(43156951);
        p1.setEdad(30);
        p1.setFechaEntrada(f1i);
        p1.setFechaSalida(f1f);
        p1.setVecesHospedado(7);


        p2.setApellido("Sanchez");
        p2.setNombre("Nora");
        p2.setDNI(43685163);
        p2.setEdad(74);
        p2.setFechaEntrada(f2i);
        p2.setFechaSalida(f2f);
        p2.setVecesHospedado(8);


        p3.setApellido("Zaulman");
        p3.setNombre("Andres");
        p3.setDNI(46512321);
        p3.setEdad(45);
        p3.setFechaEntrada(f3i);
        p3.setFechaSalida(f3f);
        p3.setVecesHospedado(1);


        Habitacion h1 = new Habitacion(1);
        h1.setNumero(1);
        h1.setSolicitudes(n.nextInt(1000));
        h1.setOcupada(true);
        h1.setHuesped(p1);


        Habitacion h2 = new Habitacion(1);
        h2.setNumero(2);
        h2.setSolicitudes(n.nextInt(1000));
        h2.setOcupada(true);
        h2.setHuesped(p2);


        Habitacion h3 = new Habitacion(1);
        h3.setNumero(3);
        h3.setSolicitudes(n.nextInt(1000));
        h3.setOcupada(false);


        Habitacion h4 = new Habitacion(1);
        h4.setNumero(4);
        h4.setSolicitudes(n.nextInt(1000));
        h4.setOcupada(false);


        Habitacion h5 = new Habitacion(1);
        h5.setNumero(5);
        h5.setSolicitudes(n.nextInt(1000));
        h5.setOcupada(false);


        Habitacion h6 = new Habitacion(1);
        h6.setNumero(6);
        h6.setSolicitudes(n.nextInt(1000));
        h6.setOcupada(false);


        Habitacion h7 = new Habitacion(1);
        h7.setNumero(7);
        h7.setSolicitudes(n.nextInt(1000));
        h7.setOcupada(false);


        Habitacion h8 = new Habitacion(1);
        h8.setNumero(8);
        h8.setSolicitudes(n.nextInt(1000));
        h8.setOcupada(false);


        Habitacion h9 = new Habitacion(2);
        h9.setNumero(9);
        h9.setSolicitudes(n.nextInt(1000));
        h9.setHuesped(p3);
        h9.setOcupada(true);

        Habitacion h10 = new Habitacion(2);
        h10.setNumero(10);
        h10.setSolicitudes(n.nextInt(1000));
        h10.setOcupada(false);


        Habitacion h11 = new Habitacion(2);
        h11.setNumero(11);
        h11.setSolicitudes(n.nextInt(1000));
        h11.setOcupada(false);


        Habitacion h12 = new Habitacion(2);
        h11.setNumero(12);
        h11.setSolicitudes(n.nextInt(1000));
        h12.setOcupada(false);


        Habitacion h13 = new Habitacion(2);
        h12.setNumero(13);
        h12.setSolicitudes(n.nextInt(1000));
        h13.setOcupada(false);


        Sheraton.addHabitacion(h1);
        Sheraton.addHabitacion(h2);
        Sheraton.addHabitacion(h3);
        Sheraton.addHabitacion(h4);
        Sheraton.addHabitacion(h5);
        Sheraton.addHabitacion(h6);
        Sheraton.addHabitacion(h7);
        Sheraton.addHabitacion(h8);
        Sheraton.addHabitacion(h9);
        Sheraton.addHabitacion(h10);
        Sheraton.addHabitacion(h11);
        Sheraton.addHabitacion(h12);
        Sheraton.addHabitacion(h13);
        Sheraton.addClientes(p1);
        Sheraton.addClientes(p2);
        Sheraton.addClientes(p3);


        System.out.println(Sheraton.getIngresoTotal());

    }
}

