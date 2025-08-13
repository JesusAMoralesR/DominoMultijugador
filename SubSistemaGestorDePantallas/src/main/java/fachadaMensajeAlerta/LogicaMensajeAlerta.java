package fachadaMensajeAlerta;

import mensajeAlerta.ControladorMensaje;
import mensajeAlerta.ModeloMensaje;
import mensajeAlerta.VistaMensaje;
import observers.IObserver;


/**
 *
 * @author tacot
 */
public class LogicaMensajeAlerta {
    
    private VistaMensaje vistaMensaje;
    private ModeloMensaje modeloMensaje;
    private ControladorMensaje controladorMensaje;

    public LogicaMensajeAlerta() {
    
    }
    
    public void mostrarMensaje(String mensaje){
        modeloMensaje = new ModeloMensaje(mensaje);
        vistaMensaje = new VistaMensaje(null, true, modeloMensaje);
        modeloMensaje.setObserverAceptar(new AccionAceptar());
        controladorMensaje = new ControladorMensaje(modeloMensaje, vistaMensaje);
        
        vistaMensaje.setVisible(true);
        
    }
    
    public void ejecutarAccionAceptar(){
        vistaMensaje.dispose();
        vistaMensaje = null;
        modeloMensaje = null;
        controladorMensaje = null;
    }
    
    private class AccionAceptar implements IObserver{

        @Override
        public void actualizar() {
            ejecutarAccionAceptar();
        }
    
    }
    
}
