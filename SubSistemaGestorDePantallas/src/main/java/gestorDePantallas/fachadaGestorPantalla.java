package gestorDePantallas;

import fachadaCrearSala.*;
import observers.IObserver;
import observers.IObserverCrearSala;
import observers.IObserverMensajeAlerta;
import observers.IObserverUnirseASala;

/**
 *
 * @author tacot
 */
public class fachadaGestorPantalla implements IFachadaGestorPantalla{

    private LogicaGestorPantalla gestorPantalla = new LogicaGestorPantalla();
    
    public fachadaGestorPantalla() {
        
    }

    @Override
    public void agregarObservers(IObserver AccionEnInicioCrearSala, IObserver AccionEnIniciUnirseASala, IObserverUnirseASala AccionUnirseASala, IObserver AccionCancelar, IObserverCrearSala AccionCrearSala, IObserverMensajeAlerta AccionMostrarMensaje) {
        gestorPantalla.agregarObserversInicio(AccionEnInicioCrearSala, AccionEnIniciUnirseASala);
        gestorPantalla.agregarObservadoresUnirseASala(AccionUnirseASala, AccionCancelar, AccionMostrarMensaje);
        gestorPantalla.agregarObservadoresCrearSala(AccionCrearSala, AccionCancelar, AccionMostrarMensaje);
    }
    
}
