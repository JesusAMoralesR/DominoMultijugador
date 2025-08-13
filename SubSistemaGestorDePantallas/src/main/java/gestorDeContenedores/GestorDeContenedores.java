package gestorDeContenedores;

import contenedorMVC.ContenedorMVC;
import contenedorMVC.Icomponente;
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

    public static GestorDeContenedores getInstancia() {
        if (instancia == null) {
            instancia = new GestorDeContenedores();
        }

        return instancia;
    }

    public void agregarContenedor(String nombre, ContenedorMVC contenedor) {

        contenedores.put(nombre, contenedor);
    }

    public void cambiarVista(String nombreVistaNueva, String nombreVistaAntigua) {

        contenedores.get(nombreVistaAntigua).getVista().setVisible(false);
        contenedores.get(nombreVistaNueva).getVista().setVisible(true);

    }

    public void mostrarVista(String nombre) {

        contenedores.values().forEach(contenedor -> {
            if (contenedor.getVista() != null) {
                contenedor.getVista().setVisible(false);
            }
        });

        ContenedorMVC contenedorSolicitado = contenedores.get(nombre);
        if (contenedorSolicitado != null && contenedorSolicitado.getVista() != null) {
            contenedorSolicitado.getVista().setVisible(true);
        } else {
            System.out.println("No se encontró el contenedor o la vista para: " + nombre);
        }
    }

    public ContenedorMVC trearContenedor(String nombre) {

        return contenedores.get(nombre);
    }
}
