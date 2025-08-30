package gestorTurnos;

import java.util.ArrayList;
import java.util.List;
import objetosPartida.JugadorEnPartida;

/**
 *
 * @author tacot
 */
public class GestorDeTurnos {

    private List<JugadorEnPartida> turnos;
    private int indiceActual;

    public GestorDeTurnos() {
        turnos = new ArrayList<>();
        indiceActual = 0;
    }

    public void repartirTurnos(List<JugadorEnPartida> jugadores) {

        turnos.clear();
        JugadorEnPartida primerTurno = new JugadorEnPartida();
        int valorMulaMasAlta = -1;

        for (JugadorEnPartida jugador : jugadores) {

            int mulaAltaJugador = MulaMasAltaDeJugador(jugador);

            if (mulaAltaJugador > valorMulaMasAlta) {

                valorMulaMasAlta = mulaAltaJugador;
                primerTurno = jugador;

            }

            turnos.add(jugador);
        }

        if (primerTurno != null) {
            turnos.remove(primerTurno);
            turnos.add(0, primerTurno);
        }

        indiceActual = 0;
    }

    private int MulaMasAltaDeJugador(JugadorEnPartida jugador) {
        return jugador.getFichasJugador().stream().filter(ficha -> ficha.getNumero1() == ficha.getNumero2()).mapToInt(ficha -> ficha.getNumero1()).max().orElse(-1);
    }

    public List<JugadorEnPartida> getTurnos() {
        if (turnos.isEmpty()) {
            return null;
        }
        return turnos;
    }

    public JugadorEnPartida obtenerTurnoActual() {
        if (turnos.isEmpty()) {
            return null;
        }
        return turnos.get(indiceActual);
    }

    public void siguienteTurno() {
        indiceActual += 1 % turnos.size();
    }

    public boolean alguienGano() {
         
        return turnos.stream().anyMatch(jugador -> jugador.getFichasJugador().isEmpty());
    }

}
