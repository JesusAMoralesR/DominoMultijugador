package crearSala;

import objetosDeEventos.EventoCrearSala;
import contenedorMVC.Icomponente;
import java.awt.Image;
import javax.swing.ImageIcon;
import observers.IObserver;
import observers.IObserverCrearSala;
import observers.IObserverMensajeAlerta;

/**
 *
 * @author tacot
 */
public class ModeloCrearSala implements Icomponente {

    private String rutaFondo;
    private String rutaFuente;
    private String url;
    private IObserverCrearSala observadorCrearSala;
    private IObserver observadorCancelar;
    private IObserver observadorAvatar;
    private IObserverMensajeAlerta observerValidacionFallida;
    private Image imagen;

    public ModeloCrearSala() {

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
        imagen = new ImageIcon(ModeloCrearSala.class.getResource(url + index + ".png")).getImage();
        System.out.println(url + index + ".png");
        ejecutarObservadorAvatar();
    }

    public Image getImagen() {
        return imagen;
    }

    public void setObservadorCrearSala(IObserverCrearSala observadorCrearSala) {
        this.observadorCrearSala = observadorCrearSala;
    }

    public void setObservadorCanselar(IObserver observadorCancelar) {
        this.observadorCancelar = observadorCancelar;
    }

    public void setObservadorAvatar(IObserver observadorAvatar) {
        this.observadorAvatar = observadorAvatar;
    }

    public void setObserverValidacionFallida(IObserverMensajeAlerta observerValidacionFallida) {
        this.observerValidacionFallida = observerValidacionFallida;
    }

    public void ejecutarObservadorCrearSala(EventoCrearSala eventoCrearSala) {
        if (this.observadorCrearSala != null) {
            this.observadorCrearSala.actualizar(eventoCrearSala);
        }
    }

    public void ejecutarObservadorCancelar() {
        if (this.observadorCancelar != null) {
            this.observadorCancelar.actualizar();
        }
    }

    public void ejecutarObservadorAvatar() {
        if (this.observadorAvatar != null) {
            this.observadorAvatar.actualizar();
        }
    }

    public void ejecutarObserverValidacionFallida(String mensaje) {
        if (this.observerValidacionFallida != null) {
            this.observerValidacionFallida.actualizar(mensaje);
        }
    }
}
