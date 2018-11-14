/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopatito;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GUILINTON323
 */
public class ReportePatito1 extends javax.swing.JFrame {
    DefaultTableModel modeloPatito;
    /**
     * Creates new form ReportePatito1
     */
    public ReportePatito1() {
        initComponents();
        setLocationRelativeTo(null);        
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
        txtCodigo = new javax.swing.JTextField();
        btnValidar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPatito = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REPORTE DE PAGO Y FACTURACIÓN DE CLIENTES");

        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("CÓDIGO DEL CLIENTE"));

        btnValidar.setText("VER REPORTE");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        TablaPatito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaPatito.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaPatito);

        btnSalir.setText("SALIR AL MENU PRINCIPAL");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR DATOS PARA NUEVA CONSULTA");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnValidar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnLimpiar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValidar))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnSalir))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed

        try{
            String [] titulos = {"No. FACTURA", "NOMBRE DEL CLIENTE", "NIT", "SERVICIO", "PAGO EN Q.", "FECHA DE PAGO"};
            String [] registros = new String [6];

            modeloPatito = new DefaultTableModel(null,titulos);

            Conectar conectar = new Conectar();
            Connection conexionPatito = conectar.conexion();

            String sql = "";
            sql = "SELECT facturacion.numero , clientes.nombre, clientes.NIT, servicios.nombre, facturacion.monto, facturacion.fecha FROM facturacion\n" +
            "JOIN clientes ON clientes.codigo = facturacion.codigocliente\n" +
            "JOIN servicios ON servicios.codigo = facturacion.codigoservicio WHERE clientes.codigo=?";

            PreparedStatement statementPatito = conexionPatito.prepareStatement(sql);
            statementPatito.setString(1, txtCodigo.getText());
            ResultSet resultsetPatito = statementPatito.executeQuery();

            while (resultsetPatito.next()){
                registros [0] = resultsetPatito.getString("facturacion.numero");
                registros [1] = resultsetPatito.getString("clientes.nombre");
                registros [2] = resultsetPatito.getString("clientes.NIT");
                registros [3] = resultsetPatito.getString("servicios.nombre");
                registros [4] = resultsetPatito.getString("facturacion.monto");
                registros [5] = resultsetPatito.getString("facturacion.fecha");

                modeloPatito.addRow(registros);
            }
            TablaPatito.setModel(modeloPatito);
            conexionPatito.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnValidarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        MenuPrincipalPatito menu = new MenuPrincipalPatito();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        try{
            String [] titulos = {"No. FACTURA", "NOMBRE DEL CLIENTE", "NIT", "SERVICIO", "PAGO", "FECHA DE PAGO"};
            String [] registros = new String [6];

            modeloPatito = new DefaultTableModel(null,titulos);

            Conectar conectar = new Conectar();
            Connection conexionPatito = conectar.conexion();

            String sql = "";
            sql = "SELECT facturacion.numero , clientes.nombre, clientes.NIT, servicios.nombre, facturacion.monto, facturacion.fecha from facturacion\n" +
            "JOIN clientes ON clientes.codigo = facturacion.codigocliente\n" +
            "JOIN servicios ON servicios.codigo = facturacion.codigoservicio where clientes.codigo=0";

            PreparedStatement statementPatito = conexionPatito.prepareStatement(sql);
            ResultSet resultsetPatito = statementPatito.executeQuery(sql);

            while (resultsetPatito.next()){
                registros [0] = resultsetPatito.getString("facturacion.numero");
                registros [1] = resultsetPatito.getString("clientes.nombre");
                registros [2] = resultsetPatito.getString("clientes.NIT");
                registros [3] = resultsetPatito.getString("servicios.nombre");
                registros [4] = resultsetPatito.getString("facturacion.monto");
                registros [5] = resultsetPatito.getString("facturacion.fecha");

                modeloPatito.addRow(registros);
                conexionPatito.close();
            }
            TablaPatito.setModel(modeloPatito);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        txtCodigo.setText("");
        txtCodigo.requestFocus();

    }//GEN-LAST:event_btnLimpiarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReportePatito1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportePatito1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportePatito1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportePatito1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportePatito1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPatito;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnValidar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
