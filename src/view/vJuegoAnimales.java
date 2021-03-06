/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.applet.AudioClip;
import java.awt.event.KeyEvent;
import model.mIconX;

/**
 *
 * @author sebas
 */
public class vJuegoAnimales extends javax.swing.JInternalFrame {
    
    private final int sizeX = 371, sizeY = 215;
    private final int zoomImg = 20;
    private final int iAnimales = 80;
    private final mIconX iPoloNorte = new mIconX("\\resources\\img\\ecosistemas\\nieve.jpg",sizeX,sizeY,zoomImg);
    private final mIconX iDesierto = new mIconX("\\resources\\img\\ecosistemas\\desierto.jpg",sizeX,sizeY,zoomImg);
    private final mIconX iFondoRio = new mIconX("\\resources\\img\\ecosistemas\\fondo-rio.jpg",sizeX,sizeY,zoomImg);
    private final mIconX iFondoMar= new mIconX("\\resources\\img\\ecosistemas\\fono-de-mar.jpg",sizeX,sizeY,zoomImg);
    private final mIconX iCielo = new mIconX("\\resources\\img\\ecosistemas\\cielo.jpg",sizeX,sizeY,zoomImg);
    private final mIconX iSelva= new mIconX("\\resources\\img\\ecosistemas\\selva.jpg",sizeX,sizeY,zoomImg);
    // Imagenes de animales 
    private final mIconX iPinguino= new mIconX("\\resources\\img\\animalitos\\pinguino.png",iAnimales,iAnimales,zoomImg);
    
    private int x = 459;
    private int y = 69;
    private final int velocidad =10;
    
    
    // Audio Cofre Magico
    private final String pathANevado =  "\\resources\\snd\\nieve.wav";
    private final AudioClip sNevado;
    // Audio Video
    private final String pathARio =  "\\resources\\snd\\rio.wav";
    private final AudioClip sRio;
    // adudio Musica
    private final String pathACielo = "\\resources\\snd\\viento.wav"; 
    private final AudioClip sCielo;

    // Audio Cofre Magico
    private final String pathADesierto =  "\\resources\\snd\\desierto.wav";
    private final AudioClip sDesierto;
    // Audio Video
    private final String pathAMar =  "\\resources\\snd\\fondo-de-mar.wav";
    private final AudioClip sMar;
    // adudio Musica
    private final String pathASelva = "\\resources\\snd\\selva-fondo.wav"; 
    private final AudioClip sSelva;
    
    private boolean playing = false;
    
    
    
