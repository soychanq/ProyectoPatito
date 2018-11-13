/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopatito;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author GUILINTON323
 */
public class MenuPrincipalPatito extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipalPatito
     */
    public MenuPrincipalPatito() {
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
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuClientes = new javax.swing.JMenu();
        itemAltas = new javax.swing.JMenuItem();
        itemBajas = new javax.swing.JMenuItem();
        itemModificar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuServicios = new javax.swing.JMenu();
        itemCable = new javax.swing.JMenuItem();
        itemInternet = new javax.swing.JMenuItem();
        itemCombo = new javax.swing.JMenuItem();
        menuFacturacion = new javax.swing.JMenu();
        itemCrear = new javax.swing.JMenuItem();
        itemModificarFactura = new javax.swing.JMenuItem();
        itemImprimir = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        itemReporte = new javax.swing.JMenuItem();
        itemReportes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU DEL ADMINISTRADOR / SISTEMA CABLENET PATITO");

        jPanel1.setBackground(java.awt.Color.white);

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setText("SALIR DEL SISTEMA");
        btnSalir.setToolTipText("Cerrar la sesión de usuario del SISTEMA PATITO");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prueba.png"))); // NOI18N
        jLabel1.setAutoscrolls(true);
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setForeground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setAlignmentX(0.0F);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuClientes.setBorder(null);
        menuClientes.setText("CLIENTES");
        menuClientes.setToolTipText("Control de clientes, para agregar o eliminar clientes de la base de datos PATITO");
        menuClientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuClientes.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        menuClientes.setMaximumSize(new java.awt.Dimension(150, 32767));

        itemAltas.setText("ALTAS");
        itemAltas.setToolTipText("Agregar registros de nuevos clientes a la base de datos PATITO");
        itemAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAltasActionPerformed(evt);
            }
        });
        menuClientes.add(itemAltas);

        itemBajas.setText("BAJAS");
        itemBajas.setToolTipText("Eliminar registros de clientes de la base de datos PATITO");
        itemBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBajasActionPerformed(evt);
            }
        });
        menuClientes.add(itemBajas);

        itemModificar.setText("MODIFICACIONES EN REGISTROS");
        itemModificar.setToolTipText("Permite modificar datos en los registros de clientes PATITO");
        itemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemModificarActionPerformed(evt);
            }
        });
        menuClientes.add(itemModificar);

        jMenuItem1.setText("CONSUTA DE REGISTROS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuClientes.add(jMenuItem1);

        jMenuBar1.add(menuClientes);

        menuServicios.setText("SERVICIOS");
        menuServicios.setToolTipText("Muestra los servicios que provee la empresa (no se puede editar)");
        menuServicios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuServicios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuServicios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuServicios.setMaximumSize(new java.awt.Dimension(150, 32767));

        itemCable.setText("CABLE (CÓDIGO 1)");
        itemCable.setToolTipText("Muestra las características del servicio");
        itemCable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCableActionPerformed(evt);
            }
        });
        menuServicios.add(itemCable);

        itemInternet.setText("INTERNET (CÓDIGO 2)");
        itemInternet.setToolTipText("Muestra las características del servicio");
        itemInternet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInternetActionPerformed(evt);
            }
        });
        menuServicios.add(itemInternet);

        itemCombo.setText("CABLE E INTERNET (CÓDIGO 3)");
        itemCombo.setToolTipText("Muestra las características del servicio");
        itemCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemComboActionPerformed(evt);
            }
        });
        menuServicios.add(itemCombo);

        jMenuBar1.add(menuServicios);

        menuFacturacion.setText("FACTURACIÓN");
        menuFacturacion.setToolTipText("Control de la facturación de PATITO");
        menuFacturacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuFacturacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuFacturacion.setMaximumSize(new java.awt.Dimension(150, 32767));

        itemCrear.setText("CREAR FACTURA");
        itemCrear.setToolTipText("Creación del comprobante que recibe el cliente al pagar el servicio contratado");
        itemCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearActionPerformed(evt);
            }
        });
        menuFacturacion.add(itemCrear);

        itemModificarFactura.setText("MODIFICAR FACTURA");
        itemModificarFactura.setToolTipText("Únicamente para modificar facturas que contengan algún error");
        itemModificarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemModificarFacturaActionPerformed(evt);
            }
        });
        menuFacturacion.add(itemModificarFactura);

        itemImprimir.setText("IMPRIMIR FACTURA");
        itemImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemImprimirActionPerformed(evt);
            }
        });
        menuFacturacion.add(itemImprimir);

        jMenuBar1.add(menuFacturacion);

        menuReportes.setText("REPORTES");
        menuReportes.setToolTipText("Permite visualizar el record de pago de los clientes y los comprobantes de pago emitidos (facturas)");
        menuReportes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuReportes.setMaximumSize(new java.awt.Dimension(150, 32767));

        itemReporte.setText("VER FACTURACIÓN POR CLIENTE");
        itemReporte.setToolTipText("Visualizar record de pago de los clientes");
        itemReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteActionPerformed(evt);
            }
        });
        menuReportes.add(itemReporte);

        itemReportes.setText("IMPRIMIR FACTURACIÓN POR CLIENTE");
        itemReportes.setToolTipText("Obtener un reporte físico de facturación");
        itemReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReportesActionPerformed(evt);
            }
        });
        menuReportes.add(itemReportes);

        jMenuBar1.add(menuReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemCableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCableActionPerformed
    
    JOptionPane.showMessageDialog(null, "TV por cable 110 canales en HD, costo mensual del servicio Q100.00, código de servicio 1");
        
    }//GEN-LAST:event_itemCableActionPerformed

    private void itemComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemComboActionPerformed

    JOptionPane.showMessageDialog(null, "Combo TV por cable 110 canales en HD + Interner de alta velocidad 4G, cargas y descargas de archivos ilimitados, costo del servicio Q250.00");

    }//GEN-LAST:event_itemComboActionPerformed

    private void itemAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAltasActionPerformed

    CrearRegistros altas = new CrearRegistros();
    altas.setVisible(true);
    this.setVisible(false);
        
    }//GEN-LAST:event_itemAltasActionPerformed

    private void itemBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBajasActionPerformed

    BorrarRegistros bajas = new BorrarRegistros();
    bajas.setVisible(true);
    this.setVisible(false);
        
    }//GEN-LAST:event_itemBajasActionPerformed

    private void itemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemModificarActionPerformed

    ModificarRegistros modificarRegistros = new ModificarRegistros();
    modificarRegistros.setVisible(true);
    this.setVisible(false);

    }//GEN-LAST:event_itemModificarActionPerformed

    private void itemInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInternetActionPerformed

    JOptionPane.showMessageDialog(null, "Interner de alta velocidad 4G, cargas y descargas de archivos ilimitados, costo mensual del servicio Q200.00, codigo de servicio 2");

    }//GEN-LAST:event_itemInternetActionPerformed

    private void itemCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearActionPerformed

    CrearFactura crear = new CrearFactura();
    crear.setVisible(true);
    this.setVisible(false);

    }//GEN-LAST:event_itemCrearActionPerformed

    private void itemModificarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemModificarFacturaActionPerformed

    ModificarFactura modificarFactura = new ModificarFactura();
    modificarFactura.setVisible(true);
    this.setVisible(false);


    }//GEN-LAST:event_itemModificarFacturaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

