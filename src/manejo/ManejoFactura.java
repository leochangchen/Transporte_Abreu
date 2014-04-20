package manejo;

import clases.BdConection;
import entidades.Cliente;
import entidades.DetalleFactura;
import entidades.Factura;
import entidades.Ncf;
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
public class ManejoFactura {

    //Conectar a base de datos
    private Connection con = BdConection.getBdConection().getConexion();

    //Buscar una factura con condiciones
    public Factura getFactura(int codigo) {
        Factura factura = new Factura();
        String squery = "SELECT * FROM factura WHERE codigo =" + codigo;
        ManejoCliente mCliente = new ManejoCliente();
        ManejoNcf mNcf = new ManejoNcf();

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            if (rs.next()) {
                factura.setCodigo(rs.getInt("codigo"));
                factura.setCliente(mCliente.getCliente(rs.getInt("cliente")));
                factura.setFecha_factura(rs.getDate("fecha_factura"));
                factura.setNcf(rs.getString("ncf"));
                factura.setMonto(rs.getDouble("monto"));
                factura.setItbis(rs.getDouble("itbis"));
                factura.setSubtotal(rs.getDouble("subtotal"));
                factura.setPendiente(rs.getDouble("pendiente"));
                factura.setCod_ncf(mNcf.getNcf(rs.getInt("cod_ncf")));
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en getFactura");
        }

        return factura;
    }

    //Buscar la lista de todos los detalles de la factura
    public List<Factura> getListaFactura() {
        List<Factura> listaFactura = new ArrayList<>();

        Factura factura = new Factura();
        String squery = "SELECT * FROM factura";

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            while (rs.next()) {
                factura = new Factura();
                ManejoCliente mCliente = new ManejoCliente();
                ManejoNcf mNcf = new ManejoNcf();

                factura.setCodigo(rs.getInt("codigo"));
                factura.setCliente(mCliente.getCliente(rs.getInt("cliente")));
                factura.setFecha_factura(rs.getDate("fecha_factura"));
                factura.setNcf(rs.getString("ncf"));
                factura.setMonto(rs.getDouble("monto"));
                factura.setItbis(rs.getDouble("itbis"));
                factura.setSubtotal(rs.getDouble("subtotal"));
                factura.setPendiente(rs.getDouble("pendiente"));
                factura.setCod_ncf(mNcf.getNcf(rs.getInt("cod_ncf")));

                listaFactura.add(factura);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en Lista de factura");
        }

        return listaFactura;
    }

    //Buscar el total de registro
    public int getTotal() {
        String squery = "SELECT count(codigo) as codigo FROM factura";
        int total = 0;

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);
            if (rs.next()) {
                total = rs.getInt("codigo");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en total factura");
        }
        return total;
    }

    //Guardar detalles de una factura
    public boolean guardarFactura(Factura factura) {

        boolean guardado = false;
        String squery = "INSERT factura "
                + "(cliente,fecha_factura,ncf,monto,"
                + "itbis,subtotal,cod_ncf) VALUES "
                + "(?,?,?,?,?,?,?)";

        try {

            PreparedStatement pst = con.prepareStatement(squery);

            pst.setInt(1, factura.getCliente().getCodigo());
            pst.setDate(2, new java.sql.Date(factura.getFecha_factura().getTime()));
            pst.setString(3, factura.getNcf());
            pst.setDouble(4, factura.getMonto());
            pst.setDouble(5, factura.getItbis());
            pst.setDouble(6, factura.getSubtotal());
            //pst.setDouble(7, factura.getPendiente());
            pst.setInt(7, factura.getCod_ncf().getCodigo());
            //factura.setNcf(ManejoNcf.getNCFSiguiente((Ncf) jCBFTipo.getSelectedItem()));

            guardado = pst.execute();
            if (!guardado) {
                ManejoDetalleFactura mDFactura = new ManejoDetalleFactura();

                for (DetalleFactura detFac : factura.getDetalleFactura()) {
                    mDFactura.guardarDetalleFactura(detFac);
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en guardar factura");
        }

        return guardado;
    }

    public void borrarFactura(int codigo) {
        String squery = "DELETE FROM factura WHERE codigo=" + codigo;
        try {
            con.createStatement().executeUpdate(squery);

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en borrarfactura");
        }
    }

    public void updateFactura(Factura factura) {

        String squery = "UPDATE factura "
                + "SET monto='" + factura.getMonto()
                + "',itbis='" + factura.getItbis()
                + "',subtotal='" + factura.getSubtotal()
                + "'WHERE codigo =" + factura.getCodigo();

        try {
            con.createStatement().executeUpdate(squery);
        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en update factura");
        }

    }
//    Pruebas
//    public static void main(String[] args) {
//        ManejoFactura mFactura = new ManejoFactura();
//        ManejoNcf mNcf = new ManejoNcf();
//        ManejoCliente mCliente = new ManejoCliente();
//
//        Factura test = new Factura();
//        test.setCliente(mCliente.getCliente(1));
//        test.setFecha_factura(new Date());
//        test.setNcf("Test");
//        test.setMonto(2.0);
//        test.setItbis(3.3);
//        test.setSubtotal(4.4);
//        test.setPendiente(5.5);
//        test.setCod_ncf(mNcf.getNcf(1));
//
//        System.out.println(mFactura.guardarFactura(test));
//
//        Factura factura1 = mFactura.getFactura(1);
//        System.out.println(factura1);
//
//        System.out.println("===== Lista de detalle de factura =====");
//        for (Factura factura : mFactura.getListaFactura()) {
//            System.out.println(factura.getCliente());
//            System.out.println(factura.getFecha_factura());
//            System.out.println(factura.getNcf());
//            System.out.println(factura.getMonto());
//            System.out.println(factura.getItbis());
//            System.out.println(factura.getSubtotal());
//            System.out.println(factura.getPendiente());
//            System.out.println(factura.getCod_ncf());
//            System.out.println("===================");
//    }
}
