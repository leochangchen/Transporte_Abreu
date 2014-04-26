package transport_abreu;

import entidades.Factura;
import manejo.ManejoFactura;
import clases.BdConection;
import entidades.Ncf;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 * @author Leo-PC:U83U06 Transporte_Abreu Hecho por : Enriquillo, Erick Abreu,
 * Chang I-hua Fecha : 2013-Primer semestre
 */
public class MantenimientoFactura extends javax.swing.JDialog {

    private Connection con = BdConection.getBdConection().getConexion();
    ManejoFactura mFactura = new ManejoFactura();
    int codFac = 0;
    int total = mFactura.getTotal();
    boolean selFac = false;
    Factura factura = new Factura();

    public MantenimientoFactura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jBNuevoActionPerformed(null);
        jBSelect.setVisible(false);
        setLocationRelativeTo(parent);
    }

    MantenimientoFactura(FacturaBeta aThis, boolean b) {
        super(aThis, b);
        initComponents();
        jBNuevoActionPerformed(null);
        jBSelect.setVisible(true);
        setLocationRelativeTo(aThis);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLBCliente = new javax.swing.JLabel();
        jTextBFCod = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextFSubtotal = new javax.swing.JTextField();
        jLFSubtotal = new javax.swing.JLabel();
        jLFItbis = new javax.swing.JLabel();
        jTextFItbis = new javax.swing.JTextField();
        jTextFMonto = new javax.swing.JTextField();
        jLFMonto = new javax.swing.JLabel();
        jLFNcf = new javax.swing.JLabel();
        jTextFNcf = new javax.swing.JTextField();
        jTextFCodNcf = new javax.swing.JTextField();
        jLFCodNcf = new javax.swing.JLabel();
        jLFFecha = new javax.swing.JLabel();
        dpFecha = new org.jdesktop.swingx.JXDatePicker();
        jTextFCliente = new javax.swing.JTextField();
        jLFCliente = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBAnterior = new javax.swing.JButton();
        jBSiguiente = new javax.swing.JButton();
        jBSelect = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFactura = new javax.swing.JTable();
        jBPrimera = new javax.swing.JButton();
        jBUltima = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Factura");

        jLBCliente.setText("Introduzca el codigo para buscar factura");

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda de cliente"));

        jTextFSubtotal.setEditable(false);

        jLFSubtotal.setText("Subtotal");

        jLFItbis.setText("ITBIS");

        jTextFMonto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFMontoFocusLost(evt);
            }
        });

        jLFMonto.setText("Monto");

        jLFNcf.setText("Ncf");

        jTextFNcf.setEditable(false);

        jTextFCodNcf.setEditable(false);

        jLFCodNcf.setText("Cod_ncf");

        jLFFecha.setText("Fecha");

        jTextFCliente.setEditable(false);

        jLFCliente.setText("Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLFNcf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLFItbis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLFSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLFMonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLFCodNcf, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jLFFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFMonto)
                    .addComponent(jTextFItbis)
                    .addComponent(jTextFSubtotal)
                    .addComponent(jTextFNcf)
                    .addComponent(jTextFCodNcf)
                    .addComponent(dpFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(jTextFCliente))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFCliente)
                    .addComponent(jTextFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFNcf)
                    .addComponent(jTextFNcf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFMonto)
                    .addComponent(jTextFMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFItbis)
                    .addComponent(jTextFItbis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFSubtotal)
                    .addComponent(jTextFSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFCodNcf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLFCodNcf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFFecha)
                    .addComponent(dpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Save.jpg"))); // NOI18N
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete.jpg"))); // NOI18N
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jBAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Prev.png"))); // NOI18N
        jBAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnteriorActionPerformed(evt);
            }
        });

        jBSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Next.png"))); // NOI18N
        jBSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSiguienteActionPerformed(evt);
            }
        });

        jBSelect.setText("Seleccionar");
        jBSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSelectActionPerformed(evt);
            }
        });

        jTFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Fecha", "Cliente", "Ncf", "Monto", "ITBIS", "Subtotal", "Cod_Ncf"
            }
        ));
        jTFactura.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFacturaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTFactura);
        if (jTFactura.getColumnModel().getColumnCount() > 0) {
            jTFactura.getColumnModel().getColumn(0).setMinWidth(35);
            jTFactura.getColumnModel().getColumn(0).setPreferredWidth(35);
            jTFactura.getColumnModel().getColumn(0).setMaxWidth(35);
            jTFactura.getColumnModel().getColumn(1).setMinWidth(80);
            jTFactura.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTFactura.getColumnModel().getColumn(1).setMaxWidth(80);
            jTFactura.getColumnModel().getColumn(2).setMinWidth(130);
            jTFactura.getColumnModel().getColumn(2).setPreferredWidth(130);
            jTFactura.getColumnModel().getColumn(2).setMaxWidth(130);
            jTFactura.getColumnModel().getColumn(3).setMinWidth(90);
            jTFactura.getColumnModel().getColumn(3).setPreferredWidth(90);
            jTFactura.getColumnModel().getColumn(3).setMaxWidth(90);
            jTFactura.getColumnModel().getColumn(4).setMinWidth(90);
            jTFactura.getColumnModel().getColumn(4).setPreferredWidth(90);
            jTFactura.getColumnModel().getColumn(4).setMaxWidth(90);
            jTFactura.getColumnModel().getColumn(5).setMinWidth(100);
            jTFactura.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTFactura.getColumnModel().getColumn(5).setMaxWidth(100);
            jTFactura.getColumnModel().getColumn(6).setMinWidth(200);
            jTFactura.getColumnModel().getColumn(6).setPreferredWidth(200);
            jTFactura.getColumnModel().getColumn(6).setMaxWidth(200);
        }

        jBPrimera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/First.png"))); // NOI18N
        jBPrimera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPrimeraActionPerformed(evt);
            }
        });

        jBUltima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Last.png"))); // NOI18N
        jBUltima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUltimaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(jLBCliente)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextBFCod, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSelect))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBPrimera, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBUltima, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLBCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBFCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar)
                    .addComponent(jBNuevo)
                    .addComponent(jBSelect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBUltima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBPrimera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        if (jTextBFCod.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Introduzca el codigo de la factura para poder buscar");
        } else {

            Factura factura = mFactura.getFactura(Integer.parseInt(jTextBFCod.getText()));
            buscar(factura);
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSiguienteActionPerformed

        if (factura.getCodigo() < total) {
            codFac = factura.getCodigo() + 1;
            //System.out.println(codCli);
            factura = mFactura.getFactura(codFac);
            buscar(factura);
            codFac = factura.getCodigo();
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Este es el ultimo cliente en el registro");
        }

    }//GEN-LAST:event_jBSiguienteActionPerformed

    private void jBAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnteriorActionPerformed

        if (factura.getCodigo() > ((total - total) + 1)) {
            codFac = factura.getCodigo() - 1;
            //System.out.println(codCli);
            factura = mFactura.getFactura(codFac);
            buscar(factura);
            codFac = factura.getCodigo();
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Este es el primer cliente en el registro");
        }
    }//GEN-LAST:event_jBAnteriorActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
