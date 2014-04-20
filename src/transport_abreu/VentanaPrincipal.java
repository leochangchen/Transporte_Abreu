package transport_abreu;

import java.awt.Color;
import javax.swing.JFrame;
import reportes.Reporte;
import reportes.rFactura;

/**
 * @author Leo-PC:U83U06 Transporte_Abreu Hecho por : Enriquillo, Erick Abreu,
 * Chang I-hua Fecha : 2013-Primer semestre
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    Login test = new Login(this, true);

    public VentanaPrincipal() {
        initComponents();
        jPanel1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMMantenimientos = new javax.swing.JMenu();
        jMCliente = new javax.swing.JMenuItem();
        jMFactura = new javax.swing.JMenuItem();
        jMDFactura = new javax.swing.JMenuItem();
        jMNcf = new javax.swing.JMenuItem();
        jMUbicacion = new javax.swing.JMenuItem();
        jMUsuario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMFacturacion = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMRFactura = new javax.swing.JMenuItem();
        jMRCliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TranspAbreu2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 730));

        jMenu1.setText("Archivo");

        jMMantenimientos.setText("Mantenimientos");

        jMCliente.setText("Cliente");
        jMCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMClienteActionPerformed(evt);
            }
        });
        jMMantenimientos.add(jMCliente);

        jMFactura.setText("Factura");
        jMFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFacturaActionPerformed(evt);
            }
        });
        jMMantenimientos.add(jMFactura);

        jMDFactura.setText("DetalleFactura");
        jMDFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMDFacturaActionPerformed(evt);
            }
        });
        jMMantenimientos.add(jMDFactura);

        jMNcf.setText("Ncf");
        jMNcf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMNcfActionPerformed(evt);
            }
        });
        jMMantenimientos.add(jMNcf);

        jMUbicacion.setText("Ubicacion");
        jMUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMUbicacionActionPerformed(evt);
            }
        });
        jMMantenimientos.add(jMUbicacion);

        jMUsuario.setText("Usuario");
        jMUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMUsuarioActionPerformed(evt);
            }
        });
        jMMantenimientos.add(jMUsuario);

        jMenu1.add(jMMantenimientos);
        jMenu1.add(jSeparator1);

        jMSalir.setText("Salir");
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Proceso");

        jMFacturacion.setText("Factura");
        jMFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFacturacionActionPerformed(evt);
            }
        });
        jMenu2.add(jMFacturacion);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reporte");

        jMRFactura.setText("Reporte Factura");
        jMRFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRFacturaActionPerformed(evt);
            }
        });
        jMenu3.add(jMRFactura);

        jMRCliente.setText("Reporte Cliente");
        jMRCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRClienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMRCliente);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Acerca");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMClienteActionPerformed
        MantenimientoCliente mCliente = new MantenimientoCliente(this, true);
        mCliente.setVisible(true);
    }//GEN-LAST:event_jMClienteActionPerformed

    private void jMNcfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMNcfActionPerformed
        MantenimientoNcf mNcf = new MantenimientoNcf(this, true);
        mNcf.setVisible(true);
    }//GEN-LAST:event_jMNcfActionPerformed

    private void jMUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMUsuarioActionPerformed
        MantenimientoUsuario mUsuario = new MantenimientoUsuario(this, true);
        mUsuario.setVisible(true);
    }//GEN-LAST:event_jMUsuarioActionPerformed

    private void jMUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMUbicacionActionPerformed
        MantenimientoUbicacion mUbicacion = new MantenimientoUbicacion(this, true);
        mUbicacion.setVisible(true);
    }//GEN-LAST:event_jMUbicacionActionPerformed

    private void jMFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFacturacionActionPerformed
        FacturaBeta bFactura = new FacturaBeta(this, true);
        bFactura.getContentPane().setBackground(Color.white);
        bFactura.setVisible(true);

    }//GEN-LAST:event_jMFacturacionActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        About about = new About(this, true);
        about.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFacturaActionPerformed
        MantenimientoFactura mFactura = new MantenimientoFactura(this, true);
        mFactura.setVisible(true);
    }//GEN-LAST:event_jMFacturaActionPerformed

    private void jMDFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMDFacturaActionPerformed
        MantenimientoDetalleFactura mDetalleFactura = new MantenimientoDetalleFactura(this, true);
        mDetalleFactura.setVisible(true);
    }//GEN-LAST:event_jMDFacturaActionPerformed

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMSalirActionPerformed

    private void jMRFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRFacturaActionPerformed
        rFactura rFactura = new rFactura(this, false);
        rFactura.setVisible(true);
    }//GEN-LAST:event_jMRFacturaActionPerformed

    private void jMRClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRClienteActionPerformed
        Reporte.rCliente();
    }//GEN-LAST:event_jMRClienteActionPerformed

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
        super.setExtendedState(super.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        test.setVisible(b);
        jPanel1.setVisible(false);
//        if (test.getTemp() == 1) {
//            jPanel1.setVisible(true);
//            jPanel1.setOpaque(false);
//        }
    }

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMCliente;
    private javax.swing.JMenuItem jMDFactura;
    private javax.swing.JMenuItem jMFactura;
    private javax.swing.JMenuItem jMFacturacion;
    private javax.swing.JMenu jMMantenimientos;
    private javax.swing.JMenuItem jMNcf;
    private javax.swing.JMenuItem jMRCliente;
    private javax.swing.JMenuItem jMRFactura;
    private javax.swing.JMenuItem jMSalir;
    private javax.swing.JMenuItem jMUbicacion;
    private javax.swing.JMenuItem jMUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
