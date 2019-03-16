/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Soupbizkit
 */
public class ReportesGerente extends javax.swing.JFrame {
    String usuario;
    ControlVenta control;
    /**
     * Creates new form ReportesGerente
     */
    public ReportesGerente(String usuario) {
        this.setLocationRelativeTo(null);
        control = new ControlVenta();
        this.usuario = usuario;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButtonGraficar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonCerrar = new javax.swing.JButton();
        RBVentasSedes = new javax.swing.JRadioButton();
        RBCotizacionesSedes = new javax.swing.JRadioButton();
        RBOrdenesSedes = new javax.swing.JRadioButton();
        RBVentasVendedores = new javax.swing.JRadioButton();
        RBCotizacionesVendedores = new javax.swing.JRadioButton();
        RBOrdenesJefe = new javax.swing.JRadioButton();
        jButtonGenerarTabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButtonGraficar.setText("Graficar");
        jButtonGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGraficarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sedes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Vendedores");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Jefe de taller");

        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBVentasSedes);
        RBVentasSedes.setText("Ventas");

        buttonGroup1.add(RBCotizacionesSedes);
        RBCotizacionesSedes.setText("Cotizaciones");

        buttonGroup1.add(RBOrdenesSedes);
        RBOrdenesSedes.setText("Ordenes de trabajo");

        buttonGroup1.add(RBVentasVendedores);
        RBVentasVendedores.setText("Ventas");

        buttonGroup1.add(RBCotizacionesVendedores);
        RBCotizacionesVendedores.setText("Cotizaciones");

        buttonGroup1.add(RBOrdenesJefe);
        RBOrdenesJefe.setText("Ordenes de trabajo");

        jButtonGenerarTabla.setText("Generar");
        jButtonGenerarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBCotizacionesSedes)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(RBVentasSedes)
                                .addComponent(jLabel1))
                            .addComponent(RBOrdenesSedes))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RBVentasVendedores)
                                    .addComponent(RBCotizacionesVendedores))))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RBOrdenesJefe)
                            .addComponent(jLabel3))))
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jButtonCerrar)
                        .addGap(150, 150, 150)
                        .addComponent(jButtonGraficar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jButtonGenerarTabla)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBVentasSedes)
                    .addComponent(RBVentasVendedores)
                    .addComponent(RBOrdenesJefe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBCotizacionesSedes)
                    .addComponent(RBCotizacionesVendedores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBOrdenesSedes)
                .addGap(30, 30, 30)
                .addComponent(jButtonGenerarTabla)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCerrar)
                    .addComponent(jButtonGraficar))
                .addGap(108, 108, 108))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGraficarActionPerformed
       DefaultCategoryDataset Datos = new DefaultCategoryDataset();
       int filas = jTable2.getRowCount();
       String titulo = jTable2.getColumnName(1) + " por " + jTable2.getColumnName(0); //titulo de la tabla
       
       try{
       if(RBVentasSedes.isSelected()){
        for (int i=0; i < filas; i++){
            Datos.setValue(Integer.parseInt(jTable2.getValueAt(i, 1).toString()),jTable2.getValueAt(i, 0).toString(),jTable2.getValueAt(i, 0).toString()); //captura de datos de la tabla para nombre de valores variables.
        }
        JFreeChart grafica = ChartFactory.createBarChart3D(titulo,jTable2.getColumnName(0), jTable2.getColumnName(1), Datos, PlotOrientation.VERTICAL, true, true,false); //nombre de valores variables
        ChartFrame panelGrafica = new ChartFrame(titulo, grafica);
        panelGrafica.setSize(1000,600);
        panelGrafica.setLocationRelativeTo(null);
        panelGrafica.setVisible(true);
        
        String [] Titulo = {};
         DefaultTableModel newTabla = new DefaultTableModel(null,Titulo);
         this.jTable2.setModel(newTabla);
      } 
       if(RBCotizacionesSedes.isSelected()){
        for (int i=0; i < filas; i++){
            Datos.setValue(Integer.parseInt(jTable2.getValueAt(i, 1).toString()),"cotizaciones",jTable2.getValueAt(i, 0).toString());//captura de datos de la tabla para nombre de valores manual.
        }
        JFreeChart grafica = ChartFactory.createBarChart3D("Cotizaciones por sede","sede", "cotizacion", Datos, PlotOrientation.VERTICAL, true, true,false); //nombres de valores manuales.
        ChartFrame panelGrafica = new ChartFrame("Cotizaciones por sede", grafica);
        panelGrafica.setSize(1000,600);
        panelGrafica.setLocationRelativeTo(null);
        panelGrafica.setVisible(true);
        
        String [] Titulo = {};
         DefaultTableModel newTabla = new DefaultTableModel(null,Titulo);
         this.jTable2.setModel(newTabla);
       }
       if(RBOrdenesSedes.isSelected()){
        for (int i=0; i < filas; i++){
            Datos.setValue(Integer.parseInt(jTable2.getValueAt(i, 1).toString()),"cotizaciones",jTable2.getValueAt(i, 0).toString());
        }
        JFreeChart grafica = ChartFactory.createBarChart3D("Ordenes por sede","sede", "Orden", Datos, PlotOrientation.VERTICAL, true, true,false); 
        ChartFrame panelGrafica = new ChartFrame("Ordenes por sede", grafica);
        panelGrafica.setSize(1000,600);
        panelGrafica.setLocationRelativeTo(null);
        panelGrafica.setVisible(true);
        
        String [] Titulo = {};
         DefaultTableModel newTabla = new DefaultTableModel(null,Titulo);
         this.jTable2.setModel(newTabla);
       }
       if(RBVentasVendedores.isSelected()){
        for (int i=0; i < filas; i++){
            Datos.setValue(Integer.parseInt(jTable2.getValueAt(i, 1).toString()),"cotizaciones",jTable2.getValueAt(i, 0).toString());
        }
        JFreeChart grafica = ChartFactory.createBarChart3D("Ventas por vendedor","vendedor", "ventas", Datos, PlotOrientation.VERTICAL, true, true,false); 
        ChartFrame panelGrafica = new ChartFrame("Ventas por vendedor", grafica);
        panelGrafica.setSize(1000,600);
        panelGrafica.setLocationRelativeTo(null);
        panelGrafica.setVisible(true);
        
        String [] Titulo = {};
         DefaultTableModel newTabla = new DefaultTableModel(null,Titulo);
         this.jTable2.setModel(newTabla);
       }
       if(RBCotizacionesVendedores.isSelected()){
           //tabla = control.cotizacionesVendedores();
           //jTable2.setModel(tabla);
       }
       if(RBOrdenesJefe.isSelected()){
           //tabla = control.OrdenesJefe();
           //jTable2.setModel(tabla);
       }
       }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al capturar los datos");
            System.out.println(e);
        }
    }//GEN-LAST:event_jButtonGraficarActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
       Menu_Gerente u = new Menu_Gerente(usuario);
        u.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonGenerarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarTablaActionPerformed
       DefaultTableModel tabla;
       
       if(RBVentasSedes.isSelected()){
         tabla = control.ventasSede();
         jTable2.setModel(tabla);
       }
       if(RBCotizacionesSedes.isSelected()){
           //tabla = control.cotizacionesSedes();
           //jTable2.setModel(tabla);
       }
       if(RBOrdenesSedes.isSelected()){
           //tabla = control.OrdenesSedes();
           //jTable2.setModel(tabla);
       }
       if(RBVentasVendedores.isSelected()){
           tabla = control.ventasVendedor();
           jTable2.setModel(tabla);
       }
       if(RBCotizacionesVendedores.isSelected()){
           //tabla = control.cotizacionesVendedores();
           //jTable2.setModel(tabla);
       }
       if(RBOrdenesJefe.isSelected()){
           //tabla = control.OrdenesJefe();
           //jTable2.setModel(tabla);
       }
       
    }//GEN-LAST:event_jButtonGenerarTablaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RBCotizacionesSedes;
    private javax.swing.JRadioButton RBCotizacionesVendedores;
    private javax.swing.JRadioButton RBOrdenesJefe;
    private javax.swing.JRadioButton RBOrdenesSedes;
    private javax.swing.JRadioButton RBVentasSedes;
    private javax.swing.JRadioButton RBVentasVendedores;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonGenerarTabla;
    private javax.swing.JButton jButtonGraficar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
