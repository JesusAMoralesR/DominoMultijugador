package unirseASala;

import contenedorMVC.Icomponente;
import observers.IObserver;

/**
 *
 * @author tacot
 */
public class ControladorUnirseASala implements Icomponente{
    
    private final VistaUnirseASala vista;
    private final ModeloUnirseASala modelo;
    private int contador;
    
    public ControladorUnirseASala(VistaUnirseASala vistaUnirseASala, ModeloUnirseASala modeloUnirseASala) {
    
        contador = 0;
        vista = vistaUnirseASala;
        modelo = modeloUnirseASala;
        agregarObservadores();
    
    }
    
    public void agregarObservadores(){
        vista.setObservadorCrearSala(new AccionUnirseSala());
        vista.setObservadorCanselar(new AccionCancelar());
        vista.setObservadorAdelanteAvatar(new AccionSiguienteAvatar());
        vista.setObservadorAtrasAvatar(new AccionAnteriorAvatar());
        
    }
    
    public void ejecutarAccionUnirseSala(){
        
        modelo.ejecutarObservadorCrearSala();
    }
    
    public void ejecutarAccionCancelar(){
        
        modelo.ejecutarObservadorCancelar();
    }
    
    public void ejecutarAccionSiguienteAvatar(){
        if (contador != 6) {
            contador++;
            modelo.CambiarAvatar(contador);
        }else if(contador==6){
            contador=0;
        }
    }
    
    public void ejecutarAccionAnteriorAvatar(){
        if (contador != 0) {
            contador--;
            modelo.CambiarAvatar(contador);
        }else if(contador==0){
            contador=6;
        }
    }
    
    private class AccionUnirseSala implements IObserver{

        @Override
        public void actualizar() {
            
            ejecutarAccionUnirseSala();
        }
    
    }
    
    private class AccionCancelar implements IObserver{
    
        @Override
        public void actualizar(){
        
             ejecutarAccionCancelar();
        }
    }
    
    private class AccionSiguienteAvatar implements IObserver{

        @Override
        public void actualizar() {
            ejecutarAccionSiguienteAvatar();
            
        }
    
    }
    
    private class AccionAnteriorAvatar implements IObserver{

        @Override
        public void actualizar() {
            
            ejecutarAccionAnteriorAvatar();
        }
    
    }
    
}
