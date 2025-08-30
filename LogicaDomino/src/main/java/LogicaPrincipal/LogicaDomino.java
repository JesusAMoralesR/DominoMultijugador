package LogicaPrincipal;

import objetosDeEventos.EventoCrearSala;
import objetosDeEventos.EventoUnirseASala;
import gestorDeContenedores.FachadaContenedores;
import gestorDeContenedores.IFachadaContenedores;
import gestorDePantallas.IFachadaGestorPantalla;
import gestorDePantallas.fachadaGestorPantalla;
import inicializadorYcontenedorMVC.Inicializador;
import observers.IObserver;
import observers.IObserverCrearSala;
import observers.IObserverMensajeAlerta;
import observers.IObserverUnirseASala;

/**
 *
 * @author tacot
 */
public class LogicaDomino {

    private final Inicializador inicializador;
    private final IFachadaContenedores gestorDeContenedores;
    private final IFachadaGestorPantalla gestorPantalla;

    public LogicaDomino() {
        inicializador = new Inicializador();
        gestorDeContenedores = new FachadaContenedores();
        gestorPantalla = new fachadaGestorPantalla();
        
    }

    public final void agregarObservers() {

        gestorPantalla.agregarObservers(new AccionCambiarPantallaCrearSala(), 
                new AccionCambiarPantallaUniraseASala(), 
                new AccionUnirseASala(), 
                new AccionCancelar(), 
                new AccionCrearSala(),
                new AccionMostraMensaje());
    }

    public void run() {
        agregarObservers();
        gestorDeContenedores.mostrarVista("inicio");

    }

    /*
        A partir de aquí son acciones que interactuan de la vista a la logica
     */
    
    
    private class AccionCambiarPantallaCrearSala implements IObserver {

        @Override
        public void actualizar() {
            ejecutarAccionCambiarPantallaCrearSala();
        }

    }

    public void ejecutarAccionCambiarPantallaCrearSala() {
        gestorDeContenedores.cambiarVista("crearSala", "inicio");
    }

    private class AccionCambiarPantallaUniraseASala implements IObserver {

        @Override
        public void actualizar() {
            ejecutarAccionCambiarPantallaUnirseASala();
        }
    }

    public void ejecutarAccionCambiarPantallaUnirseASala() {
        gestorDeContenedores.cambiarVista("unirseSala", "inicio");
    }

    private class AccionCrearSala implements IObserverCrearSala {

        @Override
        public void actualizar(EventoCrearSala eventoCrearSala) {
            
        }
    }

    private class AccionUnirseASala implements IObserverUnirseASala {

        @Override
        public void actualizar(EventoUnirseASala objetoUnirseAsala) {
            
        }
    }

    private class AccionCancelar implements IObserver {

        @Override
        public void actualizar() {

            ejecutarAccionCancelar();
        }
    }
    
    public void ejecutarAccionCancelar() {
        gestorDeContenedores.mostrarVista("inicio");
    }
    
    private class AccionMostraMensaje implements IObserverMensajeAlerta{

        @Override
        public void actualizar(String mensaje) {
            ejecutarAccionMostrarMensaje(mensaje);
        }    
    }
    
    public void ejecutarAccionMostrarMensaje(String mensaje) {
        gestorDeContenedores.mostrarMensaje(mensaje);
    }

}
