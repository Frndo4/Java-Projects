package ventana1;

import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Ventana2 extends javax.swing.JFrame {

    public Ventana2() {
        
        initComponents();
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        drawPanel = new DrawPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        F3C2 = new javax.swing.JTextField();
        F1C3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        F2 = new javax.swing.JRadioButton();
        F3C3 = new javax.swing.JTextField();
        F2C1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ZOOM = new javax.swing.JTextField();
        F2C2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        F1 = new javax.swing.JRadioButton();
        F2C3 = new javax.swing.JTextField();
        F1C1 = new javax.swing.JTextField();
        F3 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        F3C1 = new javax.swing.JTextField();
        F1C2 = new javax.swing.JTextField();
        BOTONGRAFICA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
            .addGap(0, 336, Short.MAX_VALUE)
        );
        drawPanelLayout.setVerticalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel6.setText("e^(");

        jLabel3.setText("x +");

        F3C2.setEnabled(false);

        F1C3.setEnabled(false);
        F1C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1C3ActionPerformed(evt);
            }
        });

        jLabel7.setText("x) +");

        buttonGroup1.add(F2);
        F2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        F2.setText("A sin(Bx)+C");
        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });

        F3C3.setEnabled(false);

        F2C1.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("ZOOM");

        jLabel4.setText("Sin (");

        ZOOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZOOMActionPerformed(evt);
            }
        });

        F2C2.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setText("Elige una función matemática");

        jLabel9.setText("x) +");

        buttonGroup1.add(F1);
        F1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        F1.setText("Ax^2+Bx+C");
        F1.setToolTipText("");
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });

        F2C3.setEnabled(false);
        F2C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2C3ActionPerformed(evt);
            }
        });

        F1C1.setEnabled(false);

        buttonGroup1.add(F3);
        F3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        F3.setText("A e^(Bx)+C");
        F3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3ActionPerformed(evt);
            }
        });

        jLabel10.setText("x^2 +");

        F3C1.setEnabled(false);

        F1C2.setEnabled(false);

        BOTONGRAFICA.setBackground(new java.awt.Color(0, 255, 204));
        BOTONGRAFICA.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        BOTONGRAFICA.setForeground(new java.awt.Color(255, 255, 255));
        BOTONGRAFICA.setText("Graficar");
        BOTONGRAFICA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONGRAFICAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(BOTONGRAFICA, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(F1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(F1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(F2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(F2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(F1C3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                .addComponent(F2C3))
                            .addGap(42, 42, 42))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(F1)
                                .addComponent(jLabel5)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(F3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(F2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(F3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(F3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(F3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ZOOM, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BOTONGRAFICA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel5)
                    .addGap(36, 36, 36)
                    .addComponent(F1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(F1C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(F1C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(F1C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addComponent(F2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(F2C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(F2C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(F2C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addComponent(F3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(F3C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(F3C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(F3C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(ZOOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(23, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(369, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(drawPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drawPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawPanelMouseClicked
                
    }//GEN-LAST:event_drawPanelMouseClicked

    private void drawPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawPanelMouseMoved
                
    }//GEN-LAST:event_drawPanelMouseMoved

    private void F1C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1C3ActionPerformed
        
    }//GEN-LAST:event_F1C3ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
        
        F1C1.setEnabled(false);
        F1C2.setEnabled(false);
        F1C3.setEnabled(false);
        
        F2C1.setEnabled(true);
        F2C2.setEnabled(true);
        F2C3.setEnabled(true);
        
        F3C1.setEnabled(false);
        F3C2.setEnabled(false);
        F3C3.setEnabled(false);
        
    }//GEN-LAST:event_F2ActionPerformed

    private void ZOOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZOOMActionPerformed
        
    }//GEN-LAST:event_ZOOMActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        
        F1C1.setEnabled(true);
        F1C2.setEnabled(true);
        F1C3.setEnabled(true);
        
        F2C1.setEnabled(false);
        F2C2.setEnabled(false);
        F2C3.setEnabled(false);
        
        F3C1.setEnabled(false);
        F3C2.setEnabled(false);
        F3C3.setEnabled(false);
        
    }//GEN-LAST:event_F1ActionPerformed

    private void F2C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2C3ActionPerformed
        
    }//GEN-LAST:event_F2C3ActionPerformed

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3ActionPerformed
        
        F1C1.setEnabled(false);
        F1C2.setEnabled(false);
        F1C3.setEnabled(false);
        
        F2C1.setEnabled(false);
        F2C2.setEnabled(false);
        F2C3.setEnabled(false);
        
        F3C1.setEnabled(true);
        F3C2.setEnabled(true);
        F3C3.setEnabled(true);
        
    }//GEN-LAST:event_F3ActionPerformed

    private void BOTONGRAFICAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONGRAFICAActionPerformed
        
        DrawPanel panel = (DrawPanel)drawPanel;

        if(F1.isSelected()){
            panel.Uno = Float.parseFloat(F1C1.getText());
            panel.Dos = Float.parseFloat(F1C2.getText());
            panel.Tres = Float.parseFloat(F1C2.getText());
            panel.Funcion= "1era";
        }
        
        if(F2.isSelected()){
            panel.Uno = Float.parseFloat(F2C1.getText());
            panel.Dos = Float.parseFloat(F2C1.getText());
            panel.Tres = Float.parseFloat(F2C1.getText());
            panel.Funcion= "2da";
        }
        
        if(F3.isSelected()){
            panel.Uno = Float.parseFloat(F3C1.getText());
            panel.Dos = Float.parseFloat(F3C2.getText());
            panel.Tres = Float.parseFloat(F3C3.getText());
            panel.Funcion= "3era";
        }
        
        if(!"".equals(ZOOM.getText())){
            panel.ZOOM= Integer.parseInt(ZOOM.getText());
        }
        
        else{
            
            panel.ZOOM = 100;
        
        }

        panel.repaint();
        
    }//GEN-LAST:event_BOTONGRAFICAActionPerformed

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
    private javax.swing.JButton BOTONGRAFICA;
    private javax.swing.JRadioButton F1;
    private javax.swing.JTextField F1C1;
    private javax.swing.JTextField F1C2;
    private javax.swing.JTextField F1C3;
    private javax.swing.JRadioButton F2;
    private javax.swing.JTextField F2C1;
    private javax.swing.JTextField F2C2;
    private javax.swing.JTextField F2C3;
    private javax.swing.JRadioButton F3;
    private javax.swing.JTextField F3C1;
    private javax.swing.JTextField F3C2;
    private javax.swing.JTextField F3C3;
    private javax.swing.JTextField ZOOM;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel drawPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}


class DrawPanel extends JPanel{
    
    public String Funcion="";
    public float Uno;
    public float Dos;
    public float Tres;
    public int ZOOM=100 ;
    
    @Override
    public void paint(Graphics g){

        g.setColor(Color.white);
   
        int W = this.getWidth();
        int H = this.getHeight();
        
        g.fillRect(0, 0, W, H);
        
        int pixelOffset = ZOOM;
        int numlinesvertical = W/pixelOffset;
        int numlineshorizontal = H/pixelOffset;
        
        g.setColor(new Color(192,192,192));
        
        int X1,X2,Y1,Y2;
        
        for(int i = 0;i<numlinesvertical/2+1;i++){
            
            X1 = W/2+pixelOffset*i;
            Y1 = 0;
            X2 = W/2+pixelOffset*i;
            Y2=H;
            
            g.drawLine(X1, Y1, X2, Y2);
            
        }
        
        for(int i = 0;i<numlinesvertical/2+1;i++){
            
            X1 = W/2-pixelOffset*i;
            Y1 = 0;
            X2 = W/2-pixelOffset*i;
            Y2=H;
            
            g.drawLine(X1, Y1, X2, Y2);
            
        }
        
        for(int i = 0;i<numlineshorizontal/2+1;i++){
            
            X1 = 0;
            Y1 = H/2+pixelOffset*i;
            X2 = W; 
            Y2=H/2+pixelOffset*i;
            
            g.drawLine(X1, Y1, X2, Y2);
            
        }
        
        for(int i = 0;i<numlineshorizontal/2+1;i++){
            
            X1 = 0;
            Y1 = H/2-pixelOffset*i;
            X2 = W; 
            Y2= H/2-pixelOffset*i;
            
            g.drawLine(X1, Y1, X2, Y2);
            
        }
        
        g.setColor(Color.blue);
        g.drawLine(W/2, 0, W/2, H);
        g.drawLine(0, H/2, W, H/2);
   
        for(float a =0;a<500;a+=0.01){
        
        if("1era".equals(Funcion)){
            float x =a;
            float y =(float) (Uno*(Math.pow(x, 2))+(Dos*x)+(Tres));
        
        int pixelX = (W/2)+(int)(x*pixelOffset);
        int pixelY = (H/2)-(int)(y*pixelOffset);
        
        g.fillOval(pixelX, pixelY, 5, 5);
    
        }
        
        if("2da".equals(Funcion)){
            float x =a;
            float y =(float)((Uno*Math.sin(Dos*x))+Tres);
        
        int pixelX = (W/2)+(int)(x*pixelOffset);
        int pixelY = (H/2)-(int)(y*pixelOffset);
        
        g.fillOval(pixelX, pixelY, 5, 5);
    
        }
        
        if("3era".equals(Funcion)){
            float x =a;
            float y =(float)((Uno*Math.exp(Dos*x))+Tres);
        
        int pixelX = (W/2)+(int)(x*pixelOffset);
        int pixelY = (H/2)-(int)(y*pixelOffset);
        
        g.fillOval(pixelX, pixelY, 5, 5);
    
        }
        
        }
        
        for(float b =0;b<500;b+=0.01){
        
        if("1era".equals(Funcion)){
            float x = -b;
            float y =(float) (Uno*(Math.pow(x, 2))+(Dos*x)+(Tres));
        
        int pixelX = (W/2)+(int)(x*pixelOffset);
        int pixelY = (H/2)-(int)(y*pixelOffset);
        
        g.fillOval(pixelX, pixelY, 5, 5);
    
        }
        
        if("2da".equals(Funcion)){
            float x = b;
            float y = (float)((Uno*Math.sin(Dos*x))+Tres);
        
        int pixelX = (W/2)+(int)(x*pixelOffset);
        int pixelY = (H/2)-(int)(y*pixelOffset);
        
        g.fillOval(pixelX, pixelY, 5, 5);
    
        }
        
        if("3era".equals(Funcion)){
            float x = b;
            float y =(float)((Uno*Math.exp(Dos*x))+Tres);
        
        int pixelX = (W/2)+(int)(x*pixelOffset);
        int pixelY = (H/2)-(int)(y*pixelOffset);
        
        g.fillOval(pixelX, pixelY, 5, 5);
    
        }
        
        }
        
        }
        
        }
    
    
    
    
