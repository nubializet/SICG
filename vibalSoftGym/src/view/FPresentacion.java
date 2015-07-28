
package view;

import java.awt.event.ActionEvent;
import javax.swing.Timer;

/**
 *
 * @author JavaDev
 */
public class FPresentacion extends javax.swing.JDialog {
  private Timer timer1;
    public FPresentacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
          initOtherComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barradeprogreso = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barradeprogreso.setBackground(new java.awt.Color(0, 102, 102));
        barradeprogreso.setForeground(new java.awt.Color(0, 153, 204));
        barradeprogreso.setValue(5);
        barradeprogreso.setBorderPainted(false);
        barradeprogreso.setFocusTraversalPolicyProvider(true);
        barradeprogreso.setOpaque(true);
        barradeprogreso.setStringPainted(true);
        getContentPane().add(barradeprogreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 980, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/presentaciongimansio.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(980, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   private void initOtherComponents(){
        java.awt.event.ActionListener al = new java.awt.event.ActionListener(){
           @Override
            public void actionPerformed(ActionEvent e) {
              onTimer();
            }
        };
        timer1 = new javax.swing.Timer(30, al);
        timer1.start();
    }
    
    int i = 0;
    private void onTimer(){
        i = i + 1;
        barradeprogreso.setValue(i);
        if(i == 100){
            timer1.stop();
            this.setVisible(false);
            this.dispose();
           // new FAcceso(this,true).setVisible(true);
          //  new FPanelCircular(new javax.swing.JFrame(),true).setVisible(true);
            //new FVentanas(this,true).setVisible(true);            
            JPrincipal ventana= new JPrincipal();
            ventana.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barradeprogreso;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
