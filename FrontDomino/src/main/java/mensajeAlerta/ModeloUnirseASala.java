package mensajeAlerta;

import unirseASala.*;
import crearSala.ModeloCrearSala;
import java.awt.Image;
import java.util.LinkedList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author tacot
 */
public class ModeloUnirseASala {

    private String rutaFondo;
    private String rutaFuente;
    private final List<Image> imagenes = new LinkedList<>();

    public ModeloUnirseASala() {

        cargarFuentes();

    }

    public void cargarFuentes() {

        rutaFondo = "/imagenes/fondo/fondoPrincipal.png";
        rutaFuente = "/fuentes/InknutAntiqua-Regular.ttf";
        String url = "/imagenes/avatares/avt";

        for (int i = 1; i < 7; i++) {

            imagenes.add(new ImageIcon(ModeloCrearSala.class.getResource(url + i + ".png")).getImage());
            System.out.println(imagenes.get(i - 1).hashCode());
            
        }

    }

    public String getRutaFondo() {
        return rutaFondo;
    }

    public void setRutaFondo(String rutaFondo) {
        this.rutaFondo = rutaFondo;
    }

    public String getRutaFuente() {
        return rutaFuente;
    }

    public void setRutaFuente(String rutaFuente) {
        this.rutaFuente = rutaFuente;
    }
    
    public List<Image> getImagenes() {
        return imagenes;
    }
}
