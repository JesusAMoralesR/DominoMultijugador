package gestorDeContenedores;

import contenedorMVC.ContenedorMVC;

/**
 *
 * @author tacot
 */
public interface IFachadaContenedores {

    public void registrarContenedor(String nombre, ContenedorMVC contenedor);

    public void mostrarVista(String nombre);

    public void cambiarVista(String vistaNueva, String vistaAntigua);

    public ContenedorMVC obtenerContenedor(String nombre);
    
    public void mostrarMensaje(String mensaje);
}
