package objetosDeEventos;

import java.awt.Image;
import objetosPartida.Jugador;

/**
 *
 * @author tacot
 */
public class EventoUnirseASala {

    private String codigo;
    private Jugador jugador;

    public EventoUnirseASala(String codigo, Jugador jugador) {
        this.codigo = codigo;
        this.jugador = jugador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    
    
}
