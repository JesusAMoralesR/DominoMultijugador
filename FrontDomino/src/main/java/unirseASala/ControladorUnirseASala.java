package unirseASala;

import objetosDeEventos.EventoUnirseASala;
import contenedorMVC.Icomponente;
import java.awt.Image;
import objetosPartida.Jugador;
import observers.IObserver;

/**
 *
 * @author tacot
 */
public class ControladorUnirseASala implements Icomponente {

    private final VistaUnirseASala vista;
    private final ModeloUnirseASala modelo;
    private int contador;

    public ControladorUnirseASala(VistaUnirseASala vistaUnirseASala, ModeloUnirseASala modeloUnirseASala) {

        contador = 0;
        vista = vistaUnirseASala;
        modelo = modeloUnirseASala;
        agregarObservadores();

    }

    public final void agregarObservadores() {
        vista.setObservadorCrearSala(new AccionUnirseSala());
        vista.setObservadorCanselar(new AccionCancelar());
        vista.setObservadorAdelanteAvatar(new AccionSiguienteAvatar());
        vista.setObservadorAtrasAvatar(new AccionAnteriorAvatar());

    }

    public void ejecutarAccionUnirseSala() {

        if (validacionesParaUnirseASala()) {
            String nombre = vista.getTFnombre().getText();
            String codigo = vista.getTFcodigo().getText();
            Image avatar = modelo.getImagen();

            Jugador jugador = new Jugador(nombre, avatar);
            
            EventoUnirseASala eventoUnirseASala = new EventoUnirseASala(codigo, jugador);

            modelo.ejecutarObservadorUnirseSala(eventoUnirseASala);
        }
    }

    public void ejecutarAccionCancelar() {
        vista.getTFnombre().setText("");
        vista.getTFcodigo().setText("");
        modelo.ejecutarObservadorCancelar();
    }

    public void ejecutarAccionSiguienteAvatar() {
        contador++;
        if (contador > 6) {
            contador = 1;
        }
        modelo.CambiarAvatar(contador);
    }

    public void ejecutarAccionAnteriorAvatar() {
        contador--;
        if (contador < 1) {
            contador = 6;
        }
        modelo.CambiarAvatar(contador);
    }

    public boolean validacionesParaUnirseASala() {
        boolean llave = true;
        if (vista.getTFnombre().getText().equalsIgnoreCase("") || vista.getTFcodigo().getText().equalsIgnoreCase("")) {
            modelo.ejecutarObserverValidacionFallida("<html>\tEs obligatorio llenar los campos de<br>Gamertag y Codigo</html>");
            
            llave = false;
        }

        return llave;
    }

    private class AccionUnirseSala implements IObserver {

        @Override
        public void actualizar() {

            ejecutarAccionUnirseSala();
        }

    }

    private class AccionCancelar implements IObserver {

        @Override
        public void actualizar() {

            ejecutarAccionCancelar();
        }
    }

    private class AccionSiguienteAvatar implements IObserver {

        @Override
        public void actualizar() {
            ejecutarAccionSiguienteAvatar();

        }

    }

    private class AccionAnteriorAvatar implements IObserver {

        @Override
        public void actualizar() {

            ejecutarAccionAnteriorAvatar();
        }

    }

}
