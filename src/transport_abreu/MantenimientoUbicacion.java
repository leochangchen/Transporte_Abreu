package transport_abreu;

import entidades.Ubicacion;
import manejo.ManejoUbicacion;
import clases.BdConection;
import java.sql.Connection;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 * @author Leo-PC:U83U06 Transporte_Abreu Hecho por : Enriquillo, Erick Abreu,
 * Chang I-hua Fecha : 2013-Primer semestre
 */
public class MantenimientoUbicacion extends javax.swing.JDialog {

    private Connection con = BdConection.getBdConection().getConexion();
    ManejoUbicacion mUbicacion = new ManejoUbicacion();
    int codUbi = 0;
    int total = mUbicacion.getTotal();
    Ubicacion ubicacion = new Ubicacion();

    public MantenimientoUbicacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jBNuevoActionPerformed(null);
        setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLBCliente = new javax.swing.JLabel();
        jTextBCodigo = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBAnterior = new javax.swing.JButton();
        jBSiguiente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTUbicacion = new javax.swing.JTable();
        jBPrimera = new javax.swing.JButton();
        jBUltima = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextCodigo = new javax.swing.JTextField();
        jLCodigo = new javax.swing.JLabel();
        jLDescripcion = new javax.swing.JLabel();
        jTextDescripcion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLBCliente.setText("Introduzca el codigo para buscar ubicacion");

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

        jTUbicacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Descripcion", " "
            }
        ));
        jTUbicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTUbicacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTUbicacion);
        jTUbicacion.getColumnModel().getColumn(0).setMinWidth(50);
        jTUbicacion.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTUbicacion.getColumnModel().getColumn(0).setMaxWidth(50);
        jTUbicacion.getColumnModel().getColumn(1).setMinWidth(150);
        jTUbicacion.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTUbicacion.getColumnModel().getColumn(1).setMaxWidth(150);

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda de ubicacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));

        jLCodigo.setText("Codigo");

        jLDescripcion.setText("Descripcion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jTextCodigo))
                .addGap(146, 146, 146))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDescripcion)
                    .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLBCliente)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextBCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBNuevo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBPrimera, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBUltima, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLBCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar)
                    .addComponent(jBNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBUltima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBPrimera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

       if (jTextBCodigo.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Introduzca el codigo de la ubicacion para poder buscar");
        } else {

            ubicacion = mUbicacion.getUbicacion(Integer.parseInt(jTextBCodigo.getText()));
            buscar(ubicacion);
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSiguienteActionPerformed

        
            if (ubicacion.getCodigo() < total) {
                codUbi = ubicacion.getCodigo() + 1;
                //System.out.println(codCli);
                ubicacion = mUbicacion.getUbicacion(codUbi);
                buscar(ubicacion);
                codUbi = ubicacion.getCodigo();
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Este es la ultima ubicacion en el registro");
            }
        

    }//GEN-LAST:event_jBSiguienteActionPerformed

    private void jBAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnteriorActionPerformed

            if (ubicacion.getCodigo() > ((total - total) + 1)) {
                codUbi = ubicacion.getCodigo() - 1;
                //System.out.println(codCli);
                ubicacion = mUbicacion.getUbicacion(codUbi);
                buscar(ubicacion);
                codUbi = ubicacion.getCodigo();
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Este es la primera ubicacion en el registro");
            }

    }//GEN-LAST:event_jBAnteriorActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
//        DefaultTableModel model = (DefaultTableModel) jTUbicacion.getModel();
        mUbicacion.borrarUbicacion(ubicacion.getCodigo());
        setTable();
        jBNuevoActionPerformed(null);
        javax.swing.JOptionPane.showMessageDialog(null, "Ubicacion seleccionado fue borrado exitosamente");
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jTUbicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTUbicacionMouseClicked
        ubicacion = mUbicacion.getUbicacion((Integer)jTUbicacion.getValueAt(jTUbicacion.getSelectedRow(), 0));
        buscar(ubicacion);
    }//GEN-LAST:event_jTUbicacionMouseClicked

    private void jBUltimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUltimaActionPerformed
        ubicacion = mUbicacion.getUbicacion(mUbicacion.getTotal());
        buscar(ubicacion);
        codUbi = ubicacion.getCodigo();
    }//GEN-LAST:event_jBUltimaActionPerformed

    private void jBPrimeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrimeraActionPerformed
        ubicacion = mUbicacion.getUbicacion(1);
        buscar(ubicacion);
        codUbi = ubicacion.getCodigo();
    }//GEN-LAST:event_jBPrimeraActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        if (ubicacion.getCodigo() > 0 && ubicacion.getCodigo() <= mUbicacion.getTotal()) {
            ubicacion.setDescripcion(jTextDescripcion.getText());
            ubicacion.setCodigo(Integer.parseInt(jTextBCodigo.getText()));
            mUbicacion.updateUbicacion(ubicacion);
            setTable();
        } else {
            ubicacion.setDescripcion(jTextDescripcion.getText());
            ubicacion.setCodigo(Integer.parseInt(jTextBCodigo.getText()));
            mUbicacion.guardarUbicacion(ubicacion);
            setTable();
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
            java.util.logging.Logger.getLogger(MantenimientoUbicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoUbicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoUbicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoUbicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MantenimientoUbicacion dialog = new MantenimientoUbicacion(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBAnterior;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBPrimera;
    private javax.swing.JButton jBSiguiente;
    private javax.swing.JButton jBUltima;
    private javax.swing.JLabel jLBCliente;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTUbicacion;
    private javax.swing.JTextField jTextBCodigo;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextDescripcion;
    // End of variables declaration//GEN-END:variables
    private Object[] tUbicacion;

    private void buscar(Ubicacion ubicacion) {
        jTextBCodigo.setText(String.valueOf(ubicacion.getCodigo()));
        jTextCodigo.setText(String.valueOf(ubicacion.getCodigo()));
        jTextDescripcion.setText(ubicacion.getDescripcion());
    }

    private void nuevo() {

        Date date = new Date();
        jTextBCodigo.setText("");
        jTextCodigo.setText("");
        jTextDescripcion.setText("");

        setTable();

        ubicacion = new Ubicacion();
    }

    private void setTable() {

        tUbicacion = new Object[2];
        DefaultTableModel model = (DefaultTableModel) jTUbicacion.getModel();
        model.getDataVector().removeAllElements();
        for (Ubicacion ubicacion : mUbicacion.getListaUbicacion()) {
            tUbicacion[0] = ubicacion.getCodigo();
            tUbicacion[1] = ubicacion.getDescripcion();
            model.addRow(tUbicacion);
        }

    }
}
