package objetosPartida;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tacot
 */
public class JugadorEnPartida extends Jugador{

    private List<Ficha> fichasJugador;
    
    public JugadorEnPartida() {
        super();
        fichasJugador = new ArrayList<>();
    }
    
    public JugadorEnPartida(String nombre, Image avatar) {
        super(nombre, avatar);
        fichasJugador = new ArrayList<>();
    }

    public JugadorEnPartida(List<Ficha> fichasJugador, String nombre, Image avatar) {
        super(nombre, avatar);
        this.fichasJugador = fichasJugador;
    }

    public List<Ficha> getFichasJugador() {
        return fichasJugador;
    }

    public void setFichasJugador(List<Ficha> fichasJugador) {
        this.fichasJugador = fichasJugador;
    }
    
}
