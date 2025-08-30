package objetosPartida;

import java.awt.Image;

/**
 *
 * @author tacot
 */
public class Jugador {
    
    private String nombre;
    private Image avatar;
    private Nodo nodo;

    public Jugador() {
    }

    public Jugador(String nombre, Image avatar) {
        this.nombre = nombre;
        this.avatar = avatar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Image getAvatar() {
        return avatar;
    }

    public void setAvatar(Image avatar) {
        this.avatar = avatar;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }

}
