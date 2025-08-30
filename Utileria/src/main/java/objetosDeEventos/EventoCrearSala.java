package objetosDeEventos;

import java.awt.Image;
import objetosPartida.Jugador;

/**
 *
 * @author tacot
 */
public class EventoCrearSala {
    private Jugador jugador;
    private int numFichas;

    public EventoCrearSala(Jugador jugador, int numFichas) {
        this.jugador = jugador;
        this.numFichas = numFichas;
    }

    public int getNumFichas() {
        return numFichas;
    }

    public void setNumFichas(int numFichas) {
        this.numFichas = numFichas;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

}
