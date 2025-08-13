package gestorDePantallas;

import crearSala.ModeloCrearSala;
import fachadaCrearSala.*;
import gestorDeContenedores.GestorDeContenedores;
import inicio.ModeloInicio;
import observers.IObserver;
import observers.IObserverCrearSala;
import observers.IObserverMensajeAlerta;
import observers.IObserverUnirseASala;
import unirseASala.ModeloUnirseASala;

/**
 *
 * @author tacot
 */
public class LogicaGestorPantalla {
    private final GestorDeContenedores gestor = GestorDeContenedores.getInstancia();
    private ModeloInicio inicio;
    private ModeloUnirseASala unirseSala;
    private ModeloCrearSala crearSala;
    
    
    public LogicaGestorPantalla() {
        
        inicializarVistas();  
        
    }
    
    public final void inicializarVistas(){
    
        inicio = (ModeloInicio) gestor.trearContenedor("inicio").getModelo();
        unirseSala = (ModeloUnirseASala) gestor.trearContenedor("unirseSala").getModelo();
        crearSala = (ModeloCrearSala) gestor.trearContenedor("crearSala").getModelo();
                
    }
    
    public final void agregarObserversInicio(IObserver AccionCrearSala, IObserver AccionUnirseASala){
        inicio.setObservadorCrearSala(AccionCrearSala);
        inicio.setObservadorUnirseSala(AccionUnirseASala);
    }
    
   public final void agregarObservadoresUnirseASala(IObserverUnirseASala AccionUnirseASala, IObserver AccionCancelar, IObserverMensajeAlerta AccionMostrarMensaje){
       unirseSala.setObservadorUnirseSala(AccionUnirseASala);
       unirseSala.setObservadorCanselar(AccionCancelar);
       unirseSala.setObserverValidacionFallida(AccionMostrarMensaje);
   }
   
   public final void agregarObservadoresCrearSala(IObserverCrearSala AccionCrearSala, IObserver AccionCancelar, IObserverMensajeAlerta AccionMostrarMensaje){
       crearSala.setObservadorCrearSala(AccionCrearSala);
       crearSala.setObservadorCanselar(AccionCancelar);
       crearSala.setObserverValidacionFallida(AccionMostrarMensaje);
   }
    
}