    public vJuegoAnimales() {
        initComponents();
        imgPoloNorte.setIcon(iPoloNorte.Standard());
        imgDesierto.setIcon(iDesierto.Standard());
        imgRio.setIcon(iFondoRio.Standard());
        imgSelva.setIcon(iSelva.Standard());
        imgFondoMar.setIcon(iFondoMar.Standard());
        imgCielo.setIcon(iCielo.Standard());
        
        // animales :
        imgPinguino.setLocation(x, y);

        imgPinguino.setFocusable(true);
        
        // Sonidos
        sNevado = java.applet.Applet.newAudioClip(getClass().getResource(pathANevado.replace("\\", "/")));
        sRio = java.applet.Applet.newAudioClip(getClass().getResource(pathARio.replace("\\", "/")));
        sDesierto = java.applet.Applet.newAudioClip(getClass().getResource(pathADesierto.replace("\\", "/")));
        sCielo = java.applet.Applet.newAudioClip(getClass().getResource(pathACielo.replace("\\", "/")));
        sMar = java.applet.Applet.newAudioClip(getClass().getResource(pathAMar.replace("\\", "/")));
        sSelva= java.applet.Applet.newAudioClip(getClass().getResource(pathASelva.replace("\\", "/")));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imgPoloNorte = new javax.swing.JLabel();
        imgDesierto = new javax.swing.JLabel();
        imgRio = new javax.swing.JLabel();
        imgCielo = new javax.swing.JLabel();
        imgFondoMar = new javax.swing.JLabel();
        imgSelva = new javax.swing.JLabel();
        imgPinguino = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Juego Relacionar");
        setName("aaaaa"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("");
        jPanel1.setMaximumSize(new java.awt.Dimension(1192, 670));
        jPanel1.setMinimumSize(new java.awt.Dimension(1192, 670));
        jPanel1.setPreferredSize(new java.awt.Dimension(1192, 670));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Relaciona los animales con sus ecosistemas");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        imgPoloNorte.setBackground(new java.awt.Color(255, 0, 51));
        imgPoloNorte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPoloNorte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        imgPoloNorte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgPoloNorte.setMaximumSize(new java.awt.Dimension(356, 200));
        imgPoloNorte.setMinimumSize(new java.awt.Dimension(356, 200));
        imgPoloNorte.setPreferredSize(new java.awt.Dimension(356, 200));
        imgPoloNorte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgPoloNorteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgPoloNorteMouseExited(evt);
            }
        });

        imgDesierto.setBackground(new java.awt.Color(255, 0, 51));
        imgDesierto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgDesierto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        imgDesierto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imgDesierto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgDesierto.setMaximumSize(new java.awt.Dimension(356, 200));
        imgDesierto.setMinimumSize(new java.awt.Dimension(356, 200));
        imgDesierto.setPreferredSize(new java.awt.Dimension(356, 200));
        imgDesierto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgDesiertoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgDesiertoMouseExited(evt);
            }
        });

        imgRio.setBackground(new java.awt.Color(255, 0, 51));
        imgRio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgRio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        imgRio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgRio.setMaximumSize(new java.awt.Dimension(356, 200));
        imgRio.setMinimumSize(new java.awt.Dimension(356, 200));
        imgRio.setPreferredSize(new java.awt.Dimension(356, 200));
        imgRio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgRioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgRioMouseExited(evt);
            }
        });

        imgCielo.setBackground(new java.awt.Color(255, 0, 51));
        imgCielo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCielo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        imgCielo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imgCielo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgCielo.setMaximumSize(new java.awt.Dimension(356, 200));
        imgCielo.setMinimumSize(new java.awt.Dimension(356, 200));
        imgCielo.setPreferredSize(new java.awt.Dimension(356, 200));
        imgCielo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgCieloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgCieloMouseExited(evt);
            }
        });

        imgFondoMar.setBackground(new java.awt.Color(255, 0, 51));
        imgFondoMar.setForeground(new java.awt.Color(255, 51, 51));
        imgFondoMar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgFondoMar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        imgFondoMar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imgFondoMar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgFondoMar.setMaximumSize(new java.awt.Dimension(356, 200));
        imgFondoMar.setMinimumSize(new java.awt.Dimension(356, 200));
        imgFondoMar.setPreferredSize(new java.awt.Dimension(356, 200));
        imgFondoMar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgFondoMarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgFondoMarMouseExited(evt);
            }
        });

        imgSelva.setBackground(new java.awt.Color(255, 0, 51));
        imgSelva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSelva.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        imgSelva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imgSelva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgSelva.setMaximumSize(new java.awt.Dimension(356, 200));
        imgSelva.setMinimumSize(new java.awt.Dimension(356, 200));
        imgSelva.setPreferredSize(new java.awt.Dimension(356, 200));
        imgSelva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgSelvaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgSelvaMouseExited(evt);
            }
        });

        imgPinguino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPinguino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/icon/0.png"))); // NOI18N
        imgPinguino.setAlignmentX(0.5F);
        imgPinguino.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imgPinguino.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgPinguino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPinguinoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgPinguinoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgPinguinoMousePressed(evt);
            }
        });
        imgPinguino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imgPinguinoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgCielo, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgPoloNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgRio, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(imgPinguino, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgFondoMar, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSelva, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgDesierto, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(imgDesierto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(imgFondoMar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imgSelva, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imgPoloNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imgRio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imgCielo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(imgPinguino, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imgRioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRioMouseEntered
        imgRio.setIcon(iFondoRio.Entered());
        System.out.println("audio acction ");
        if (!playing){
            
            new Thread(){
                public void start(){
                   sRio.play();
                   playing = true;
                   System.out.println("Se reprodució audio");
               }
            }.start();
        } else{
            playing = false;
            sRio.stop();
        }

    }//GEN-LAST:event_imgRioMouseEntered

    private void imgRioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRioMouseExited
        imgRio.setIcon(iFondoRio.Exited());
        try {
            playing = false;
            sRio.stop();
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_imgRioMouseExited

    private void imgDesiertoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgDesiertoMouseEntered
        imgDesierto.setIcon(iDesierto.Entered());
        System.out.println("audio acction ");
        if (!playing){
            
            new Thread(){
                public void start(){
                   sDesierto.play();
                   playing = true;
                   System.out.println("Se reprodució audio");
               }
            }.start();
        } else{
            playing = false;
            sDesierto.stop();
        }

    }//GEN-LAST:event_imgDesiertoMouseEntered

    private void imgDesiertoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgDesiertoMouseExited
        imgDesierto.setIcon(iDesierto.Standard());
        try {
            playing = false;
            sDesierto.stop();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_imgDesiertoMouseExited

    private void imgPoloNorteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPoloNorteMouseExited
        imgPoloNorte.setIcon(iPoloNorte.Standard());
        try {
            playing = false;
            sNevado.stop();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_imgPoloNorteMouseExited

    private void imgPoloNorteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPoloNorteMouseEntered
        imgPoloNorte.setIcon(iPoloNorte.Entered());
        
        System.out.println("audio acction ");
        if (!playing){
            
            new Thread(){
                public void start(){
                   sNevado.play();
                   playing = true;
                   System.out.println("Se reprodució audio");
               }
            }.start();
        } else{
            playing = false;
            sNevado.stop();
        }
    }//GEN-LAST:event_imgPoloNorteMouseEntered

    private void imgCieloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCieloMouseEntered
        imgCielo.setIcon(iCielo.Entered());
        
        System.out.println("audio acction ");
        if (!playing){
            
            new Thread(){
                public void start(){
                   sCielo.play();
                   playing = true;
                   System.out.println("Se reprodució audio");
               }
            }.start();
        } else{
            playing = false;
            sCielo.stop();
        }
    }//GEN-LAST:event_imgCieloMouseEntered

    private void imgCieloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCieloMouseExited
        imgCielo.setIcon(iCielo.Standard());
        try {
            playing = false;
            sCielo.stop();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_imgCieloMouseExited

    private void imgFondoMarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgFondoMarMouseEntered
        imgFondoMar.setIcon(iFondoMar.Entered());
        System.out.println("audio acction ");
        if (!playing){
            
            new Thread(){
                public void start(){
                   sMar.play();
                   playing = true;
                   System.out.println("Se reprodució audio");
               }
            }.start();
        } else{
            playing = false;
            sMar.stop();
        }
    }//GEN-LAST:event_imgFondoMarMouseEntered

    private void imgFondoMarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgFondoMarMouseExited
        imgFondoMar.setIcon(iFondoMar.Standard());
        try {
            playing = false;
            sMar.stop();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_imgFondoMarMouseExited

    private void imgSelvaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSelvaMouseEntered
        imgSelva.setIcon(iSelva.Entered());
        System.out.println("audio acction ");
        if (!playing){
            
            new Thread(){
                public void start(){
                   sSelva.play();
                   playing = true;
                   System.out.println("Se reprodució audio");
               }
            }.start();
        } else{
            playing = false;
            sSelva.stop();
        }
    }//GEN-LAST:event_imgSelvaMouseEntered

    private void imgSelvaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSelvaMouseExited
        imgSelva.setIcon(iSelva.Exited());
        try {
            playing = false;
            sSelva.stop();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_imgSelvaMouseExited

    private void imgPinguinoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPinguinoMousePressed
        
    }//GEN-LAST:event_imgPinguinoMousePressed

    private void imgPinguinoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPinguinoMouseEntered

            try {
                Thread.sleep(100);
            } catch (Exception e) {
                
            }

    }//GEN-LAST:event_imgPinguinoMouseEntered

    private void imgPinguinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imgPinguinoKeyPressed

        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_UP:    System.out.println("press Key Up");     y = y-velocidad; break;
            case KeyEvent.VK_DOWN:  System.out.println("press Key Down");   y = y+velocidad; break;
            case KeyEvent.VK_LEFT:  System.out.println("press Key Left");   x = x-velocidad; break;
            case KeyEvent.VK_RIGHT: System.out.println("press Key Right");  x = x+velocidad; break;
        }
        imgPinguino.setLocation(x,y);
         System.out.println("\n\nevent pressPinguino:\nX: "+imgPinguino.getX()+"\nY: "+imgPinguino.getY());
    }//GEN-LAST:event_imgPinguinoKeyPressed

    private void imgPinguinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPinguinoMouseClicked
       imgPinguino.setFocusable(true);
    }//GEN-LAST:event_imgPinguinoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgCielo;
    private javax.swing.JLabel imgDesierto;
    private javax.swing.JLabel imgFondoMar;
    private javax.swing.JLabel imgPinguino;
    private javax.swing.JLabel imgPoloNorte;
    private javax.swing.JLabel imgRio;
    private javax.swing.JLabel imgSelva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
