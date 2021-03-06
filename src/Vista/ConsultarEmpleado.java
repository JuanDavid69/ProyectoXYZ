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
public class ConsultarEmpleado extends javax.swing.JFrame {
    String usuario;
    DefaultTableModel tabla;
    ControlUsuario controlUsuario = new ControlUsuario();
    /**
     * Creates new form ConsultarEmpleado
     */
    public ConsultarEmpleado(String usuario) {
        this.usuario = usuario;
        initComponents();
        setDefaultCloseOperation(0);
        this.setLocationRelativeTo(null);
        cargarUsuarios("");
    }
    
    void cargarUsuarios(String busqueda){
        tabla = controlUsuario.cargarUsuarios(busqueda);
        this.empleados.setModel(tabla);
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
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        empleados = new javax.swing.JTable();
        constular = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        cedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cargo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        salario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        sede = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        contraseña = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 170, 10));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 170, 10));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 170, 10));
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 170, 10));
        jPanel1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 170, 10));
        jPanel1.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 170, 10));
        jPanel1.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 170, 10));
        jPanel1.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 170, 10));
        jPanel1.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 170, 10));
        jPanel1.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 170, 10));
        jPanel1.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 170, 10));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel2.setText("Buscar:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 25));

        busqueda.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        busqueda.setBorder(null);
        busqueda.setOpaque(false);
        busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busquedaKeyReleased(evt);
            }
        });
        jPanel1.add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 160, 25));

        empleados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
        empleados.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        empleados.setForeground(new java.awt.Color(102, 0, 102));
        empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        empleados.setPreferredSize(new java.awt.Dimension(400, 700));
        empleados.setSelectionBackground(new java.awt.Color(102, 0, 102));
        jScrollPane1.setViewportView(empleados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 330, 300));

        constular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CONSULTAR2.png"))); // NOI18N
        constular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        constular.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CONSULTAR.png"))); // NOI18N
        constular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constularActionPerformed(evt);
            }
        });
        jPanel1.add(constular, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 150, 40));

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CERRAR2.png"))); // NOI18N
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setPreferredSize(new java.awt.Dimension(150, 40));
        cerrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CERRAR.png"))); // NOI18N
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 150, 40));

        cedula.setEditable(false);
        cedula.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cedula.setForeground(new java.awt.Color(102, 0, 102));
        cedula.setBorder(null);
        cedula.setOpaque(false);
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 170, 25));

        jLabel4.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 140, -1));

        nombre.setEditable(false);
        nombre.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(102, 0, 102));
        nombre.setBorder(null);
        nombre.setOpaque(false);
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 170, 25));

        jLabel5.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel5.setText("Cargo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 140, -1));

        cargo.setEditable(false);
        cargo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cargo.setForeground(new java.awt.Color(102, 0, 102));
        cargo.setBorder(null);
        cargo.setOpaque(false);
        jPanel1.add(cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 170, 25));

        jLabel6.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel6.setText("Salario");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 140, -1));

        salario.setEditable(false);
        salario.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        salario.setForeground(new java.awt.Color(102, 0, 102));
        salario.setBorder(null);
        salario.setOpaque(false);
        jPanel1.add(salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 170, 25));

        jLabel7.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel7.setText("Fecha De Inicio");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 140, -1));

        fecha.setEditable(false);
        fecha.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        fecha.setForeground(new java.awt.Color(102, 0, 102));
        fecha.setBorder(null);
        fecha.setOpaque(false);
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 170, 25));

        jLabel8.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel8.setText("Direccion");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 140, -1));

        direccion.setEditable(false);
        direccion.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        direccion.setForeground(new java.awt.Color(102, 0, 102));
        direccion.setBorder(null);
        direccion.setOpaque(false);
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 170, 25));

        jLabel9.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel9.setText("N° Sede");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 140, -1));

        sede.setEditable(false);
        sede.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        sede.setForeground(new java.awt.Color(102, 0, 102));
        sede.setBorder(null);
        sede.setOpaque(false);
        jPanel1.add(sede, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 170, 25));

        jLabel10.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel10.setText("Telefono");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 140, -1));

        telefono.setEditable(false);
        telefono.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        telefono.setForeground(new java.awt.Color(102, 0, 102));
        telefono.setBorder(null);
        telefono.setOpaque(false);
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 170, 25));

        jLabel11.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel11.setText("Cedula");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 140, -1));

        jLabel12.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel12.setText("Estado");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 140, -1));

        estado.setEditable(false);
        estado.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        estado.setForeground(new java.awt.Color(102, 0, 102));
        estado.setBorder(null);
        estado.setOpaque(false);
        jPanel1.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 170, 25));

        jLabel13.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel13.setText("Contraseña");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 140, -1));

        contraseña.setEditable(false);
        contraseña.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        contraseña.setForeground(new java.awt.Color(102, 0, 102));
        contraseña.setBorder(null);
        contraseña.setOpaque(false);
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 170, 25));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 170, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 170, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 170, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 170, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 170, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 170, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 170, 10));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 170, 10));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 170, 10));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 170, 10));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 170, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CONSULTAREMPLEADOS.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void constularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constularActionPerformed
        int  fila = this.empleados.getSelectedRow();
        if (fila<0) {
            JOptionPane.showMessageDialog(this, "Seleccione un empleado para consultar");
        } else {
            String cedula = this.empleados.getValueAt(fila, 0).toString();
            String[] empleado = controlUsuario.consultarUsuario(cedula);
            if (empleado == null) {
                JOptionPane.showMessageDialog(this, "No se pudo consultar al empleado seleccionado");
            } else {                
                this.cedula.setText(empleado[0]);
                this.contraseña.setText(empleado[1]);
                this.estado.setText(empleado[2]);
                this.nombre.setText(empleado[3]);
                this.cargo.setText(empleado[4]);
                this.salario.setText(empleado[5]);
                this.fecha.setText(empleado[6]);
                this.direccion.setText(empleado[7]);
                this.sede.setText(empleado[8]);
                this.telefono.setText(empleado[9]);        
            }
        }
    }//GEN-LAST:event_constularActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        Menu_Gerente g = new Menu_Gerente(usuario);
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cerrarActionPerformed

    private void busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyReleased
        String busqueda = this.busqueda.getText();
        cargarUsuarios(busqueda);
    }//GEN-LAST:event_busquedaKeyReleased

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField busqueda;
    private javax.swing.JTextField cargo;
    private javax.swing.JTextField cedula;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton constular;
    private javax.swing.JTextField contraseña;
    private javax.swing.JTextField direccion;
    private javax.swing.JTable empleados;
    private javax.swing.JTextField estado;
    private javax.swing.JTextField fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField salario;
    private javax.swing.JTextField sede;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
