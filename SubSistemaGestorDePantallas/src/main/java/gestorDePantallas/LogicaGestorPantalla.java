package gestorDePantallas;

import fachadaCrearSala.*;
import gestorDeContenedores.GestorDeContenedores;
import inicio.VistaInicio;
import observers.IObserver;

/**
 *
 * @author tacot
 */
public class LogicaGestorPantalla {
    private final GestorDeContenedores gestor = GestorDeContenedores.getInstancia();
    private VistaInicio inicio;
    
    
    public LogicaGestorPantalla() {
        
        inicializarVistas();  
        
    }
    
    public final void inicializarVistas(){
    
        inicio = (VistaInicio) gestor.trearVista("inicio");
    }
    
    public final void agregarObservers(IObserver AccionCrearSala, IObserver AccionUnirseASala){
        
        inicio.setObserverCrearSala(AccionCrearSala);
        inicio.setObserverUnirseASala(AccionUnirseASala);
    }
    
}