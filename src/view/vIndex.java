/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.awt.AWTUtilities;
import javax.swing.ImageIcon;


/**
 *
 * @author sebas
 */
public class vIndex extends javax.swing.JFrame {

    /**
     * Creates new form p
     */
    


    public vIndex() {
        
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/resources/img/Circulo Blanco.png")).getImage());
        AWTUtilities.setWindowOpaque(this, false);
        
       
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        imgfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gif/loading.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 360, 60));

        imgfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/main.png"))); // NOI18N
        getContentPane().add(imgfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
    }//GEN-LAST:event_formComponentAdded

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        
        
    }//GEN-LAST:event_formWindowOpened
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgfondo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
