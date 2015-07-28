
package vibalsoftgym;

import javax.swing.JOptionPane;
import view.FPresentacion;

/**
 *
 * @author JavaDev
 */
public class VibalSoftGym {
    
    public static void main(String[] args) {
        
        try{
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
            new FPresentacion(null, true).setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se pudo establecer el aspecto deseado" + e);
        }
    }
    
}
