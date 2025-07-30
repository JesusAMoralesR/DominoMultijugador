package utileria;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author tacot
 */
public class PanelConFondo extends JPanel{

    private final Image fondo;
    
    public PanelConFondo(String url) {
        fondo = new ImageIcon(PanelConFondo.class.getResource(url)).getImage();
        setOpaque(false);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
    }
    
}