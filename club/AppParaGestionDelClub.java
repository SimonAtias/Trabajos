package club;
import java.util.HashSet;
import java.util.Scanner;

public class AppParaGestionDelClub {
    public static void main(String[] args) {

        Scanner ingreso = new Scanner(System.in);
        HashSet<Partido> partidos = new HashSet<>();

        while(true){
            int rta = 0;
            System.out.println("1. Mostrar partidos Ganados");
            System.out.println("2. Mostrar partidos perdidos");
            rta = ingreso.nextInt();
            ingreso.nextLine();
            if(rta > 0 && rta < 3) {
                switch (rta){
                    case 1:
                        for (Partido p: partidos) {
                            if(p.getGanado()){
                                System.out.println("multiuso.Fecha: "+ p.getFecha().getDia()+"/"+p.getFecha().getMes()+"/"+p.getFecha().getAnio());
                                System.out.println(" ");
                                System.out.println("Equipo local:");
                                for (Jugador j: p.getJugadoresDelClub()){
                                    System.out.println(j.getApellido()+", "+j.getApellido()+". Edad: "+j.getEdad());
                                }
                                for (Jugador j: p.getJugadoresVisitantes()){
                                    System.out.println(j.getApellido()+", "+j.getApellido()+". Edad: "+j.getEdad());
                                }
                            }
                        }
                    break;
                    case 2:
                        for (Partido p: partidos) {
                            if(!p.getGanado()){
                                System.out.println("multiuso.Fecha: "+ p.getFecha().getDia()+"/"+p.getFecha().getMes()+"/"+p.getFecha().getAnio());
                                System.out.println(" ");
                                System.out.println("Equipo local:");
                                for (Jugador j: p.getJugadoresDelClub()){
                                    System.out.println(j.getApellido()+", "+j.getApellido()+". Edad: "+j.getEdad());
                                }
                                System.out.println("Equipo Visitante:");
                                for (Jugador j: p.getJugadoresVisitantes()){
                                    System.out.println(j.getApellido()+", "+j.getApellido()+". Edad: "+j.getEdad());
                                }
                            }
                        }
                    break;
                }
            }
        }

    }
}
