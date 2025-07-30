package LogicaPrincipal;

import fachada.FachadaInicializador;
import fachada.IFachadaInicializador;

/**
 *
 * @author tacot
 */
public class LogicaDomino {
    
    private IFachadaInicializador fachadaInicializador;
    
    public LogicaDomino(){
        fachadaInicializador = new FachadaInicializador();
    }
    
    public void inicializarClases(){
        fachadaInicializador.inicializarClases();
    }
}
