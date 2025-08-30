package crearSala;

import objetosDeEventos.EventoCrearSala;
import contenedorMVC.Icomponente;
import java.awt.Image;
import objetosPartida.Jugador;
import observers.IObserver;

/**
 *
 * @author tacot
 */
public class ControladorCrearSala implements Icomponente {

    private final VistaCrearSala vista;
    private final ModeloCrearSala modelo;
    private int contador;

    public ControladorCrearSala(VistaCrearSala vistaCrearSala, ModeloCrearSala modeloCrearSala) {

        contador = 0;
        vista = vistaCrearSala;
        modelo = modeloCrearSala;
        agregarObservadores();

    }

    public final void agregarObservadores() {
        vista.setObservadorCrearSala(new AccionCrearSala());
        vista.setObservadorCanselar(new AccionCancelar());
        vista.setObservadorAdelanteAvatar(new AccionSiguienteAvatar());
        vista.setObservadorAtrasAvatar(new AccionAnteriorAvatar());

    }

    public void ejecutarAccionCrearSala() {

        if (validacionesParaCrearSala()) {
            Image avatar = modelo.getImagen();
            
            String nombre = vista.getTFnombre().getText();
            
            Jugador jugador = new Jugador(nombre, avatar);
            
            int numFichas = getNumeroDeFichas();
            
            EventoCrearSala eventoCrearSala = new EventoCrearSala(jugador, numFichas);
            modelo.ejecutarObservadorCrearSala(eventoCrearSala);
        }
    }

    public int getNumeroDeFichas() {

        int numFichas = 7;

        if (vista.getRbtn4().isSelected() && !vista.getRbtn5().isSelected() && !vista.getRbtn6().isSelected() && !vista.getRbtn7().isSelected()) {
            numFichas = 4;

        } else if (!vista.getRbtn4().isSelected() && vista.getRbtn5().isSelected() && !vista.getRbtn6().isSelected() && !vista.getRbtn7().isSelected()) {
            numFichas = 5;

        } else if (!vista.getRbtn4().isSelected() && !vista.getRbtn5().isSelected() && vista.getRbtn6().isSelected() && !vista.getRbtn7().isSelected()) {
            numFichas = 6;

        } else if (!vista.getRbtn4().isSelected() && !vista.getRbtn5().isSelected() && !vista.getRbtn6().isSelected() && vista.getRbtn7().isSelected()) {
            numFichas = 7;
        }

        return numFichas;
    }

    public boolean validacionesParaCrearSala() {
        boolean llave = true;
        if ((vista.getTFnombre().getText().equalsIgnoreCase("")) || (!vista.getRbtn4().isSelected() 
                && !vista.getRbtn5().isSelected() 
                && !vista.getRbtn6().isSelected() 
                && !vista.getRbtn7().isSelected())) {
            modelo.ejecutarObserverValidacionFallida("<html>\tEs obligatorio llenar los campos de Gamertag <br>y seleccionar un numero de fichas</html>");
            
            llave = false;
        }

        return llave;
    }

    public void ejecutarAccionCancelar() {
        vista.getRbtn4().setSelected(false);
        vista.getRbtn5().setSelected(false);
        vista.getRbtn6().setSelected(false);
        vista.getRbtn7().setSelected(false);
        
        vista.getTFnombre().setText("");
        
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

    private class AccionCrearSala implements IObserver {

        @Override
        public void actualizar() {

            ejecutarAccionCrearSala();
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
