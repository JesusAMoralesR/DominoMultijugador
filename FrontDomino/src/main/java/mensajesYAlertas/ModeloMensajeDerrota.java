/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensajesYAlertas;

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
