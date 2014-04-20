package transport_abreu;

import entidades.DetalleFactura;
import manejo.ManejoFactura;
import manejo.ManejoDetalleFactura;
import clases.BdConection;
import entidades.Ncf;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import manejo.ManejoUbicacion;

/**
 * @author Leo-PC:U83U06 Transporte_Abreu Hecho por : Enriquillo, Erick Abreu,
 * Chang I-hua Fecha : 2013-Primer semestre
 */
public class MantenimientoDetalleFactura extends javax.swing.JDialog {

    private Connection con = BdConection.getBdConection().getConexion();
    ManejoDetalleFactura mDetalleFactura = new ManejoDetalleFactura();
    ManejoUbicacion mUbicacion = new ManejoUbicacion();
    int codFac = 0;
    int total = mDetalleFactura.getTotal();
    boolean selFac = false;
    DetalleFactura detalleFactura = new DetalleFactura();

    public MantenimientoDetalleFactura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jBNuevoActionPerformed(null);
        setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLBCliente = new javax.swing.JLabel();
        jTextBDFCod = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextValor = new javax.swing.JTextField();
        jLValor = new javax.swing.JLabel();
        jLNumContenedor = new javax.swing.JLabel();
        jTextNumContenedor = new javax.swing.JTextField();
        jTextNumConduce = new javax.swing.JTextField();
        jLNumConduce = new javax.swing.JLabel();
        jLCodDes = new javax.swing.JLabel();
        jTextCodDes = new javax.swing.JTextField();
        jLFecha = new javax.swing.JLabel();
        dpFecha = new org.jdesktop.swingx.JXDatePicker();
        jTextCodFac = new javax.swing.JTextField();
        jLCodFac = new javax.swing.JLabel();
        jTextCodCar = new javax.swing.JTextField();
        jTextCodOri = new javax.swing.JTextField();
        jLCodCar = new javax.swing.JLabel();
        jLCodOri = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBAnterior = new javax.swing.JButton();
        jBSiguiente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFactura = new javax.swing.JTable();
        jBPrimera = new javax.swing.JButton();
        jBUltima = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLBCliente.setText("Introduzca el codigo para buscar detalle de factura");

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda de cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));

        jTextValor.setEditable(false);

        jLValor.setText("Valor");

        jLNumContenedor.setText("Numero contenedor");

        jLNumConduce.setText("Numero de conduce");

        jLCodDes.setText("Codigo de destino");

        jTextCodDes.setEditable(false);

        jLFecha.setText("Fecha");

        jTextCodFac.setEditable(false);

        jLCodFac.setText("Codigo de factura");

        jTextCodOri.setEditable(false);

        jLCodCar.setText("Codigo de carga");

        jLCodOri.setText("Codigo de origen");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCodFac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLCodDes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLNumContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLNumConduce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 4, Short.MAX_VALUE))
                            .addComponent(jLCodCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLCodOri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextNumConduce, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addComponent(jTextNumContenedor)
                            .addComponent(jTextValor)
                            .addComponent(jTextCodDes)
                            .addComponent(jTextCodFac)
                            .addComponent(jTextCodCar)
                            .addComponent(jTextCodOri)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodFac)
                    .addComponent(jTextCodFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCodCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCodCar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCodOri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCodOri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodDes)
                    .addComponent(jTextCodDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNumConduce)
                    .addComponent(jTextNumConduce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNumContenedor)
                    .addComponent(jTextNumContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLValor)
                    .addComponent(jTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLFecha))
                .addGap(29, 29, 29))
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

        jTFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Cod. Factura", "Fecha", "Tipo de carga", "Origen", "Destino", "No. Conduce", "No. Contenedor", "Valor"
            }
        ));
        jTFactura.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFacturaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTFactura);
        jTFactura.getColumnModel().getColumn(0).setMinWidth(35);
        jTFactura.getColumnModel().getColumn(0).setPreferredWidth(35);
        jTFactura.getColumnModel().getColumn(0).setMaxWidth(35);
        jTFactura.getColumnModel().getColumn(2).setMinWidth(80);
        jTFactura.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTFactura.getColumnModel().getColumn(2).setMaxWidth(80);
        jTFactura.getColumnModel().getColumn(3).setMinWidth(80);
        jTFactura.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTFactura.getColumnModel().getColumn(3).setMaxWidth(80);
        jTFactura.getColumnModel().getColumn(4).setMinWidth(90);
        jTFactura.getColumnModel().getColumn(4).setPreferredWidth(90);
        jTFactura.getColumnModel().getColumn(4).setMaxWidth(90);
        jTFactura.getColumnModel().getColumn(5).setMinWidth(90);
        jTFactura.getColumnModel().getColumn(5).setPreferredWidth(90);
        jTFactura.getColumnModel().getColumn(5).setMaxWidth(90);
        jTFactura.getColumnModel().getColumn(6).setMinWidth(100);
        jTFactura.getColumnModel().getColumn(6).setPreferredWidth(100);
        jTFactura.getColumnModel().getColumn(6).setMaxWidth(100);
        jTFactura.getColumnModel().getColumn(7).setMinWidth(100);
        jTFactura.getColumnModel().getColumn(7).setPreferredWidth(100);
        jTFactura.getColumnModel().getColumn(7).setMaxWidth(100);

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
                        .addComponent(jTextBDFCod, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBNuevo))
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
                    .addComponent(jTextBDFCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar)
                    .addComponent(jBNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBUltima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBPrimera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        if (jTextBDFCod.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Introduzca el codigo de la factura para poder buscar");
        } else {

            detalleFactura = mDetalleFactura.getDetalleFactura(Integer.parseInt(jTextBDFCod.getText()));
            buscar(detalleFactura);
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSiguienteActionPerformed

        if (detalleFactura.getCodigo() < total) {
            codFac = detalleFactura.getCodigo() + 1;
            //System.out.println(codCli);
            detalleFactura = mDetalleFactura.getDetalleFactura(codFac);
            buscar(detalleFactura);
            codFac = detalleFactura.getCodigo();
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Este es el ultimo detalle de factura en el registro");
        }

    }//GEN-LAST:event_jBSiguienteActionPerformed

    private void jBAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnteriorActionPerformed

        if (detalleFactura.getCodigo() > ((total - total) + 1)) {
            codFac = detalleFactura.getCodigo() - 1;
            //System.out.println(codCli);
            detalleFactura = mDetalleFactura.getDetalleFactura(codFac);
            buscar(detalleFactura);
            codFac = detalleFactura.getCodigo();
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Este es el primer detalle de factura en el registro");
        }
    }//GEN-LAST:event_jBAnteriorActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
