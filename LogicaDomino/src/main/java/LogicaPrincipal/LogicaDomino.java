package LogicaPrincipal;

import inicializadorYcontenedorMVC.Inicializador;

/**
 *
 * @author tacot
 */
public class LogicaDomino {
    
    private final Inicializador inicializador;

    public LogicaDomino() {
        inicializador = new Inicializador();
    }
    
    public void inicializarClases(){
        inicializador.inicializarMVC();
    }
    
    public void run(){
        inicializarClases();
    }
}
