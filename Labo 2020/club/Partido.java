package club;
import java.util.HashSet;

public class Partido {

    private boolean ganado;
    private HashSet<Jugador> jugadoresDelClub =  new HashSet<>();
    private HashSet<Jugador> jugadoresVisitantes =  new HashSet<>();;
    private Fecha fecha;

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