//        DefaultTableModel model = (DefaultTableModel) jTFactura.getModel();
        mFactura.borrarFactura(factura.getCodigo());
        setTable();
        jBNuevoActionPerformed(null);
        javax.swing.JOptionPane.showMessageDialog(null, "Factura seleccionado fue borrado exitosamente");
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSelectActionPerformed
        if (factura != null) {
            dispose();
            selFac = true;
        }
    }//GEN-LAST:event_jBSelectActionPerformed

    private void jTFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFacturaMouseClicked
        factura = mFactura.getFactura((Integer) jTFactura.getValueAt(jTFactura.getSelectedRow(), 0));
        buscar(factura);
    }//GEN-LAST:event_jTFacturaMouseClicked

    private void jBUltimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUltimaActionPerformed
        factura = mFactura.getFactura(mFactura.getTotal());
        buscar(factura);
        codFac = factura.getCodigo();
    }//GEN-LAST:event_jBUltimaActionPerformed

    private void jBPrimeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrimeraActionPerformed
        factura = mFactura.getFactura(1);
        buscar(factura);
        codFac = factura.getCodigo();
    }//GEN-LAST:event_jBPrimeraActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        if (factura.getCodigo() > 0 && factura.getCodigo() <= mFactura.getTotal()) {
            factura.setMonto(Double.parseDouble(jTextFMonto.getText()));
            factura.setSubtotal(Double.parseDouble(jTextFSubtotal.getText()));
            factura.setItbis(Double.parseDouble(jTextFItbis.getText()));
            mFactura.updateFactura(factura);
            setTable();
        } else {
            factura.setMonto(Double.parseDouble(jTextFMonto.getText()));
            factura.setSubtotal(Double.parseDouble(jTextFSubtotal.getText()));
            factura.setItbis(Double.parseDouble(jTextFItbis.getText()));
            mFactura.guardarFactura(factura);
            setTable();
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTextFMontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFMontoFocusLost
        jTextFSubtotal.setText(Double.parseDouble(jTextFMonto.getText()) + (Double.parseDouble(jTextFMonto.getText()) * 0.18) + "");
    }//GEN-LAST:event_jTextFMontoFocusLost

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
            java.util.logging.Logger.getLogger(MantenimientoFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MantenimientoFactura dialog = new MantenimientoFactura(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker dpFecha;
    private javax.swing.JButton jBAnterior;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBPrimera;
    private javax.swing.JButton jBSelect;
    private javax.swing.JButton jBSiguiente;
    private javax.swing.JButton jBUltima;
    private javax.swing.JLabel jLBCliente;
    private javax.swing.JLabel jLFCliente;
    private javax.swing.JLabel jLFCodNcf;
    private javax.swing.JLabel jLFFecha;
    private javax.swing.JLabel jLFItbis;
    private javax.swing.JLabel jLFMonto;
    private javax.swing.JLabel jLFNcf;
    private javax.swing.JLabel jLFSubtotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTFactura;
    private javax.swing.JTextField jTextBFCod;
    private javax.swing.JTextField jTextFCliente;
    private javax.swing.JTextField jTextFCodNcf;
    private javax.swing.JTextField jTextFItbis;
    private javax.swing.JTextField jTextFMonto;
    private javax.swing.JTextField jTextFNcf;
    private javax.swing.JTextField jTextFSubtotal;
    // End of variables declaration//GEN-END:variables
    private Object[] tFactura;

    private void buscar(Factura factura) {

        dpFecha.setFormats(new SimpleDateFormat("dd-MM-yyyy"));
        dpFecha.setDate(factura.getFecha_factura());

        jTextBFCod.setText(String.valueOf(factura.getCodigo()));
        jTextFItbis.setText(factura.getItbis().toString());
        jTextFNcf.setText(factura.getNcf());
        jTextFMonto.setText(factura.getMonto().toString());
        jTextFSubtotal.setText(factura.getSubtotal().toString());
        jTextFCodNcf.setText(factura.getCod_ncf().toString());
        jTextFCliente.setText(factura.getCliente().getNombre());
        jTextFCodNcf.setText(String.valueOf(factura.getCod_ncf().getCodigo()));
    }

    private void nuevo() {

        Date date = new Date();
        jTextBFCod.setText("");
        jTextFItbis.setText("");
        jTextFNcf.setText("");
        jTextFMonto.setText("");
        jTextFSubtotal.setText("");
        jTextFCodNcf.setText("");
        dpFecha.setDate(date);

        setTable();

        factura = new Factura();
    }

    public Factura getClient() {
        return factura;
    }

    public boolean getselCli() {
        return selFac;
    }

    private void setTable() {

        tFactura = new Object[8];
        DefaultTableModel model = (DefaultTableModel) jTFactura.getModel();
        model.getDataVector().removeAllElements();
        for (Factura factura : mFactura.getListaFactura()) {
            tFactura[0] = factura.getCodigo();
            tFactura[1] = factura.getFecha_factura();
            tFactura[2] = factura.getCliente().getNombre();
            tFactura[3] = factura.getNcf();
            tFactura[4] = factura.getMonto();
            tFactura[5] = factura.getItbis();
            tFactura[6] = factura.getSubtotal();
            tFactura[7] = factura.getCod_ncf().getCodigo();
            model.addRow(tFactura);
        }

    }
}
