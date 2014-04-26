package reportes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Leo-PC:U83U06 Transporte_Abreu Hecho por : Enriquillo, Erick Abreu,
 * Chang I-hua Fecha : 2013-Primer semestre
 */
public class rFactura extends javax.swing.JDialog {

    public rFactura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        jXDFecha1.setFormats(new SimpleDateFormat("dd-MM-yyyy"));
        jXDFecha2.setFormats(new SimpleDateFormat("dd-MM-yyyy"));
        jXDFecha1.setDate(new Date());
        jTextDesde.setText("0");
        jTextHasta.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLReporte = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jXDFecha1 = new org.jdesktop.swingx.JXDatePicker();
        jXDFecha2 = new org.jdesktop.swingx.JXDatePicker();
        jBFecha = new javax.swing.JButton();
        jLDesde1 = new javax.swing.JLabel();
        jLHasta1 = new javax.swing.JLabel();
        jPMonto = new javax.swing.JPanel();
        jBMonto = new javax.swing.JButton();
        jLDesde = new javax.swing.JLabel();
        jLHasta = new javax.swing.JLabel();
        jTextDesde = new javax.swing.JTextField();
        jTextHasta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte de Factura");

        jLReporte.setFont(new java.awt.Font("新細明體", 0, 27)); // NOI18N
        jLReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLReporte.setText("Reporte de factura");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione la fecha"));

        jBFecha.setText("OK");
        jBFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFechaActionPerformed(evt);
            }
        });

        jLDesde1.setText("Desde");

        jLHasta1.setText("Hasta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDesde1)
                    .addComponent(jLHasta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXDFecha2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jXDFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBFecha))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXDFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBFecha)
                    .addComponent(jLDesde1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXDFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLHasta1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione la cantidad de monto"));

        jBMonto.setText("OK");
        jBMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMontoActionPerformed(evt);
            }
        });

        jLDesde.setText("Desde");

        jLHasta.setText("Hasta");

        javax.swing.GroupLayout jPMontoLayout = new javax.swing.GroupLayout(jPMonto);
        jPMonto.setLayout(jPMontoLayout);
        jPMontoLayout.setHorizontalGroup(
            jPMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMontoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDesde)
                    .addComponent(jLHasta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextHasta)
                    .addComponent(jTextDesde, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMonto))
        );
        jPMontoLayout.setVerticalGroup(
            jPMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMontoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBMonto)
                    .addComponent(jLDesde)
                    .addComponent(jTextDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLHasta)
                    .addComponent(jTextHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jPMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFechaActionPerformed

        Date fecha = jXDFecha1.getDate();
        Date fecha2 = jXDFecha2.getDate();

        if (jXDFecha1.getDate() == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Debes Elegir por lo menos una Fecha");
        } else {
            if (jXDFecha2.getDate() == null) {
                Reporte.rFecha(fecha);
            } else {
                Reporte.rRFecha(fecha, fecha2);
            }
        }
    }//GEN-LAST:event_jBFechaActionPerformed

    private void jBMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMontoActionPerformed
        Double monto = Double.parseDouble(jTextDesde.getText());
        Double monto2 = Double.parseDouble(jTextHasta.getText());

        if (jTextDesde.getText().equals(null) && jTextHasta.getText().equals(null)) {
            javax.swing.JOptionPane.showMessageDialog(null, "Debes poner por lo menos un monto");
        } else {
            if (monto2 == null) {
                Reporte.rMonto(0.0, monto);
            } else {
                Reporte.rMonto(monto, monto2);
            }
        }
    }//GEN-LAST:event_jBMontoActionPerformed

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
            java.util.logging.Logger.getLogger(rFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                rFactura dialog = new rFactura(new javax.swing.JFrame(), false);
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
    private javax.swing.JButton jBFecha;
    private javax.swing.JButton jBMonto;
    private javax.swing.JLabel jLDesde;
    private javax.swing.JLabel jLDesde1;
    private javax.swing.JLabel jLHasta;
    private javax.swing.JLabel jLHasta1;
    private javax.swing.JLabel jLReporte;
    private javax.swing.JPanel jPMonto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextDesde;
    private javax.swing.JTextField jTextHasta;
    private org.jdesktop.swingx.JXDatePicker jXDFecha1;
    private org.jdesktop.swingx.JXDatePicker jXDFecha2;
    // End of variables declaration//GEN-END:variables

}