//System.exit(0);
    LoginSistemaPatito login = new LoginSistemaPatito();
    login.setVisible(true);
    this.dispose();

    }//GEN-LAST:event_btnSalirActionPerformed

    private void itemReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteActionPerformed

     ReportePatito reporteFacturacion = new ReportePatito();
     reporteFacturacion.setVisible(true);
     this.setVisible(false);

    }//GEN-LAST:event_itemReporteActionPerformed

    private void itemReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReportesActionPerformed
     ReportesPatito reporteFacturacion = new ReportesPatito();
     reporteFacturacion.setVisible(true);
     this.setVisible(false);      
        
    }//GEN-LAST:event_itemReportesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ConsultaRegistros consulta = new ConsultaRegistros();
        consulta.setVisible(true);
        this.setVisible(false);        

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itemImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemImprimirActionPerformed
        FacturaCliente factura = new FacturaCliente();
        factura.setVisible(true);
        this.setVisible(false);         

    }//GEN-LAST:event_itemImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipalPatito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalPatito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalPatito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalPatito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalPatito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuItem itemAltas;
    private javax.swing.JMenuItem itemBajas;
    private javax.swing.JMenuItem itemCable;
    private javax.swing.JMenuItem itemCombo;
    private javax.swing.JMenuItem itemCrear;
    private javax.swing.JMenuItem itemImprimir;
    private javax.swing.JMenuItem itemInternet;
    private javax.swing.JMenuItem itemModificar;
    private javax.swing.JMenuItem itemModificarFactura;
    private javax.swing.JMenuItem itemReporte;
    private javax.swing.JMenuItem itemReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuFacturacion;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenu menuServicios;
    // End of variables declaration//GEN-END:variables
}
