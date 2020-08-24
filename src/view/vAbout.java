/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.awt.AWTUtilities;
import javax.swing.ImageIcon;
import model.mIconX;


/**
 *
 * @author sebas
 */
public class vAbout extends javax.swing.JFrame {

    /**
     * Creates new form p
     */
    private final mIconX iClose= new mIconX("\\resources\\img\\about\\cerrar.png",120,120);
    private final mIconX iOk= new mIconX("\\resources\\img\\about\\ok.png",460,193);
    private final mIconX iS= new mIconX("\\resources\\img\\logo solo.png",265,265);


    public vAbout() {
        
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/resources/img/Circulo Blanco.png")).getImage());
        setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        imgOk.setIcon(iOk.Standard());
        imgclose.setIcon(iClose.Standard());
        imgSEPH.setIcon(iS.Standard());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgSEPH = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        imgclose = new javax.swing.JLabel();
        imgfondo = new javax.swing.JLabel();
        imgOk = new javax.swing.JLabel();

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

        imgSEPH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSEPH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgSEPH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgSEPHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgSEPHMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgSEPHMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                imgSEPHMouseReleased(evt);
            }
        });
        getContentPane().add(imgSEPH, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 270, 270));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("About");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel19.setFont(new java.awt.Font("MS PGothic", 0, 13)); // NOI18N
        jLabel19.setText("Apache Netbeans 12");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Documentation date:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        jLabel21.setFont(new java.awt.Font("MS PGothic", 0, 13)); // NOI18N
        jLabel21.setText("None");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Repositore:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        jLabel23.setFont(new java.awt.Font("MS PGothic", 0, 13)); // NOI18N
        jLabel23.setText("github.com/SebastianEPH/SoftwareEducativo_Java");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Developer by:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Product Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("MS PGothic", 0, 13)); // NOI18N
        jLabel4.setText("SebastianEPH");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("MS PGothic", 0, 13)); // NOI18N
        jLabel5.setText("EcoSoft");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Type Software:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("MS PGothic", 0, 13)); // NOI18N
        jLabel7.setText("Software Educativo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Architecture:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("MS PGothic", 0, 13)); // NOI18N
        jLabel9.setText("x86 bits || x64 bits");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("State:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("MS PGothic", 0, 13)); // NOI18N
        jLabel11.setText("Alfa");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Plataform:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        jLabel13.setFont(new java.awt.Font("MS PGothic", 0, 13)); // NOI18N
        jLabel13.setText("Windows - Linux - MacOS");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Programming language:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jLabel15.setFont(new java.awt.Font("MS PGothic", 0, 13)); // NOI18N
        jLabel15.setText("Java");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Licence:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        jLabel17.setFont(new java.awt.Font("MS PGothic", 0, 13)); // NOI18N
        jLabel17.setText("GNU Licence");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 110, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("IDE:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        imgclose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/about/cerrar.png"))); // NOI18N
        imgclose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgcloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgcloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgcloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgcloseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                imgcloseMouseReleased(evt);
            }
        });
        getContentPane().add(imgclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 125, 125));

        imgfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/about/panel.png"))); // NOI18N
        getContentPane().add(imgfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 490));

        imgOk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/about/ok.png"))); // NOI18N
        imgOk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgOkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgOkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgOkMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgOkMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                imgOkMouseReleased(evt);
            }
        });
        getContentPane().add(imgOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 460, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
    }//GEN-LAST:event_formComponentAdded

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
        
        
    }//GEN-LAST:event_formWindowOpened

    private void imgOkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgOkMouseEntered
       imgOk.setIcon(iOk.Entered());
    }//GEN-LAST:event_imgOkMouseEntered

    private void imgOkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgOkMouseExited
        imgOk.setIcon(iOk.Exited());
    }//GEN-LAST:event_imgOkMouseExited

    private void imgOkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgOkMousePressed
        imgOk.setIcon(iOk.Pressed());
    }//GEN-LAST:event_imgOkMousePressed

    private void imgOkMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgOkMouseReleased
        imgOk.setIcon(iOk.Released());
    }//GEN-LAST:event_imgOkMouseReleased

    private void imgOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgOkMouseClicked
        //this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_imgOkMouseClicked

    private void imgcloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgcloseMouseEntered
       imgclose.setIcon(iClose.Entered());
    }//GEN-LAST:event_imgcloseMouseEntered

    private void imgcloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgcloseMouseExited
        imgclose.setIcon(iClose.Exited());
    }//GEN-LAST:event_imgcloseMouseExited

    private void imgcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgcloseMousePressed
        imgclose.setIcon(iClose.Pressed());
    }//GEN-LAST:event_imgcloseMousePressed

    private void imgcloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgcloseMouseReleased
        imgclose.setIcon(iClose.Released());
    }//GEN-LAST:event_imgcloseMouseReleased

    private void imgcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgcloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_imgcloseMouseClicked

    private void imgSEPHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSEPHMouseEntered
        imgSEPH.setIcon(iS.Entered());
    }//GEN-LAST:event_imgSEPHMouseEntered

    private void imgSEPHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSEPHMouseExited
       imgSEPH.setIcon(iS.Exited());
    }//GEN-LAST:event_imgSEPHMouseExited

    private void imgSEPHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSEPHMousePressed
        imgSEPH.setIcon(iS.Pressed());
    }//GEN-LAST:event_imgSEPHMousePressed

    private void imgSEPHMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSEPHMouseReleased
       imgSEPH.setIcon(iS.Released());
    }//GEN-LAST:event_imgSEPHMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgOk;
    private javax.swing.JLabel imgSEPH;
    private javax.swing.JLabel imgclose;
    private javax.swing.JLabel imgfondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
