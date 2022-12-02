import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PuntoDeVenta extends javax.swing.JFrame {

    public String Cero = "0";
    public String Ticket = " ";
    public String[] listaProductos = new String[5];
    public int Total = 0;
    public int id = 1;
    
    public PuntoDeVenta() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        NombreTxt = new javax.swing.JTextField();
        Precio = new javax.swing.JLabel();
        PrecioTxt = new javax.swing.JTextField();
        DescuentoPalomita = new javax.swing.JCheckBox();
        DescuentoTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        StockTxt = new javax.swing.JTextField();
        AgregarProducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        Cantidad = new javax.swing.JLabel();
        CantidadTxt = new javax.swing.JTextField();
        Comprar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCompras = new javax.swing.JTable();
        TotalPagar = new javax.swing.JLabel();
        TotalPagarTxt = new javax.swing.JTextField();
        Pagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Nombre.setText("Nombre Producto:");

        Precio.setText("Precio:");

        PrecioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioTxtActionPerformed(evt);
            }
        });

        DescuentoPalomita.setText("Descuento:");
        DescuentoPalomita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescuentoPalomitaActionPerformed(evt);
            }
        });

        DescuentoTxt.setEnabled(false);

        jLabel1.setText("Stock:");

        AgregarProducto.setBackground(new java.awt.Color(51, 51, 51));
        AgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        AgregarProducto.setText("Agregar Producto");
        AgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProductoActionPerformed(evt);
            }
        });

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Precio", "Descuento", "Existencias"
            }
        ));
        jScrollPane2.setViewportView(TablaProductos);

        Cantidad.setText("Cantidad:");

        CantidadTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadTxtActionPerformed(evt);
            }
        });

        Comprar.setBackground(new java.awt.Color(0, 0, 0));
        Comprar.setForeground(new java.awt.Color(255, 255, 255));
        Comprar.setText("Comprar");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        TablaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Precio", "Cantidad", "Total"
            }
        ));
        jScrollPane1.setViewportView(TablaCompras);

        TotalPagar.setText("Total a pagar:");

        Pagar.setBackground(new java.awt.Color(0, 0, 0));
        Pagar.setForeground(new java.awt.Color(255, 255, 255));
        Pagar.setText("Pagar");
        Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StockTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DescuentoPalomita, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DescuentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CantidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Comprar)
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(AgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PrecioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(TotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalPagarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(Pagar)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio)
                    .addComponent(PrecioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescuentoPalomita)
                    .addComponent(DescuentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(StockTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Comprar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalPagar)
                    .addComponent(TotalPagarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pagar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrecioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioTxtActionPerformed

    private void AgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProductoActionPerformed
        int Precio = 0;
        int Inventario = 0;
        String Producto = "";
        
        CantidadTxt.setText(Cero);
        Producto = NombreTxt.getText();
        
        try{
            
            Precio = Integer.parseInt(this.PrecioTxt.getText());
            Inventario = Integer.parseInt(this.StockTxt.getText());
            int Desc = 0;
            
            
            
            int Descuento = 0;
            if(!"".equals(DescuentoTxt.getText())){
                
                Descuento = Integer.parseInt(DescuentoTxt.getText());
                
            }
                    
                if(Descuento != 0){
                    Desc = Descuento;
                }

            
                if(Precio > Desc){
                    Desc = Precio;
                    listaProductos[0] = String.valueOf(id);
                    id++;
                    listaProductos[1] = Producto;
                    listaProductos[2] = String.valueOf(Precio);
                    listaProductos[3] = String.valueOf(Descuento);
                    listaProductos[4] = String.valueOf(Inventario);
                    
                    DefaultTableModel tm = (DefaultTableModel)TablaProductos.getModel();
                    tm.addRow(listaProductos);
                    NombreTxt.setText("");
                    PrecioTxt.setText("");
                    DescuentoTxt.setText("");
                    StockTxt.setText("");
                    
                    
                }else{
                    
                    JOptionPane.showMessageDialog(null, "Recuerda que un descuento siempre es menor al precio original.\n"
                            + "Favor de ingresar una cantidad entera menor al precio.");
                    
                }
                
            }catch(Exception error){
                    JOptionPane.showMessageDialog(null, "Favor de ingresar números enteros en el stock y precio.");
            
        
        }
                
    }//GEN-LAST:event_AgregarProductoActionPerformed

    private void CantidadTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadTxtActionPerformed
        
        CantidadTxt.setText(" ");
                       
    }//GEN-LAST:event_CantidadTxtActionPerformed

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        
        int i = TablaProductos.getSelectedRow();
            
            if(i >= 0){
                
                String Price = "";
                String Name = "";
                String id = "";
                int Inventario = Integer.parseInt((String)TablaProductos.getValueAt(i, 4));
                
                id = (String)TablaProductos.getValueAt(i, 0);
                Name = (String)TablaProductos.getValueAt(i, 1);
                
                if(Integer.parseInt((String)TablaProductos.getValueAt(i, 3)) == 0){
                    
                    Price = (String)TablaProductos.getValueAt(i, 2);
                                        
                }else{
                    
                    Price = (String)TablaProductos.getValueAt(i, 3);
                    
                }
                
                int Items = Integer.parseInt(CantidadTxt.getText());
                int Subtotal = 0;
                
                if(Items > Inventario){
                    JOptionPane.showMessageDialog(null, "No hay tantos artículos en existencia.");
                }
                
                else{
                
                Subtotal = (int)(Integer.parseInt(Price)*Items);
                
                String Carrito[] = new String[5];
                Carrito[0] = String.valueOf(id);
                Carrito[1] = Name;
                Carrito[2] = String.valueOf(Price);
                Carrito[3] = String.valueOf(Items);
                Carrito[4] = String.valueOf(Subtotal);
                
                DefaultTableModel tm = (DefaultTableModel)TablaCompras.getModel();
                tm.addRow(Carrito);
                
                Ticket += "\n" + Name + "                       " + Items + "                      " + Subtotal;
                Total += Subtotal;  
                TotalPagarTxt.setText(String.valueOf(Total));
                
                }                  
            }
            else{
                JOptionPane.showMessageDialog(null, "Favor de seleccionar un producto.");
            }
            
            int Inventario = Integer.parseInt((String)TablaProductos.getValueAt(i, 4));
            int Items = Integer.parseInt(CantidadTxt.getText());
            
            if(Items <= Inventario){
            
            DefaultTableModel tm = (DefaultTableModel) TablaCompras.getModel();
                    String[] Carrito  = new String [5];
                    TablaProductos.setValueAt("" + (Inventario-Items), i, 4);
            }      
            
    }//GEN-LAST:event_ComprarActionPerformed

    private void DescuentoPalomitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescuentoPalomitaActionPerformed
        
        if(DescuentoPalomita.isSelected()){
            DescuentoTxt.setEnabled(true);
        }
        else{
            DescuentoTxt.setEnabled(false);
        }
            
    }//GEN-LAST:event_DescuentoPalomitaActionPerformed

    private void PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarActionPerformed
        
        Boolean op = true;
        Date objDate = new Date();
        int Cash = 0;
        while(op){
            try{
                Cash = Integer.parseInt(JOptionPane.showInputDialog("¿Con cuánto va a pagar?"));
                op = false;
            }
            catch(Exception error){
                JOptionPane.showMessageDialog(null, "Debes ingresar números enteros.");
            }
            
        }
        
        if(Cash >= Total){
            
            int Cambio = Cash - Total;
            
            JOptionPane.showMessageDialog(null, objDate.toString() + "\n\n" + "Producto:" + "            " + "Cantidad: " + "              " 
                    + "Total:" + "\n" 
                    + Ticket + "\n\n\nTotal a pagar: " + Total + "\nPagó con: " + Cash
                    + "\nCambio: " + Cambio + "\n\n\n¡Gracias por su compra!");
            
            TotalPagarTxt.setText("0");
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Cantidad Insuficiente.");
            
        }
        
    }//GEN-LAST:event_PagarActionPerformed

   
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
            java.util.logging.Logger.getLogger(PuntoDeVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuntoDeVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuntoDeVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuntoDeVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuntoDeVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarProducto;
    private javax.swing.JLabel Cantidad;
    private javax.swing.JTextField CantidadTxt;
    private javax.swing.JButton Comprar;
    private javax.swing.JCheckBox DescuentoPalomita;
    private javax.swing.JTextField DescuentoTxt;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JButton Pagar;
    private javax.swing.JLabel Precio;
    private javax.swing.JTextField PrecioTxt;
    private javax.swing.JTextField StockTxt;
    private javax.swing.JTable TablaCompras;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JLabel TotalPagar;
    private javax.swing.JTextField TotalPagarTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
