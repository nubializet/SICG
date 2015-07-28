
package Modelo.Control;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
/**
 *
 * @author JavaDev
 */
public class vSButtonRound extends JButton{     
    //Colores
    public static final Color NButtonPressed = new Color(138,180,87);//cuando metes el click
    public static final Color NButtonBorder = new Color(135,176,86);//borde del boton
    public static final Color NButton = new Color(150,196,95);//Color por default del boton
    public static final Color NButtonForeground = new Color(245,245,245);//Color por default de fuente del boton
    public static final Color NButtonForegroundSelected = new Color(216,222,159);//Color hover de fuente del 
    public static final Color WorkspaceBackground = new Color(250,250,250);//color del espacio de trabajo
    
   //Shape forma = new RoundRectangle2D.Double(0, 0,getWidth(), getHeight(), getRadioButton(),getRadioButton());
  
    
    private Dimension size;
    private final Dimension defaultDimension = new Dimension(40,40);
    private final MatteBorder borde = new MatteBorder(2,2,2,2,NButtonBorder); 
    private final Cursor manita = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
    
    
    public vSButtonRound() {
        this(null);
        inicializar();
    }

    public vSButtonRound(String text) {
        super(text);
        inicializar();
    }
    
    private void inicializar(){
        super.setContentAreaFilled(false);
        super.setFocusPainted(false);
        super.setBorderPainted(true);
        super.setBackground(NButton);
       super.setForeground(NButtonForeground);
        super.setText("boton");
      //  super.setBorder(borde);
        super.setPreferredSize(defaultDimension);
        super.setIconTextGap(10);
      //  super.setFont(Fuentes.getIcons(16));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        size = this.getPreferredSize();
        if (getModel().isPressed()) {
           g.setColor(NButtonPressed);
          this.setForeground(NButtonForegroundSelected);
        } else if (getModel().isRollover()) {
            g.setColor(NButton);
            this.setForeground(NButtonForeground);
            this.setCursor(manita);
        }else if(!getModel().isEnabled()){
            g.setColor(WorkspaceBackground);
            this.setForeground(NButtonBorder);
        }else {
            g.setColor(getBackground());
            this.setForeground(NButtonForeground);
        }
       // g.fillRect(0, 0, getWidth(), getHeight());
        g.fillOval(10, 10,getWidth(), getHeight());
        super.paintComponent(g);
        this.setPreferredSize(size);
    }
    
    
}
