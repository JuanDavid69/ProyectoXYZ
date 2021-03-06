/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Usuario
 */
public class modificarSede extends javax.swing.JFrame {
    String usuario;
    DefaultTableModel tabla;
    ControlSedes controlSedes = new ControlSedes();
    /**
     * Creates new form modificarSede
     */
    public modificarSede(String usuario) {
        this.usuario = usuario;
        initComponents();
        setDefaultCloseOperation(0);
        this.setLocationRelativeTo(null);
        cargarSedes("");
    }
    
    void cargarSedes(String busqueda){
        tabla = controlSedes.cargarSedes(busqueda, "Activa");
        this.sedes.setModel(tabla);
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        sede = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        ciudad = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabelNumeroOrden = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Seleccionar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cerrar = new javax.swing.JButton();
        telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sedes = new javax.swing.JTable();
        Modificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 180, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 180, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 180, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 180, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 180, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 180, 10));

        sede.setEditable(false);
        sede.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        sede.setForeground(new java.awt.Color(102, 0, 102));
        sede.setBorder(null);
        sede.setOpaque(false);
        jPanel1.add(sede, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 180, 25));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel2.setText("Dirección:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 130, 25));

        busqueda.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        busqueda.setForeground(new java.awt.Color(102, 0, 102));
        busqueda.setBorder(null);
        busqueda.setOpaque(false);
        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });
        busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busquedaKeyReleased(evt);
            }
        });
        jPanel1.add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 180, 25));

        ciudad.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        ciudad.setForeground(new java.awt.Color(102, 0, 102));
        ciudad.setBorder(null);
        ciudad.setOpaque(false);
        jPanel1.add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 180, 25));

        direccion.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        direccion.setForeground(new java.awt.Color(102, 0, 102));
        direccion.setBorder(null);
        direccion.setOpaque(false);
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 180, 25));

        jLabel4.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel4.setText("Ciudad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 130, 25));

        jLabelNumeroOrden.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelNumeroOrden.setText("Buscar:");
        jPanel1.add(jLabelNumeroOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 80, 25));

        nombre.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(102, 0, 102));
        nombre.setBorder(null);
        nombre.setOpaque(false);
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 180, 25));

        jLabel3.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel3.setText("Telefono:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 130, 25));

        Seleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SELECCIONAR2.png"))); // NOI18N
        Seleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Seleccionar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SELECCIONAR.png"))); // NOI18N
        Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(Seleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 150, 40));

        jLabel6.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel6.setText("Nombre sede:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 130, 25));

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CERRAR2.png"))); // NOI18N
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CERRAR.png"))); // NOI18N
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 150, 40));

        telefono.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        telefono.setForeground(new java.awt.Color(102, 0, 102));
        telefono.setBorder(null);
        telefono.setOpaque(false);
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 180, 25));

        jLabel8.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel8.setText("N° Sede:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 130, 25));

        sedes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        sedes.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        sedes.setForeground(new java.awt.Color(102, 0, 102));
        sedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        sedes.setPreferredSize(new java.awt.Dimension(300, 200));
        sedes.setSelectionBackground(new java.awt.Color(102, 0, 102));
        jScrollPane1.setViewportView(sedes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 310, 170));

        Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MODIFICAR2.png"))); // NOI18N
        Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modificar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MODIFICAR.png"))); // NOI18N
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MODIFICARSEDES.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyReleased
        cargarSedes(this.busqueda.getText());
    }//GEN-LAST:event_busquedaKeyReleased

    private void SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarActionPerformed
        int  fila = this.sedes.getSelectedRow();
        if (fila<0) {
            JOptionPane.showMessageDialog(this, "Seleccione una sede para modificar");
        } else {
            String id = this.sedes.getValueAt(fila, 0).toString();
            String[] sede = controlSedes.consultarSede(id);
            if (sede == null) {
                JOptionPane.showMessageDialog(this, "No se pudo consultar la sede seleccionada");
            } else {
                this.sede.setText(sede[0]);
                this.nombre.setText(sede[1]);
                this.direccion.setText(sede[2]);
                this.ciudad.setText(sede[3]);
                this.telefono.setText(sede[4]);
            }
        }
    }//GEN-LAST:event_SeleccionarActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        Menu_Gerente u = new Menu_Gerente(usuario);
        u.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cerrarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        try{
            int  fila = this.sedes.getSelectedRow();
            if((this.nombre.getText().equals(""))|| (this.direccion.getText().equals("")) || (this.ciudad.getText().equals(""))
                    || (this.telefono.getText().equals(""))){
                JOptionPane.showMessageDialog(this, "Ingrese la informacion correspondiente en cada campo");
            }else{
                String id_sede = this.sede.getText();
                String nombre = this.nombre.getText();
                String direccion = this.direccion.getText();
                String ciudad = this.ciudad.getText();
                String telefono = this.telefono.getText();
                    
                String mensaje = controlSedes.modificarSede(id_sede, nombre, direccion, ciudad, telefono);
                JOptionPane.showMessageDialog(this, mensaje);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al capturar los datos");
            System.out.println(e);
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void telefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyReleased
        
    }//GEN-LAST:event_telefonoKeyReleased

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        char tel = evt.getKeyChar();
        if(Character.isLetter(tel)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo caracteres numericos");
        }
    }//GEN-LAST:event_telefonoKeyTyped

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Seleccionar;
    private javax.swing.JTextField busqueda;
    private javax.swing.JButton cerrar;
    private javax.swing.JTextField ciudad;
    private javax.swing.JTextField direccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelNumeroOrden;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField sede;
    private javax.swing.JTable sedes;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
