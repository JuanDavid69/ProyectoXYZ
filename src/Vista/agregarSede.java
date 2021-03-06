/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.ControlSedes;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class agregarSede extends javax.swing.JFrame {
    String usuario;
    ControlSedes controlSedes = new ControlSedes();
    /**
     * Creates new form agregarSede
     */
    public agregarSede(String usuario) {
        this.usuario = usuario;
        initComponents();
        setDefaultCloseOperation(0);
        this.setLocationRelativeTo(null);
        this.id_sede.setText(controlSedes.generarIdSede());
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
        id_sede = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        ciudad = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 200, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 200, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 200, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 200, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 200, 10));

        id_sede.setEditable(false);
        id_sede.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        id_sede.setForeground(new java.awt.Color(102, 0, 102));
        id_sede.setBorder(null);
        id_sede.setOpaque(false);
        id_sede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_sedeActionPerformed(evt);
            }
        });
        id_sede.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_sedeKeyTyped(evt);
            }
        });
        jPanel1.add(id_sede, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 200, 25));

        direccion.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        direccion.setForeground(new java.awt.Color(102, 0, 102));
        direccion.setBorder(null);
        direccion.setOpaque(false);
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 200, 25));

        ciudad.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        ciudad.setForeground(new java.awt.Color(102, 0, 102));
        ciudad.setBorder(null);
        ciudad.setOpaque(false);
        jPanel1.add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 200, 25));

        telefono.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        telefono.setForeground(new java.awt.Color(102, 0, 102));
        telefono.setBorder(null);
        telefono.setOpaque(false);
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 200, 25));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel2.setText("N° Sede:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 175, 25));

        jLabel3.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel3.setText("Dirección:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 200, 25));

        jLabel4.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel4.setText("Ciudad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 200, 25));

        jLabel5.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel5.setText("Telefono:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 200, 25));

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AGREGAR2.png"))); // NOI18N
        agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AGREGAR.png"))); // NOI18N
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 150, 40));

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CERRAR2.png"))); // NOI18N
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CERRAR.png"))); // NOI18N
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 150, 40));

        nombre.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(102, 0, 102));
        nombre.setBorder(null);
        nombre.setOpaque(false);
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 200, 25));

        jLabel6.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel6.setText("Nombre de la sede:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 200, 25));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AGREGARSEDES.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_sedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_sedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_sedeActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        Menu_Gerente u = new Menu_Gerente(usuario);
        u.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cerrarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        try{
            if((this.id_sede.getText().equals(""))||(this.nombre.getText().equals("")) || (this.direccion.equals(""))
                    || (this.ciudad.equals("")) || (this.telefono.equals(""))){
                JOptionPane.showMessageDialog(this, "Ingrese la informacion correspondiente en cada campo");
            }
            else{
                String id_sede = this.id_sede.getText();
                String nombre = this.nombre.getText();
                String direccion = this.direccion.getText();
                String ciudad = this.ciudad.getText();
                String telefono = this.telefono.getText();
                
                String mensaje = controlSedes.agregarSede(id_sede, nombre, direccion, ciudad, telefono);
                this.id_sede.setText(controlSedes.generarIdSede());
                JOptionPane.showMessageDialog(this, mensaje);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al capturar los datos");
            System.out.println(e);
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void id_sedeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_sedeKeyTyped
        char id = evt.getKeyChar();
        if(Character.isLetter(id)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo caracteres numericos");
        }
    }//GEN-LAST:event_id_sedeKeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        char telefono = evt.getKeyChar();
        if(Character.isLetter(telefono)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo caracteres numericos");
        }
    }//GEN-LAST:event_telefonoKeyTyped

  
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton cerrar;
    private javax.swing.JTextField ciudad;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField id_sede;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
