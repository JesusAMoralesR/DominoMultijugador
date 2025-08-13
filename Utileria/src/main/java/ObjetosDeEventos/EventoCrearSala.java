package ObjetosDeEventos;

import java.awt.Image;

/**
 *
 * @author tacot
 */
public class EventoCrearSala {
    private String nombre;
    private int numFichas;
    private Image avatar;
    private Nodo nodo;

    public EventoCrearSala() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumFichas() {
        return numFichas;
    }

    public void setNumFichas(int numFichas) {
        this.numFichas = numFichas;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }

    public Image getAvatar() {
        return avatar;
    }

    public void setAvatar(Image avatar) {
        this.avatar = avatar;
    }
}
