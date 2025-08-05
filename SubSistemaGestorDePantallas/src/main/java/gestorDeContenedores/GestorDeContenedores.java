package gestorDeContenedores;

import contenedorMVC.ContenedorMVC;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tacot
 */
public class GestorDeContenedores {
    private static GestorDeContenedores instancia;
    private final Map<String, ContenedorMVC> contenedores;

    public GestorDeContenedores() {
        contenedores = new HashMap<>();
        
    }
    
    public static GestorDeContenedores getInstancia(){
        if (instancia == null) {
            instancia = new GestorDeContenedores();
        }
        
        return instancia;
    }
    
    public void agregarContenedor(String nombre, ContenedorMVC contenedor){
        
        contenedores.put(nombre, contenedor);
    }
    
    public void CambiarVista(String nombreVistaNueva, String nombreVistaAntigua){
        
        contenedores.get(nombreVistaAntigua).getVista().setVisible(false);
        contenedores.get(nombreVistaNueva).getVista().setVisible(true);
        
    }
    
    public void MostrarVista(String nombre){
        contenedores.get(nombre).getVista().setVisible(true);
    }
    
}
