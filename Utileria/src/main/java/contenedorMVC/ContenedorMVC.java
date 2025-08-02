package contenedorMVC;

import javax.swing.JFrame;

/**
 *
 * @author tacot
 */
public class ContenedorMVC {
    private Icomponente modelo;
    private Icomponente vista;
    private Icomponente Controlador;

    public ContenedorMVC(Icomponente modelo, Icomponente vista, Icomponente Controlador) {
        this.modelo = modelo;
        this.vista = vista;
        this.Controlador = Controlador;
    }

    public JFrame getVista() {
        return (JFrame) vista;
    }
    
    
}
