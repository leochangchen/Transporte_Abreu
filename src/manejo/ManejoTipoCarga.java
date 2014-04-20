package manejo;

import clases.BdConection;
import entidades.TipoCarga;
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
public class ManejoTipoCarga {

    //Conectar a base de datos
    private Connection con = BdConection.getBdConection().getConexion();

    //Buscar una factura con condiciones
    public TipoCarga getTipoCarga(int codigo) {
        TipoCarga tCarga = new TipoCarga();
        String squery = "SELECT * FROM tipo_carga WHERE codigo =" + codigo;

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            if (rs.next()) {
                tCarga.setCodigo(rs.getInt("codigo"));
                tCarga.setDescripcion(rs.getString("descripcion"));
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "No existe este tipo de carga en el registro");
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en getTipoCarga");
        }

        return tCarga;
    }

    //Buscar la lista de todos los detalles de la factura
    public List<TipoCarga> getListaTipoCarga() {
        List<TipoCarga> listaTipoCarga = new ArrayList<>();

        TipoCarga tCarga = new TipoCarga();
        String squery = "SELECT * FROM tipo_carga";

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            while (rs.next()) {
                tCarga = new TipoCarga();

                tCarga.setCodigo(rs.getInt("codigo"));
                tCarga.setDescripcion(rs.getString("descripcion"));

                listaTipoCarga.add(tCarga);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en Lista de tipo de carga");
        }

        return listaTipoCarga;
    }

    //Guardar detalles de una factura
    public boolean guardarTipoCarga(TipoCarga tCarga) {

        boolean guardado = false;
        String squery = "INSERT tipo_carga "
                + "(codigo,descripcion) VALUES "
                + "(?,?)";

        try {

            PreparedStatement pst = con.prepareStatement(squery);

            pst.setInt(1, tCarga.getCodigo());
            pst.setString(2, tCarga.getDescripcion());

            guardado = pst.execute();

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en guardar tipo de carga");
        }

        return guardado;
    }

    public int getTotal() {
        String squery = "SELECT count(codigo) as codigo FROM tipo_carga";
        int total = 0;

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);
            if (rs.next()) {
                total = rs.getInt("codigo");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en total tipo de carga");
        }
        return total;
    }
    
    public void borrarCarga(int codigo) {
        String squery = "DELETE FROM tipo_carga WHERE codigo=" + codigo;
        try {
            con.createStatement().executeUpdate(squery);

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en borrar ubicacion");
        }
    }

    public void updateTCarga(TipoCarga tCarga) {

        String squery = "UPDATE ubicacion "
                + "SET codigo=" + tCarga.getCodigo()
                + ",descripcion='" + tCarga.getDescripcion()
                + "' WHERE codigo =" + tCarga.getCodigo();

        try {
            con.createStatement().executeUpdate(squery);
        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en update ubicacion");
        }

    }

//    Pruebas
//    public static void main(String[] args) {
//        ManejoTipoCarga mTipoCarga = new ManejoTipoCarga();
//
//        TipoCarga test = new TipoCarga();
//        test.setCodigo(2);
//        test.setDescripcion("Test2");
//
//        System.out.println(mTipoCarga.guardarTipoCarga(test));
//
//        TipoCarga tCarga1 = mTipoCarga.getTipoCarga(1);
//        System.out.println(tCarga1);
//
//        System.out.println("===== Lista de detalle de factura =====");
//        for (TipoCarga tCarga : mTipoCarga.getListaTipoCarga()) {
//            System.out.println(tCarga.getCodigo());
//            System.out.println(tCarga.getDescripcion());
//            System.out.println("===================");
//        }
//
//
//    }
}
