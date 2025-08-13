package contenedorMVC;

import javax.swing.JFrame;

/**
 *
 * @author tacot
 */
public class ContenedorMVC {
    private final Icomponente modelo;
    private final Icomponente vista;
    private final Icomponente Controlador;

    public ContenedorMVC(Icomponente modelo, Icomponente vista, Icomponente Controlador) {
        this.modelo = modelo;
        this.vista = vista;
        this.Controlador = Controlador;
    }

    public Icomponente getModelo() {
        return modelo;
    }

    public JFrame getVista() {
        return (JFrame) vista;
    }

    public Icomponente getControlador() {
        return Controlador;
    }
    
}
