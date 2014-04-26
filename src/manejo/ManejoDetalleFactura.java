package manejo;

import clases.BdConection;
import entidades.DetalleFactura;
import entidades.Ubicacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import manejo.ManejoUbicacion;

/**
 * @author Leo-PC:U83U06 Transporte_Abreu Hecho por : Enriquillo, Erick Abreu,
 * Chang I-hua Fecha : 2013-Primer semestre
 */
public class ManejoDetalleFactura {

    ManejoUbicacion mUbicacion = new ManejoUbicacion();
    //Conectar a base de datos
    private Connection con = BdConection.getBdConection().getConexion();

    //Buscar una detalle de factura con condiciones
    public DetalleFactura getDetalleFactura(int codigo) {
        DetalleFactura dFactura = new DetalleFactura();
        String squery = "SELECT * FROM detalle_factura WHERE codigo =" + codigo;

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            if (rs.next()) {
                dFactura.setCodigo(rs.getInt("codigo"));
                dFactura.setFecha(rs.getDate("Fecha"));
                dFactura.setCod_factura(rs.getInt("cod_factura"));
                dFactura.setTipo_carga(rs.getString("cod_tipo_carga"));
                dFactura.setCod_origen((mUbicacion.getUbicacion(rs.getInt("cod_origen"))));
                dFactura.setCod_destino(mUbicacion.getUbicacion(rs.getInt("cod_destino")));
                dFactura.setNum_conduce(rs.getString("num_conduce"));
                dFactura.setNum_contenedor(rs.getString("num_contenedor"));
                dFactura.setValor(rs.getDouble("valor"));
                dFactura.setCod_transporte(rs.getInt("cod_transporte"));
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en getDetalleFactura");
        }

        return dFactura;
    }

    //Buscar la lista de todos los detalles de la factura
    public List<DetalleFactura> getListaDetalleFactura() {
        List<DetalleFactura> listaDetalleFactura = new ArrayList<>();

        DetalleFactura dFactura = new DetalleFactura();
        String squery = "SELECT * FROM detalle_factura";

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            while (rs.next()) {
                dFactura = new DetalleFactura();

                dFactura.setCodigo(rs.getInt("codigo"));
                dFactura.setFecha(rs.getDate("Fecha"));
                dFactura.setCod_factura(rs.getInt("cod_factura"));
                dFactura.setTipo_carga(rs.getString("cod_tipo_carga"));
                dFactura.setCod_origen(mUbicacion.getUbicacion(rs.getInt("cod_origen")));
                dFactura.setCod_destino(mUbicacion.getUbicacion(rs.getInt("cod_destino")));
                dFactura.setNum_conduce(rs.getString("num_conduce"));
                dFactura.setNum_contenedor(rs.getString("num_contenedor"));
                dFactura.setValor(rs.getDouble("valor"));
                dFactura.setCod_transporte(rs.getInt("cod_transporte"));

                listaDetalleFactura.add(dFactura);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en Lista de detalle factura");
        }

        return listaDetalleFactura;
    }

    public List<DetalleFactura> getLDetalleFactura(int codigo) {
        List<DetalleFactura> listaDetalleFactura = new ArrayList<>();

        DetalleFactura dFactura = new DetalleFactura();
        String squery = "SELECT * FROM detalle_factura WHERE cod_factura=" + codigo;

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            while (rs.next()) {
                dFactura = new DetalleFactura();

                dFactura.setCodigo(rs.getInt("codigo"));
                dFactura.setFecha(rs.getDate("Fecha"));
                dFactura.setCod_factura(rs.getInt("cod_factura"));
                dFactura.setTipo_carga(rs.getString("cod_tipo_carga"));
                dFactura.setCod_origen(mUbicacion.getUbicacion(rs.getInt("cod_origen")));
                dFactura.setCod_destino(mUbicacion.getUbicacion(rs.getInt("cod_destino")));
                dFactura.setNum_conduce(rs.getString("num_conduce"));
                dFactura.setNum_contenedor(rs.getString("num_contenedor"));
                dFactura.setValor(rs.getDouble("valor"));
                dFactura.setCod_transporte(rs.getInt("cod_transporte"));

                listaDetalleFactura.add(dFactura);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en Lista de detalle factura");
        }

        return listaDetalleFactura;
    }

