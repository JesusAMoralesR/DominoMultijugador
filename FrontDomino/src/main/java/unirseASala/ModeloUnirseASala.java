package unirseASala;

import contenedorMVC.Icomponente;
import crearSala.ModeloCrearSala;
import java.awt.Image;
import java.util.LinkedList;
import java.util.List;
import javax.swing.ImageIcon;
import observers.IObserver;

/**
 *
 * @author tacot
 */
public class ModeloUnirseASala implements Icomponente{

    private String rutaFondo;
    private String rutaFuente;
    private String url;
    private IObserver observadorCrearSala;
    private IObserver observadorCancelar;
    private IObserver observadorAvatar;
    private Image imagen;

    public ModeloUnirseASala() {

        cargarFuentes();

    }

    public void cargarFuentes() {

        rutaFondo = "/imagenes/fondo/fondoPrincipal.png";
        rutaFuente = "/fuentes/InknutAntiqua-Regular.ttf";
        url = "/imagenes/avatares/avt";

        imagen = new ImageIcon(ModeloCrearSala.class.getResource(url + 1 + ".png")).getImage();
        
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

    public void CambiarAvatar(int index) {
        imagen = new ImageIcon(ModeloCrearSala.class.getResource(url +index + ".png")).getImage();
        ejecutarObservadorAvatar();
    }

    public Image getImagen() {
        return imagen;
    }

    public void setObservadorCrearSala(IObserver observadorCrearSala) {
        this.observadorCrearSala = observadorCrearSala;
    }

    public void setObservadorCanselar(IObserver observadorCancelar) {
        this.observadorCancelar = observadorCancelar;
    }

    public void setObservadorAvatar(IObserver observadorAvatar) {
        this.observadorAvatar = observadorAvatar;
    }
    
    public void ejecutarObservadorCrearSala(){
        this.observadorCrearSala.actualizar();
    }
    
    public void ejecutarObservadorCancelar(){
        this.observadorCancelar.actualizar();
    }
    
    public void ejecutarObservadorAvatar(){
        this.observadorAvatar.actualizar();
    }

}
