package ObjetosDeEventos;

import java.awt.Image;

/**
 *
 * @author tacot
 */
public class EventoUnirseASala {

    private String codigo;
    private String nombreJugador;
    private Image avatar;
    private Nodo nodo;

    public EventoUnirseASala() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
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
