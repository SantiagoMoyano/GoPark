package Interfaces;
import Data.*;
import javax.swing.ImageIcon;
import java.net.URL;
import javax.swing.JOptionPane;

public class IngSal extends javax.swing.JFrame {

    Reloj clock = new Reloj(0,0,0,0);
    public IngSal() {
        initComponents();
        setLocationRelativeTo(null);
        lblHora.setText(clock.toString());
        jLabel4.setText(clock.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnQuit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txbDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txbPatente = new javax.swing.JTextField();
        cbbTipo = new javax.swing.JComboBox();
        lblHora = new javax.swing.JLabel();
        btnIng = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblVehIS = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txbPatS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSal = new javax.swing.JButton();
        btnCancelS = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txbPrecio = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();

        btnQuit.setText("Salir");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESO/SALIDA");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel6.setText("Hora de ingreso:");

        jLabel7.setText("Tipo de vehículo:");

        jLabel8.setText("DNI:");

        jLabel9.setText("Patente:");

        cbbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Auto", "Taxi/Remis", "Camioneta", "Ambulancia", "Móvil Policial", "Grua", "Camión de Bomberos" }));
        cbbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTipoActionPerformed(evt);
            }
        });

        lblHora.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnIng.setText("Ingreso");
        btnIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblVehIS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txbPatente)
                            .addComponent(cbbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txbDni))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIng, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txbPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txbDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVehIS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnIng)
                        .addComponent(btnCancel)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ingreso", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel2.setText("Patente:");

        jLabel3.setText("Hora de salida:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnSal.setText("Salida");
        btnSal.setEnabled(false);
        btnSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalActionPerformed(evt);
            }
        });

        btnCancelS.setText("Cancelar");
        btnCancelS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSActionPerformed(evt);
            }
        });

        jLabel5.setText("Precio Hora: $");

        txbPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbPrecioActionPerformed(evt);
            }
        });

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCancelS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbPatS, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addComponent(txbPrecio))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txbPatS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSal)
                    .addComponent(btnCancelS)
                    .addComponent(btnOk))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Salida", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTipoActionPerformed
                switch (cbbTipo.getSelectedIndex()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                lblVehIS.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                lblVehIS.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                lblVehIS.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                lblVehIS.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                lblVehIS.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                lblVehIS.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                lblVehIS.setIcon(icon7);
                break;
            default:
                lblVehIS.setIcon(null);
                break;
        }
    }//GEN-LAST:event_cbbTipoActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txbPatente.setText("");
        txbDni.setText("");
        cbbTipo.setSelectedIndex(0);        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnQuitActionPerformed
    
    public static Cliente cls10[] = new Cliente[10];
    public static Cliente cls5[] = new Cliente[10];
    public static Cliente cls0[] = new Cliente[10];
    public static Cobro acciones = new Cobro();
    public static Adios bye = new Adios();
    private void btnIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngActionPerformed
        if(txbPatente.getText().equals("") || txbDni.getText().equals("") || cbbTipo.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Complete todos los campos.");
        }else{
        String pat = txbPatente.getText();
        int dni = Integer.parseInt(txbDni.getText());
        int tipo = cbbTipo.getSelectedIndex();
        int d = Integer.parseInt(Reloj.dia);
        int h = Integer.parseInt(Reloj.hora);
        int m = Integer.parseInt(Reloj.minutos);
        int s = Integer.parseInt(Reloj.segundos);
        int[] hora = {d,h,m,s};
        Cliente cl = new Cliente(pat, dni, tipo, hora);
        cl.tipoPrioridad();
                
        if(cl.getPrioridad()==10){
            for(int i=0; i<cls10.length; i++){
                if(cls10[i]==null){
                    cls10[i]=cl;
                    Reorder.ocuparLugar(cls10);
                    break;
                }}}
        if(cl.getPrioridad()==5){
            for(int i=0; i<cls5.length; i++){
                if(cls5[i]==null){
                    cls5[i]=cl;
                    Reorder.ocuparLugar(cls5);
                    break;
                }}}
        if(cl.getPrioridad()==0){
            for(int i=0; i<cls0.length; i++){
                if (cls0[i]==null){
                    cls0[i]=cl;
                    Reorder.ocuparLugar(cls0);
                    break;
                }}}
        this.setVisible(false);
        }
    }//GEN-LAST:event_btnIngActionPerformed

    private void btnCancelSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSActionPerformed
        txbPatS.setText("");
        txbPrecio.setText("");
        txbPrecio.setEnabled(true);
        btnSal.setEnabled(false);
    }//GEN-LAST:event_btnCancelSActionPerformed

    private void btnSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalActionPerformed
        if(txbPatS.getText().equals("") || txbPrecio.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Complete todos los campos.");
        }else{
            String fijar = txbPatS.getText();
            for(int i=0; i<cls0.length; i++){
                if(cls0[i]!=null){
                    if(cls0[i].getPatente().equals(fijar)){
                        cls0[i] = null;
                        Reorder.ocuparLugar(cls0);
                }}
            break;}
            for(int i=0; i<cls5.length; i++){
                if(cls5[i]!=null){ 
                    if(cls5[i].getPatente().equals(fijar)){
                        cls5[i] = null;
                        Reorder.ocuparLugar(cls5);
                }}
            break;}
            for(int i=0; i<cls10.length; i++){
                if(cls10[i]!=null){ 
                    if(cls10[i].getPatente().equals(fijar)){
                        cls10[i] = null;
                        Reorder.ocuparLugar(cls10);
                }}
            break;}
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnSalActionPerformed

    private void txbPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbPrecioActionPerformed
        txbPrecio.setEditable(false);
    }//GEN-LAST:event_txbPrecioActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if(txbPatS.getText().equals("") || txbPrecio.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Complete todos los campos.");
        }else{
            String fijar = txbPatS.getText();
            for(int i=0; i<cls0.length; i++){
                if(cls0[i]!=null){
                    if(cls0[i].getPatente().equals(fijar)){
                        acciones.diferenciaYTotal(cls0[i]);
                        acciones.setAdios(cls0[i]);
                        bye.setVisible(true);
                }}
            break;}
            for(int i=0; i<cls5.length; i++){
                if(cls5[i]!=null){ 
                    if(cls5[i].getPatente().equals(fijar)){
                        acciones.diferenciaYTotal(cls5[i]);
                        acciones.setAdios(cls5[i]);
                        bye.setVisible(true);
                }}
            break;}
            for(int i=0; i<cls10.length; i++){
                if(cls10[i]!=null){ 
                    if(cls10[i].getPatente().equals(fijar)){
                        acciones.diferenciaYTotal(cls10[i]);
                        acciones.setAdios(cls10[i]);
                        bye.setVisible(true);
            break;}
                }}
        btnSal.setEnabled(true);
        txbPrecio.setEnabled(false);
        }
    }//GEN-LAST:event_btnOkActionPerformed

    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IngSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new IngSal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancelS;
    private javax.swing.JButton btnIng;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnSal;
    private javax.swing.JComboBox cbbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblVehIS;
    private javax.swing.JTextField txbDni;
    private javax.swing.JTextField txbPatS;
    private javax.swing.JTextField txbPatente;
    public static javax.swing.JTextField txbPrecio;
    // End of variables declaration//GEN-END:variables
}