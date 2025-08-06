package inicio;

import contenedorMVC.Icomponente;
import observers.IObserver;

/**
 *
 * @author tacot
 */
public class ModeloInicio implements Icomponente{
    private Boolean estadoBotones;
    private String textoBtn1;
    private String textoBtn2;
    private final String rutaFondo;
    private final String rutaFuente;
    private IObserver observadorDeBoton;
    private IObserver observadorCrearSala;
    private IObserver observadorUnirseSala;
    
    public ModeloInicio(){
    
        this.estadoBotones = true;
        textoBtn1 = "Jugar";
        textoBtn2 = "Salir";
        rutaFondo =  "/imagenes/fondo/fondoPrincipal.png";
        rutaFuente = "/fuentes/InknutAntiqua-Regular.ttf";
    }

    public Boolean getEstadoBotones() {
        return estadoBotones;
    }

    public void setEstadoBotones(Boolean estadoBotones) {
        this.estadoBotones = estadoBotones;
    }

    public String getTextoBtn1() {
        return textoBtn1;
    }

    public void setTextoBtn1(String textoBtn1) {
        this.textoBtn1 = textoBtn1;
    }

    public String getTextoBtn2() {
        return textoBtn2;
    }

    public void setTextoBtn2(String textoBtn2) {
        this.textoBtn2 = textoBtn2;
    }

    public void setObservadorDeBoton(IObserver observadorDeBoton) {
        this.observadorDeBoton = observadorDeBoton;
    }
    
    public void ejecutarBotonJugar(){
        if (observadorDeBoton != null) {
            observadorDeBoton.actualizar();
        }
    }
    
    public void ejecutarBotonVolver(){
        if (observadorDeBoton != null) {
            observadorDeBoton.actualizar();
        }
    }

    public String getRutaFondo() {
        return rutaFondo;
    }

    public String getRutaFuente() {
        return rutaFuente;
    }

    public void setObservadorCrearSala(IObserver observadorCrearSala) {
        this.observadorCrearSala = observadorCrearSala;
    }

    public void setObservadorUnirseSala(IObserver observadorUnirseSala) {
        this.observadorUnirseSala = observadorUnirseSala;
    }
    
    public void ejecutarCrearSala(){
        if (observadorCrearSala != null) {
            observadorCrearSala.actualizar();
        }
    }
    
    public void ejecutarUnirseSala(){
        if (observadorUnirseSala != null) {
            observadorUnirseSala.actualizar();
        }
    }
}
