/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Vendedor extends javax.swing.JFrame {
    String usuario;
    /**
     * Creates new form Vendedor
     */
    public Vendedor(String usuario) {
        this.usuario = usuario;
        initComponents();
        setDefaultCloseOperation(0);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        AgregarCotizacion = new javax.swing.JButton();
        ConsultarCotizacion = new javax.swing.JButton();
        ModificarCotizacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EliminarCotizacion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        AgregarFacturacion = new javax.swing.JButton();
        ConsultarFacturacion = new javax.swing.JButton();
        ModificarFacturacion = new javax.swing.JButton();
        EliminarFacturacion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgregarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregarCotizacion.png"))); // NOI18N
        AgregarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCotizacionActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 70));

        ConsultarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consultarCotizacion.png"))); // NOI18N
        ConsultarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarCotizacionActionPerformed(evt);
            }
        });
        jPanel1.add(ConsultarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 70, 70));

        ModificarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificarCotizacion.png"))); // NOI18N
        jPanel1.add(ModificarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 70, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modificar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Consultar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        EliminarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminarCotizacion.png"))); // NOI18N
        jPanel1.add(EliminarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 70, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Eliminar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gestionar Cotizaciones");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cerrar Sesion");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoVendedor.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 140));

        jTabbedPane1.addTab("Cotizaciones", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gestionar Facturacion");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        AgregarFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregarCotizacion.png"))); // NOI18N
        AgregarFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarFacturacionActionPerformed(evt);
            }
        });
        jPanel2.add(AgregarFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 70));

        ConsultarFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consultarCotizacion.png"))); // NOI18N
        ConsultarFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarFacturacionActionPerformed(evt);
            }
        });
        jPanel2.add(ConsultarFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 70, 68));

        ModificarFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificarCotizacion.png"))); // NOI18N
        jPanel2.add(ModificarFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 70, 68));

        EliminarFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminarCotizacion.png"))); // NOI18N
        jPanel2.add(EliminarFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 70, 68));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Agregar");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Consultar");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Modificar");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Eliminar");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cerrar Sesion");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoVendedor.jpg"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 140));

        jTabbedPane1.addTab("Ventas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarCotizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsultarCotizacionActionPerformed

    private void AgregarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCotizacionActionPerformed
        agregarCotizacion agregarCotizacion = new agregarCotizacion();
        agregarCotizacion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarCotizacionActionPerformed

    private void AgregarFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarFacturacionActionPerformed
        // TODO add your handling code here:
        agregarVenta agregarVenta = new agregarVenta(usuario);
        agregarVenta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarFacturacionActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        login U = new login();
        U.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        login U = new login();
        U.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void ConsultarFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarFacturacionActionPerformed
        JOptionPane.showMessageDialog(this, "Aqui ponemos toda l informacion jiji");
    }//GEN-LAST:event_ConsultarFacturacionActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarCotizacion;
    private javax.swing.JButton AgregarFacturacion;
    private javax.swing.JButton ConsultarCotizacion;
    private javax.swing.JButton ConsultarFacturacion;
    private javax.swing.JButton EliminarCotizacion;
    private javax.swing.JButton EliminarFacturacion;
    private javax.swing.JButton ModificarCotizacion;
    private javax.swing.JButton ModificarFacturacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    // End of variables declaration//GEN-END:variables
}
