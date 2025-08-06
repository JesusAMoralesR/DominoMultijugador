package mensajeAlerta;

import mensajeDerrota.*;

/**
 *
 * @author tacot
 */
public class ModeloMensajeDerrota {

    private String rutaFondo;
    private String rutaFuente;

    public ModeloMensajeDerrota() {

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

    
}
