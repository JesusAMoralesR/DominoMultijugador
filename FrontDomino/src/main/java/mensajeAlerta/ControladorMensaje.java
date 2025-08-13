package mensajeAlerta;

import observers.IObserver;

/**
 *
 * @author tacot
 */
public class ControladorMensaje {

    private final ModeloMensaje modelo;
    private final VistaMensaje vista;
    
    public ControladorMensaje(ModeloMensaje modeloMensaje, VistaMensaje vistaMensaje) {
        modelo = modeloMensaje;
        vista = vistaMensaje;
        vista.setObservadorAceptar(new AccionAceptar());
        
    }
    
    public void ejecutarAccionAceptar(){
        modelo.ejectutarObserverAceptar();
    }
    
    private class AccionAceptar implements IObserver{

        @Override
        public void actualizar() {

            ejecutarAccionAceptar();
            
        }
    
    }
    
}
