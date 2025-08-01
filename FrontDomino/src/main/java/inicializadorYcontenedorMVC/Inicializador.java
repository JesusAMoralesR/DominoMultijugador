package inicializadorYcontenedorMVC;

import inicio.ControladorInicio;
import inicio.ModeloInicio;
import inicio.VistaInicio;

/**
 * Clase que servíra para inicializar todos los MVC del juego y los pondra en contenedores para que la logica pueda acceder a ellos 
 * @author tacot
 */
public class Inicializador {
    
    public Inicializador(){}
    
    public static void main(String[] args) {
        inicializarMVC();
    }
    
    public static void inicializarMVC(){
        
        ModeloInicio modeloInicio = new ModeloInicio();
        VistaInicio inicio = new VistaInicio(modeloInicio);
        ControladorInicio controladorInicio = new ControladorInicio(modeloInicio, inicio);
        inicio.setVisible(true);
        
    }
}
