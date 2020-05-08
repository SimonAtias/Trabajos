import java.util.HashSet;

public class Partido {

    boolean ganado;
    HashSet<Jugador> jugadoresDelClub =  new HashSet<>();
    HashSet<Jugador> jugadoresVisitantes =  new HashSet<>();;
    Fecha fecha;

    public Fecha getFecha() {
        return this.fecha;
    }

    public HashSet<Jugador> getJugadoresDelClub() {
        return this.jugadoresDelClub;
    }

    public HashSet<Jugador> getJugadoresVisitantes() {
        return this.jugadoresVisitantes;
    }

    public boolean getGanado(){
        return this.ganado;
    }

}
