package objetosPartida;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author tacot
 */
public class FichaFront extends JLabel{

    private final Color colorPersonalizado = new Color(161, 136, 93);
    
    public FichaFront(int num1, int num2, int horizontalAligment) {
        super(num1 + ":" + num2, SwingConstants.CENTER);
        
        this.setPreferredSize(new Dimension(48, 34));
        this.setFont(new Font("Arial", Font.BOLD, 14));
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setOpaque(false);
        this.setBackground(colorPersonalizado);
    }

}
