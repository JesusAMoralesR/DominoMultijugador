package crearSala;

import contenedorMVC.Icomponente;
import observers.IObserver;

/**
 *
 * @author tacot
 */
public class ControladorCrearSala implements Icomponente{

    private final VistaCrearSala vista;
    private final ModeloCrearSala modelo;
    private int contador;
    
    public ControladorCrearSala(VistaCrearSala vistaCrearSala, ModeloCrearSala modeloCrearSala) {
    
        contador = 0;
        vista = vistaCrearSala;
        modelo = modeloCrearSala;
        agregarObservadores();
    
    }
    
    public void agregarObservadores(){
        vista.setObservadorCrearSala(new AccionCrearSala());
        vista.setObservadorCanselar(new AccionCancelar());
        vista.setObservadorAdelanteAvatar(new AccionSiguienteAvatar());
        vista.setObservadorAtrasAvatar(new AccionAnteriorAvatar());
        
    }
    
    public void ejecutarAccionCrearSala(){
        
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
    
    private class AccionCrearSala implements IObserver{

        @Override
        public void actualizar() {
            
            ejecutarAccionCrearSala();
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