//        DefaultTableModel model = (DefaultTableModel) jTFactura.getModel();
        mDetalleFactura.borrarDFactura(detalleFactura.getCodigo());
        setTable();
        jBNuevoActionPerformed(null);
        javax.swing.JOptionPane.showMessageDialog(null, "detalle de factura seleccionado fue borrado exitosamente");
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jTFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFacturaMouseClicked
        detalleFactura = mDetalleFactura.getDetalleFactura((Integer)jTFactura.getValueAt(jTFactura.getSelectedRow(), 0));
        buscar(detalleFactura);
    }//GEN-LAST:event_jTFacturaMouseClicked

    private void jBUltimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUltimaActionPerformed
        detalleFactura = mDetalleFactura.getDetalleFactura(mDetalleFactura.getTotal());
        buscar(detalleFactura);
        codFac = detalleFactura.getCodigo();
    }//GEN-LAST:event_jBUltimaActionPerformed

    private void jBPrimeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrimeraActionPerformed
        detalleFactura = mDetalleFactura.getDetalleFactura(1);
        buscar(detalleFactura);
        codFac = detalleFactura.getCodigo();
    }//GEN-LAST:event_jBPrimeraActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        if (detalleFactura.getCodigo() > 0 && detalleFactura.getCodigo() <= mDetalleFactura.getTotal()) {
            detalleFactura.setTipo_carga(jTextCodCar.getText());
            detalleFactura.setNum_conduce(jTextNumConduce.getText());
            detalleFactura.setNum_contenedor(jTextNumContenedor.getText());
            mDetalleFactura.updateDFactura(detalleFactura);
            setTable();
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "No existe este registro para update");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(MantenimientoDetalleFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoDetalleFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoDetalleFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoDetalleFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MantenimientoDetalleFactura dialog = new MantenimientoDetalleFactura(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBSiguiente;
    private javax.swing.JButton jBUltima;
    private javax.swing.JLabel jLBCliente;
    private javax.swing.JLabel jLCodCar;
    private javax.swing.JLabel jLCodDes;
    private javax.swing.JLabel jLCodFac;
    private javax.swing.JLabel jLCodOri;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLNumConduce;
    private javax.swing.JLabel jLNumContenedor;
    private javax.swing.JLabel jLValor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTFactura;
    private javax.swing.JTextField jTextBDFCod;
    private javax.swing.JTextField jTextCodCar;
    private javax.swing.JTextField jTextCodDes;
    private javax.swing.JTextField jTextCodFac;
    private javax.swing.JTextField jTextCodOri;
    private javax.swing.JTextField jTextNumConduce;
    private javax.swing.JTextField jTextNumContenedor;
    private javax.swing.JTextField jTextValor;
    // End of variables declaration//GEN-END:variables
    private Object[] tFactura;

    private void buscar(DetalleFactura detalleFactura) {

        dpFecha.setFormats(new SimpleDateFormat("dd-MM-yyyy"));
        dpFecha.setDate(detalleFactura.getFecha());

        jTextBDFCod.setText(String.valueOf(detalleFactura.getCodigo()));
        jTextCodFac.setText(String.valueOf(detalleFactura.getCod_factura()));
        jTextCodCar.setText(detalleFactura.getTipo_carga());
        jTextCodOri.setText(detalleFactura.getCod_origen().toString());
        jTextCodDes.setText(detalleFactura.getCod_destino().toString());
        jTextNumConduce.setText(detalleFactura.getNum_conduce().toString());
        jTextNumContenedor.setText(detalleFactura.getNum_contenedor());
        jTextValor.setText(String.valueOf(detalleFactura.getValor()));
    }

    private void nuevo() {

        Date date = new Date();
        jTextBDFCod.setText("");
        jTextCodFac.setText("");
        jTextCodCar.setText("");
        jTextCodOri.setText("");
        jTextCodDes.setText("");
        jTextNumConduce.setText("");
        jTextNumContenedor.setText("");
        jTextValor.setText("");

        dpFecha.setDate(date);

        setTable();

        detalleFactura = new DetalleFactura();
    }

    private void setTable() {

        tFactura = new Object[9];
        DefaultTableModel model = (DefaultTableModel) jTFactura.getModel();
        model.getDataVector().removeAllElements();
        for (DetalleFactura detalleFactura : mDetalleFactura.getListaDetalleFactura()) {
            tFactura[0] = detalleFactura.getCodigo();
            tFactura[1] = detalleFactura.getCod_factura();
            tFactura[2] = detalleFactura.getFecha();
            tFactura[3] = detalleFactura.getTipo_carga();
            tFactura[4] = detalleFactura.getCod_origen();
            tFactura[5] = detalleFactura.getCod_destino();
            tFactura[6] = detalleFactura.getNum_conduce();
            tFactura[7] = detalleFactura.getNum_contenedor();
            tFactura[8] = detalleFactura.getValor();
            model.addRow(tFactura);
        }

    }
}