    //Guardar detalles de una factura
    public boolean guardarDetalleFactura(DetalleFactura dFactura) {

        boolean guardado = false;
        String squery = "INSERT detalle_factura "
                + "(cod_factura,fecha,cod_tipo_carga,cod_origen,cod_destino,"
                + "num_conduce,num_contenedor,valor,cod_transporte) VALUES "
                + "(?,?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement pst = con.prepareStatement(squery);

            pst.setInt(1, dFactura.getCod_factura());
            pst.setDate(2, new java.sql.Date(dFactura.getFecha().getTime()));
            pst.setString(3, dFactura.getTipo_carga());
            pst.setInt(4, dFactura.getCod_origen().getCodigo());
            pst.setInt(5, dFactura.getCod_destino().getCodigo());
            pst.setString(6, dFactura.getNum_conduce());
            pst.setString(7, dFactura.getNum_contenedor());
            pst.setDouble(8, dFactura.getValor());
            pst.setInt(9, dFactura.getCod_transporte());

            guardado = pst.execute();

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en guardar detalle factura");
        }

        return guardado;
    }

    public int getTotal() {
        String squery = "SELECT count(codigo) as codigo FROM detalle_factura";
        int total = 0;

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);
            if (rs.next()) {
                total = rs.getInt("codigo");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en total de detalle de factura");
        }
        return total;
    }

    public void borrarDFactura(int codigo) {
        String squery = "DELETE FROM factura WHERE codigo=" + codigo;
        try {
            con.createStatement().executeUpdate(squery);

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en borrar detalle de factura");
        }
    }

    public void updateDFactura(DetalleFactura detalleFactura) {

        String squery = "UPDATE detalle_factura "
                + "SET cod_tipo_carga=" + detalleFactura.getTipo_carga()
                + ",num_conduce='" + detalleFactura.getNum_conduce()
                + "',num_contenedor='" + detalleFactura.getNum_contenedor()
                + "',valor=" + detalleFactura.getValor()
                + "WHERE codigo =" + detalleFactura.getCodigo();

        try {
            con.createStatement().executeUpdate(squery);
        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en update detalle de factura");
        }

    }

//    Pruebas
//    public static void main(String[] args) {
//        ManejoDetalleFactura mDFactura = new ManejoDetalleFactura();
//
//        DetalleFactura test = new DetalleFactura();
//        test.setFecha(new Date());
//        test.setCod_factura(123456);
//        test.setCod_tipo_carga(1);
//        test.setCod_origen(2);
//        test.setCod_destino(3);
//        test.setNum_conduce("A");
//        test.setNum_contenedor("D");
//        test.setValor(1.1);
//        test.setCod_transporte(4);
//
//        System.out.println(mDFactura.guardarDetalleFactura(test));
//
//        DetalleFactura dFactura1 = mDFactura.getDetalleFactura(1);
//        System.out.println(dFactura1);
//
//        System.out.println("===== Lista de detalle de factura =====");
//        for (DetalleFactura detalleFactura : mDFactura.getListaDetalleFactura()) {
//            System.out.println(detalleFactura.getCod_factura());
//            System.out.println(detalleFactura.getFecha());
//            System.out.println(detalleFactura.getCod_tipo_carga());
//            System.out.println(detalleFactura.getCod_origen());
//            System.out.println(detalleFactura.getCod_destino());
//            System.out.println(detalleFactura.getNum_conduce());
//            System.out.println(detalleFactura.getNum_contenedor());
//            System.out.println(detalleFactura.getValor());
//            System.out.println(detalleFactura.getCod_transporte());
//            System.out.println("===================");
//        }
//
//
//    }
}
