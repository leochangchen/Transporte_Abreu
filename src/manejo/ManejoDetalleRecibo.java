package manejo;

import clases.BdConection;
import entidades.DetalleRecibo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Leo-PC:U83U06 Transporte_Abreu Hecho por : Enriquillo, Erick Abreu,
 * Chang I-hua Fecha : 2013-Primer semestre
 */
public class ManejoDetalleRecibo {

    //Conectar a base de datos
    private Connection con = BdConection.getBdConection().getConexion();

    //Buscar una detalle de factura con condiciones
    private DetalleRecibo getDetalleRecibo(int codigo) {
        DetalleRecibo dRecibo = new DetalleRecibo();
        String squery = "SELECT * FROM detalle_recibo WHERE codigo =" + codigo;

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            if (rs.next()) {
                dRecibo.setCodigo(rs.getInt("codigo"));
                dRecibo.setCod_recibo(rs.getInt("cod_recibo"));
                dRecibo.setCod_factura(rs.getInt("cod_factura"));
                dRecibo.setMonto(rs.getDouble("monto"));
                
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en getDetalleRecibo");
        }

        return dRecibo;
    }

    //Buscar la lista de todos los detalles de la factura
    public List<DetalleRecibo> getListaDetalleRecibo() {
        List<DetalleRecibo> listaDetalleRecibo = new ArrayList<>();

        DetalleRecibo dRecibo = new DetalleRecibo();
        String squery = "SELECT * FROM detalle_recibo";

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            while (rs.next()) {
                dRecibo = new DetalleRecibo();

                dRecibo.setCodigo(rs.getInt("codigo"));
                dRecibo.setCod_recibo(rs.getInt("cod_recibo"));
                dRecibo.setCod_factura(rs.getInt("cod_factura"));
                dRecibo.setMonto(rs.getDouble("monto"));

                listaDetalleRecibo.add(dRecibo);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en Lista de detalle recibo");
        }

        return listaDetalleRecibo;
    }

    //Guardar detalles de una factura
    public boolean guardarDetalleRecibo(DetalleRecibo dRecibo) {

        boolean guardado = false;
        String squery = "INSERT detalle_recibo "
                + "(cod_recibo,cod_factura,monto) VALUES "
                + "(?,?,?)";

        try {

            PreparedStatement pst = con.prepareStatement(squery);

            pst.setInt(1, dRecibo.getCod_recibo());
            pst.setInt(2, dRecibo.getCod_factura());
            pst.setDouble(3, dRecibo.getMonto());

            guardado = pst.execute();

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en guardar detalle recibo");
        }

        return guardado;
    }

    //Pruebas
    public static void main(String[] args) {
        ManejoDetalleRecibo mDRecibo = new ManejoDetalleRecibo();

        DetalleRecibo test = new DetalleRecibo();
        
        test.setCod_recibo(1);
        test.setCod_factura(2);
        test.setMonto(3.3);

        System.out.println(mDRecibo.guardarDetalleRecibo(test));

        DetalleRecibo dRecibo1 = mDRecibo.getDetalleRecibo(1);
        System.out.println(dRecibo1);

        System.out.println("===== Lista de detalle de factura =====");
        for (DetalleRecibo detalleFactura : mDRecibo.getListaDetalleRecibo()) {
            System.out.println(detalleFactura.getCod_recibo());
            System.out.println(detalleFactura.getCod_factura());
            System.out.println(detalleFactura.getMonto());
            System.out.println("===================");
        }


    }
}
