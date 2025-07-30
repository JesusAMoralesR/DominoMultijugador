package inicio;

import observers.IObserver;

/**
 *
 * @author tacot
 */
public class ControladorInicio {

    private final ModeloInicio modelo;
    private final VistaInicio inicio;

    public ControladorInicio(ModeloInicio modelo, VistaInicio inicio) {
        this.modelo = modelo;
        this.inicio = inicio;
        inicio.setObserverJugar(new AccionJugar());
        
    }
    
    private class AccionJugar implements IObserver{

        public AccionJugar() {
        }

        @Override
        public void actualizar() {
            modelo.setTextoBtn1("Crear sala");
            modelo.setTextoBtn2("Unirse a sala");
            modelo.setEstadoBotones(false);
            modelo.ejecutarBotonJugar();
        }
    }
    
    private class AccionSalir{}
    
    private class AccionCrearSala{}
    
    private class AccionUnirseASala{}
}
