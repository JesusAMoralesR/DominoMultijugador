/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contenedorMVC;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tacot
 */
public class GestorDeContenedores {
    private Map<String, ContenedorMVC> contenedores;

    public GestorDeContenedores() {
        contenedores = new HashMap<>();
        
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
