/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poouni3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Ventana2 extends javax.swing.JFrame {

    public int mouseX = 0, mouseY = 0;
    
    
    public Ventana2() {
        initComponents();
        
        buttonGroup2.add(Rojo);
        buttonGroup2.add(Verde);
        buttonGroup2.add(Azul);
        buttonGroup2.add(Amarillo);
        buttonGroup2.add(Naranja);
        buttonGroup2.add(Negro);
        buttonGroup2.add(Rosa);
        buttonGroup2.add(Gris);
        
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        drawPanel = new DrawPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        xText = new javax.swing.JTextField();
        yText = new javax.swing.JTextField();
        rText = new javax.swing.JTextField();
        mouseLabel = new javax.swing.JLabel();
        radioCircle = new javax.swing.JRadioButton();
        radioSquare = new javax.swing.JRadioButton();
        Rojo = new javax.swing.JRadioButton();
        Verde = new javax.swing.JRadioButton();
        Azul = new javax.swing.JRadioButton();
        Amarillo = new javax.swing.JRadioButton();
        Naranja = new javax.swing.JRadioButton();
        Coloreishons = new javax.swing.JLabel();
        Negro = new javax.swing.JRadioButton();
        Rosa = new javax.swing.JRadioButton();
        Gris = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        drawPanel.setBackground(new java.awt.Color(255, 255, 255));
        drawPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                drawPanelMouseMoved(evt);
            }
        });
        drawPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drawPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout drawPanelLayout = new javax.swing.GroupLayout(drawPanel);
        drawPanel.setLayout(drawPanelLayout);
        drawPanelLayout.setHorizontalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );
        drawPanelLayout.setVerticalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        jLabel1.setText("X:");

        jLabel2.setText("Y:");

        jLabel3.setText("Radio:");

        rText.setText("10");

        mouseLabel.setText("0 , 0");

        buttonGroup1.add(radioCircle);
        radioCircle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioCircle.setSelected(true);
        radioCircle.setText("Círculo");

        buttonGroup1.add(radioSquare);
        radioSquare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioSquare.setText("Cuadrado");

        Rojo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(Rojo);
        Rojo.setForeground(new java.awt.Color(204, 0, 51));
        Rojo.setText("Rojo");
        Rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RojoActionPerformed(evt);
            }
        });

        buttonGroup2.add(Verde);
        Verde.setForeground(new java.awt.Color(0, 204, 51));
        Verde.setText("Verde");
        Verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerdeActionPerformed(evt);
            }
        });

        Azul.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup2.add(Azul);
        Azul.setForeground(new java.awt.Color(0, 51, 255));
        Azul.setText("Azul");
        Azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AzulActionPerformed(evt);
            }
        });

        buttonGroup2.add(Amarillo);
        Amarillo.setForeground(new java.awt.Color(255, 255, 0));
        Amarillo.setText("Amarillo");
        Amarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmarilloActionPerformed(evt);
            }
        });

        buttonGroup2.add(Naranja);
        Naranja.setForeground(new java.awt.Color(255, 153, 51));
        Naranja.setText("Naranja");
        Naranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NaranjaActionPerformed(evt);
            }
        });

        Coloreishons.setBackground(new java.awt.Color(0, 0, 0));
        Coloreishons.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Coloreishons.setForeground(new java.awt.Color(255, 255, 255));
        Coloreishons.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Coloreishons.setText("Colores:");
        Coloreishons.setOpaque(true);

        buttonGroup2.add(Negro);
        Negro.setText("Negro");

        buttonGroup2.add(Rosa);
        Rosa.setForeground(new java.awt.Color(255, 153, 255));
        Rosa.setText("Rosa");

        Gris.setForeground(new java.awt.Color(153, 153, 153));
        Gris.setText("Gris");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(radioSquare)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(xText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 6, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(mouseLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Azul)
                                            .addComponent(Amarillo))
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Gris, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Naranja, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Negro)
                                        .addGap(18, 18, 18)
                                        .addComponent(Rojo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Verde)
                                        .addGap(18, 18, 18)
                                        .addComponent(Rosa))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(radioCircle))
                                    .addComponent(Coloreishons, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(drawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(xText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(yText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(radioCircle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioSquare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Coloreishons)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Negro)
                            .addComponent(Rojo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Verde)
                            .addComponent(Rosa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Azul)
                            .addComponent(Naranja))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Amarillo)
                            .addComponent(Gris))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mouseLabel))
                    .addComponent(drawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drawPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawPanelMouseClicked
        
        int type = 0;
        if(radioCircle.isSelected())
            type = 0;
        if(radioSquare.isSelected())
            type = 1;
        
        int Colores = 0;
        
        if(Negro.isSelected()==true){
            Colores = 0;
        }
        
        if(Rojo.isSelected()==true){
            Colores = 1;
        }
        
        if(Verde.isSelected()==true){
            Colores = 2;
        }
        
        if(Azul.isSelected()==true){
            Colores = 3;
        }
        
        if(Amarillo.isSelected()==true){
            Colores = 4;
        }
        
        if(Naranja.isSelected()==true){
            Colores = 5;
        }
        
        if(Rosa.isSelected()==true){
            Colores = 6;
        }
        
        if(Gris.isSelected()==true){
            Colores = 7;
        }
        

        
        int r = Integer.parseInt(rText.getText());
        
        DrawPanel panel = (DrawPanel)drawPanel;
        
        for (int i = 0; i < panel.diametros.length; i++) {
            if(panel.diametros[i] == 0){
                panel.circleX[i] = mouseX;
                panel.circleY[i] = mouseY;
                panel.diametros[i] = r;
                panel.types[i] = type;
                panel.color[i]= Colores;
                break;
            }
        }
        
        panel.repaint();
        
    }//GEN-LAST:event_drawPanelMouseClicked

    private void drawPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawPanelMouseMoved
        
        mouseX = evt.getX();
        mouseY = evt.getY();
        mouseLabel.setText(mouseX + " , " + mouseY);
        
    }//GEN-LAST:event_drawPanelMouseMoved

    private void RojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RojoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RojoActionPerformed

    private void VerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerdeActionPerformed

    private void AzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AzulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AzulActionPerformed

    private void AmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmarilloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmarilloActionPerformed

    private void NaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NaranjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NaranjaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Amarillo;
    private javax.swing.JRadioButton Azul;
    private javax.swing.JLabel Coloreishons;
    private javax.swing.JRadioButton Gris;
    private javax.swing.JRadioButton Naranja;
    private javax.swing.JRadioButton Negro;
    private javax.swing.JRadioButton Rojo;
    private javax.swing.JRadioButton Rosa;
    private javax.swing.JRadioButton Verde;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel drawPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel mouseLabel;
    private javax.swing.JTextField rText;
    private javax.swing.JRadioButton radioCircle;
    private javax.swing.JRadioButton radioSquare;
    private javax.swing.JTextField xText;
    private javax.swing.JTextField yText;
    // End of variables declaration//GEN-END:variables
}


