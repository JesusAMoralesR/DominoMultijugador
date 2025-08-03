package LogicaPrincipal;

import contenedorMVC.GestorDeContenedores;
import inicializadorYcontenedorMVC.Inicializador;

/**
 *
 * @author tacot
 */
public class LogicaDomino {
    
    private final Inicializador inicializador;
    private final GestorDeContenedores gestorDeContenedores;

    public LogicaDomino() {
        inicializador = new Inicializador();
        gestorDeContenedores = GestorDeContenedores.getInstancia();
    }
    
    public void inicializarClases(){
        inicializador.inicializarMVC();
    }
    
    public void run(){
        inicializarClases();
        gestorDeContenedores.MostrarVista("inicio");
        
    }
}
