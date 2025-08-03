 package inicializadorYcontenedorMVC;

import contenedorMVC.ContenedorMVC;
import contenedorMVC.GestorDeContenedores;
import crearSala.ControladorCrearSala;
import crearSala.ModeloCrearSala;
import crearSala.VistaCrearSala;
import inicio.ControladorInicio;
import inicio.ModeloInicio;
import inicio.VistaInicio;
import unirseASala.ControladorUnirseASala;
import unirseASala.ModeloUnirseASala;
import unirseASala.VistaUnirseASala;

/**
 * Clase que servíra para inicializar todos los MVC del juego y los pondra en contenedores para que la logica pueda acceder a ellos 
 * @author tacot
 */
public class Inicializador {
    
    private GestorDeContenedores gestor;
    
    public Inicializador(){
    
        gestor = GestorDeContenedores.getInstancia();

    }
  
    public void inicializarMVC(){
        
        ModeloInicio modeloInicio = new ModeloInicio();
        VistaInicio vistaInicio = new VistaInicio(modeloInicio);
        ControladorInicio controladorInicio = new ControladorInicio(modeloInicio, vistaInicio);
        ContenedorMVC contenedorInicio = new ContenedorMVC(modeloInicio, vistaInicio, controladorInicio);
        gestor.agregarContenedor("inicio", contenedorInicio);
        
        
        ModeloCrearSala modeloCrearSala = new ModeloCrearSala();
        VistaCrearSala vistaCrearSala = new VistaCrearSala(modeloCrearSala);
        ControladorCrearSala controladorCrearSala = new ControladorCrearSala(vistaCrearSala, modeloCrearSala);
        ContenedorMVC contenedorCrearSala = new ContenedorMVC(modeloCrearSala, vistaCrearSala, controladorCrearSala);
        gestor.agregarContenedor("crearSala", contenedorCrearSala);
        
        
        ModeloUnirseASala modeloUnirseASala = new ModeloUnirseASala();
        VistaUnirseASala vistaUnirseASala = new VistaUnirseASala();
        ControladorUnirseASala controladorUnirseASala = new ControladorUnirseASala(vistaUnirseASala, modeloUnirseASala);
        ContenedorMVC contenedoUnirseASala = new ContenedorMVC(modeloUnirseASala, vistaUnirseASala, controladorUnirseASala);
        gestor.agregarContenedor("unirseSala", contenedoUnirseASala);
        
        
                
        
    }

    public GestorDeContenedores getGestor() {
        return gestor;
    }
    
    
}
