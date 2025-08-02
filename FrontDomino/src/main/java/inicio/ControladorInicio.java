package inicio;

import contenedorMVC.Icomponente;
import observers.IObserver;

/**
 *
 * @author tacot
 */
public class ControladorInicio implements Icomponente{

    private final ModeloInicio modelo;
    private final VistaInicio inicio;

    public ControladorInicio(ModeloInicio modelo, VistaInicio inicio) {
        this.modelo = modelo;
        this.inicio = inicio;
        inicio.setObserverJugar(new AccionJugar());
        inicio.setObserverSalir(new AccionSalir());
        inicio.setObserverVolver(new AccionVolver());
        
        
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
    
    private class AccionSalir implements IObserver{

        @Override
        public void actualizar() {  
            System.exit(0);
        }
    }
    
    private class AccionVolver implements IObserver{

        @Override
        public void actualizar() {
            modelo.setTextoBtn1("jugar");
            modelo.setTextoBtn2("Salir");
            modelo.setEstadoBotones(true);
            modelo.ejecutarBotonVolver();
        }
    }
    
    private class AccionCrearSala implements IObserver{

        @Override
        public void actualizar() {

        }
    }
    
    private class AccionUnirseASala implements IObserver{

        @Override
        public void actualizar() {

        }
    }
}
