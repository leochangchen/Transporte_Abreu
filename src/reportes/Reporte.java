package reportes;

import clases.BdConection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 * @author Leo-PC:U83U06 Transporte_Abreu Hecho por : Enriquillo, Erick Abreu,
 * Chang I-hua Fecha : 2013-Primer semestre
 */
public class Reporte {

    public static void rFecha(Date fecha) {
        try {
            JasperReport reporte;
            JasperPrint print;
            Map parameters = new HashMap<>();

            parameters.put("Fecha", fecha);

            reporte = (JasperReport) JRLoader.loadObject(Reporte.class.getResourceAsStream("/reportes/tFactura.jasper"));
            print = JasperFillManager.fillReport(reporte, parameters, BdConection.getBdConection().getConexion());
            JasperViewer visor = new JasperViewer(print, false);
            visor.setVisible(true);
//            visor.setDefaultCloseOperation(visor.DISPOSE_ON_CLOSE);

        } catch (JRException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void rRFecha(Date fecha, Date fecha2) {
        try {
            JasperReport reporte;
            JasperPrint print;
            Map parameters = new HashMap<>();

            parameters.put("Fecha", fecha);
            parameters.put("Fecha2", fecha2);

            reporte = (JasperReport) JRLoader.loadObject(Reporte.class.getResourceAsStream("/reportes/tFactura_1.jasper"));
            print = JasperFillManager.fillReport(reporte, parameters, BdConection.getBdConection().getConexion());
            JasperViewer visor = new JasperViewer(print, false);
            visor.setVisible(true);
//            visor.setDefaultCloseOperation(visor.DISPOSE_ON_CLOSE);

        } catch (JRException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void rMonto(Double monto, Double monto2) {
        try {
            JasperReport reporte;
            JasperPrint print;
            Map parameters = new HashMap<>();

            parameters.put("Monto", monto);
            parameters.put("Monto2", monto2);

            reporte = (JasperReport) JRLoader.loadObject(Reporte.class.getResourceAsStream("/reportes/tMonto.jasper"));
            print = JasperFillManager.fillReport(reporte, parameters, BdConection.getBdConection().getConexion());
            JasperViewer visor = new JasperViewer(print, false);
            visor.setVisible(true);
//            visor.setDefaultCloseOperation(visor.DISPOSE_ON_CLOSE);

        } catch (JRException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void rCliente() {
        try {
            JasperReport reporte;
            JasperPrint print;

            reporte = (JasperReport) JRLoader.loadObject(Reporte.class.getResourceAsStream("/reportes/tCliente.jasper"));
            print = JasperFillManager.fillReport(reporte, null, BdConection.getBdConection().getConexion());
            JasperViewer visor = new JasperViewer(print, false);
//            visor.setDefaultCloseOperation(visor.HIDE_ON_CLOSE);
            visor.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void rFactura(int codigo) {
        try {
            JasperReport reporte;
            JasperPrint print;
            Map parameters = new HashMap<>();
            parameters.put("CodFac", codigo);

            reporte = (JasperReport) JRLoader.loadObject(Reporte.class.getResourceAsStream("/reportes/tFacturaGeneral.jasper"));
            print = JasperFillManager.fillReport(reporte, parameters, BdConection.getBdConection().getConexion());
            JasperViewer visor = new JasperViewer(print, false);
            visor.setVisible(true);
//            visor.setDefaultCloseOperation(visor.DISPOSE_ON_CLOSE);

        } catch (JRException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
    }
}
