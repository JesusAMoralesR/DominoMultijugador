package gestorDeContenedores;

import contenedorMVC.ContenedorMVC;
import fachadaMensajeAlerta.FachadaMensajeAlerta;
import fachadaMensajeAlerta.IFachadaMensajeAlerta;

/**
 *
 * @author tacot
 */
public class FachadaContenedores implements IFachadaContenedores{
    private final GestorDeContenedores gestor;
    private final IFachadaMensajeAlerta fachadaMensajeAlerta;

    public FachadaContenedores() {
        this.gestor = GestorDeContenedores.getInstancia();
        this.fachadaMensajeAlerta = new FachadaMensajeAlerta();
    }

    @Override
    public void registrarContenedor(String nombre, ContenedorMVC contenedor) {
        gestor.agregarContenedor(nombre, contenedor);
    }

    @Override
    public void mostrarVista(String nombre) {
        gestor.mostrarVista(nombre);
    }

    @Override
    public void cambiarVista(String vistaNueva, String vistaAntigua) {
        gestor.cambiarVista(vistaNueva, vistaAntigua);
    }

    @Override
    public ContenedorMVC obtenerContenedor(String nombre) {
        return gestor.trearContenedor(nombre);
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        fachadaMensajeAlerta.mostrarMensaje(mensaje);
    }
}