class DrawPanel extends JPanel{
    
    public int circleX[] = new int[100];
    public int circleY[] = new int[100];
    public int diametros[] = new int[100];
    public int types[] = new int[100]; //0 es un circulo, 1 es un cuadrado
    public int color [] = new int [100];
    
    
    
    @Override
    public void paint(Graphics g){
        //JOptionPane.showMessageDialog(this, "Draw Circle");
        
        g.setColor(Color.white);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        
        g.setColor(Color.black);
        for (int i = 0; i < diametros.length; i++) {
            if(diametros[i] != 0){
                if(types[i] == 0){
                    
                if (color [i] == 0){
                    g.setColor(Color.black);
                    g.fillOval(circleX[i]-diametros[i]/2, circleY[i]-diametros[i]/2, diametros[i], diametros[i]);
                }
                
                if (color [i] == 1){
                    g.setColor(Color.red);
                    g.fillOval(circleX[i]-diametros[i]/2, circleY[i]-diametros[i]/2, diametros[i], diametros[i]);
                }
                
                if (color [i] == 2){
                    g.setColor(Color.green);
                    g.fillOval(circleX[i]-diametros[i]/2, circleY[i]-diametros[i]/2, diametros[i], diametros[i]);
                }
                
                if (color [i] == 3){
                    g.setColor(Color.blue);
                    g.fillOval(circleX[i]-diametros[i]/2, circleY[i]-diametros[i]/2, diametros[i], diametros[i]);
                }
                
                if (color [i] == 4){
                    g.setColor(Color.yellow);
                    g.fillOval(circleX[i]-diametros[i]/2, circleY[i]-diametros[i]/2, diametros[i], diametros[i]);
                }
                
                if (color [i] == 5){
                    g.setColor(Color.orange);
                    g.fillOval(circleX[i]-diametros[i]/2, circleY[i]-diametros[i]/2, diametros[i], diametros[i]);
                }
                
                if (color [i] == 6){
                    g.setColor(Color.pink);
                    g.fillOval(circleX[i]-diametros[i]/2, circleY[i]-diametros[i]/2, diametros[i], diametros[i]);
                }
                
                if (color [i] == 7){
                    g.setColor(Color.gray);
                    g.fillOval(circleX[i]-diametros[i]/2, circleY[i]-diametros[i]/2, diametros[i], diametros[i]);
                }
                
                }
                else{
                   
                if (color [i] == 0){
                    g.setColor(Color.black);
                    g.fillRect(circleX[i]-diametros[i]/2, circleY[i]-diametros[i]/2, diametros[i], diametros[i]);
                }
                    
                if (color [i] == 1){
                    g.setColor(Color.red);
                    g.fillRect(circleX[i]-diametros[i]/2, circleY[i]-diametros[i]/2, diametros[i], diametros[i]);
                }
                    
                if (color [i] == 2){
                    g.setColor(Color.green);
                    g.fillRect(circleX[i]-diametros[i]/2, circleY[i]-diametros[i]/2, diametros[i], diametros[i]);
                }
                
                if (color [i] == 3){
                    g.setColor(Color.blue);
                    g.fillRect(circleX[i]-diametros[i]/2, circleY[i]-diametros[i]/2, diametros[i], diametros[i]); 
                }
                    
                if (color [i] == 4){
                    g.setColor(Color.yellow);
                    g.fillRect(circleX[i]-diametros[i]/2, circleY[i]-diametros[i]/2, diametros[i], diametros[i]);
                }
                    
                if (color [i] == 5){
                    g.setColor(Color.orange);
                    g.fillRect(circleX[i]-diametros[i]/2, circleY[i]-diametros[i]/2, diametros[i], diametros[i]);
                }
                    
                if (color [i] == 6){
                    g.setColor(Color.pink);
                    g.fillRect(circleX[i]-diametros[i]/2, circleY[i]-diametros[i]/2, diametros[i], diametros[i]);
                }
                    
                if (color [i] == 7){
                    g.setColor(Color.gray);
                    g.fillRect(circleX[i]-diametros[i]/2, circleY[i]-diametros[i]/2, diametros[i], diametros[i]);
                }
                    
                }
            }
        }
        
        
    }
    
}




