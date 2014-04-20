package manejo;

import clases.BdConection;
import entidades.Recibo;
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
public class ManejoRecibo {

    //Conectar a base de datos
    private Connection con = BdConection.getBdConection().getConexion();

    //Buscar una factura con condiciones
    private Recibo getRecibo(int codigo) {
        Recibo recibo = new Recibo();
        String squery = "SELECT * FROM recibo WHERE codigo =" + codigo;

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            if (rs.next()) {
                recibo.setCodigo(rs.getInt("codigo"));
                recibo.setFecha(rs.getDate("fecha"));
                recibo.setCliente(rs.getInt("cliente"));
                recibo.setMonto(rs.getDouble("monto"));
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en getRecibo");
        }

        return recibo;
    }

    //Buscar la lista de todos los detalles de la factura
    public List<Recibo> getListaRecibo() {
        List<Recibo> listaRecibo = new ArrayList<>();

        Recibo recibo = new Recibo();
        String squery = "SELECT * FROM recibo";

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            while (rs.next()) {
                recibo = new Recibo();

                recibo.setCodigo(rs.getInt("codigo"));
                recibo.setFecha(rs.getDate("fecha"));
                recibo.setCliente(rs.getInt("cliente"));
                recibo.setMonto(rs.getDouble("monto"));

                listaRecibo.add(recibo);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en Lista de recibo");
        }

        return listaRecibo;
    }

    //Guardar detalles de una factura
    public boolean guardarRecibo(Recibo recibo) {

        boolean guardado = false;
        String squery = "INSERT recibo "
                + "(cliente,fecha,monto) VALUES "
                + "(?,?,?)";

        try {

            PreparedStatement pst = con.prepareStatement(squery);

            pst.setInt(1, recibo.getCliente());
            pst.setDate(2, new java.sql.Date(recibo.getFecha().getTime()));
            pst.setDouble(3, recibo.getMonto());

            guardado = pst.execute();

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en guardar recibo");
        }

        return guardado;
    }

    //Pruebas
    public static void main(String[] args) {
        ManejoRecibo mRecibo = new ManejoRecibo();

        Recibo test = new Recibo();

        test.setCliente(1);
        test.setFecha(new Date());
        test.setMonto(2.0);

        System.out.println(mRecibo.guardarRecibo(test));

        Recibo recibo1 = mRecibo.getRecibo(1);
        System.out.println(recibo1);

        System.out.println("===== Lista de detalle de recibo =====");
        for (Recibo recibo : mRecibo.getListaRecibo()) {

            System.out.println(recibo.getCliente());
            System.out.println(recibo.getFecha());
            System.out.println(recibo.getMonto());
            System.out.println("===================");
        }


    }
}
