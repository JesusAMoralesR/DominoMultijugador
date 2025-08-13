package mensajeAlerta;

import observers.IObserver;

/**
 *
 * @author tacot
 */
public class ModeloMensaje {

    private String rutaFondo;
    private String rutaFuente;
    private String contenido;
    private IObserver observerAceptar;

    public ModeloMensaje(String mensaje) {
        contenido = mensaje;
        rutaFondo = "/imagenes/fondo/fondoPrincipal.png";
        rutaFuente = "/fuentes/InknutAntiqua-Regular.ttf";

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

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setObserverAceptar(IObserver observerAceptar) {
        this.observerAceptar = observerAceptar;
    }

    public void ejectutarObserverAceptar(){
        observerAceptar.actualizar();
    }
}
