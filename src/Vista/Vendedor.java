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

    /**
     * Creates new form Vendedor
     */
    public Vendedor() {
        initComponents();
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
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgregarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregar.png"))); // NOI18N
        AgregarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCotizacionActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 34, 70, 73));

        ConsultarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Consultar.png"))); // NOI18N
        ConsultarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarCotizacionActionPerformed(evt);
            }
        });
        jPanel1.add(ConsultarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 34, 70, 73));

        ModificarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Modificar.png"))); // NOI18N
        jPanel1.add(ModificarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 34, 76, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Agregar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 113, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Modificar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 113, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Consultar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 113, -1, -1));

        EliminarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Eliminar.png"))); // NOI18N
        jPanel1.add(EliminarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 34, 71, 73));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Eliminar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 113, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Gestionar Cotizaciones");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 11, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoVendedor.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 140));

        jTabbedPane1.addTab("Cotizaciones", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Gestionar Facturacion");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, -1));
        jPanel2.add(AgregarFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 34, 61, 68));
        jPanel2.add(ConsultarFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 34, 58, 68));
        jPanel2.add(ModificarFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 34, 60, 68));
        jPanel2.add(EliminarFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 34, 62, 68));

        jLabel7.setText("Agregar");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 108, -1, -1));

        jLabel8.setText("Consultar");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 108, -1, -1));

        jLabel9.setText("Modificar");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 108, -1, -1));

        jLabel10.setText("Eliminar");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 108, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoVendedor.jpg"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 140));

        jTabbedPane1.addTab("Facturacion", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarCotizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsultarCotizacionActionPerformed

    private void AgregarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCotizacionActionPerformed
        agregarCotizacion U = new agregarCotizacion();
        U.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarCotizacionActionPerformed

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
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendedor().setVisible(true);
            }
        });
    }

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
