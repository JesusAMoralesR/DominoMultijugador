package fachadaMensajeAlerta;

/**
 *
 * @author tacot
 */
public class FachadaMensajeAlerta implements IFachadaMensajeAlerta{

    private final LogicaMensajeAlerta logicaMensaje;
    
    public FachadaMensajeAlerta() {
        logicaMensaje = new LogicaMensajeAlerta();
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        logicaMensaje.mostrarMensaje(mensaje);
        
    }
    
}
