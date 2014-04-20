package manejo;

import clases.BdConection;
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
public class ManejoNcf {

    //Conectar a base de datos
    private Connection con = BdConection.getBdConection().getConexion();

    //Buscar una factura con condiciones
    public Ncf getNcf(int codigo) {
        Ncf ncf = new Ncf();
        String squery = "SELECT * FROM ncf WHERE codigo =" + codigo;
        System.out.println(squery);
        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            if (rs.next()) {
                ncf.setCodigo(rs.getInt("codigo"));
                ncf.setDescripcion(rs.getString("descripcion"));
                ncf.setPrefijo(rs.getString("prefijo"));
                ncf.setTipo_ncf(rs.getInt("tipo_ncf"));
                ncf.setSec_inicio(rs.getInt("sec_inicio"));
                ncf.setSec_final(rs.getInt("sec_final"));
                ncf.setActual(rs.getInt("actual"));

            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "No existe este tipo de ncf en el registro");
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en getNcf");
        }

        return ncf;
    }

    //Buscar la lista de todos los detalles de la factura
    public List<Ncf> getListaNcf() {
        List<Ncf> listaNcf = new ArrayList<>();

        Ncf ncf = new Ncf();
        String squery = "SELECT * FROM ncf";

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            while (rs.next()) {
                ncf = new Ncf();

                ncf.setCodigo(rs.getInt("codigo"));
                ncf.setDescripcion(rs.getString("descripcion"));
                ncf.setPrefijo(rs.getString("prefijo"));
                ncf.setTipo_ncf(rs.getInt("tipo_ncf"));
                ncf.setSec_inicio(rs.getInt("sec_inicio"));
                ncf.setSec_final(rs.getInt("sec_final"));
                ncf.setActual(rs.getInt("actual"));

                listaNcf.add(ncf);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en Lista de ncf");
        }

        return listaNcf;
    }

    //Guardar detalles de una factura
    public boolean guardarNcf(Ncf ncf) {

        boolean guardado = false;
        String squery = "INSERT ncf "
                + "(descripcion,prefijo,tipo_ncf,"
                + "sec_inicio,sec_final,actual) VALUES "
                + "(?,?,?,?,?,?)";

        try {

            PreparedStatement pst = con.prepareStatement(squery);

            pst.setString(1, ncf.getDescripcion());
            pst.setString(2, ncf.getPrefijo());
            pst.setInt(3, ncf.getTipo_ncf());
            pst.setInt(4, ncf.getSec_inicio());
            pst.setInt(5, ncf.getSec_final());
            pst.setInt(6, ncf.getActual());

            guardado = pst.execute();

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en guardar ncf");
        }

        return guardado;
    }

    public int getTotal() {
        String squery = "SELECT count(codigo) as codigo FROM ncf";
        int total = 0;

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);
            if (rs.next()) {
                total = rs.getInt("codigo");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en total ncf");
        }
        return total;
    }

    public static String getNCFSiguiente(Ncf ncf) {

        String prefix = ncf.getPrefijo();
        String tipoNcf = ncf.getTipo_ncf() < 10 ? "0" + ncf.getTipo_ncf() : ncf.getTipo_ncf().toString();

        
        System.out.println("El codigo es : "+ncf.getCodigo());
        int secuecia = new ManejoNcf().getNcf(ncf.getCodigo()).getActual() + 1;

        String sec = String.valueOf(secuecia);
        secuecia = 8 - sec.length();

        for (int x = 0; x < secuecia; x++) {
            sec = "0" + sec;
        }

        return prefix + tipoNcf + sec;
    }

    public void updateActual(int codigo) {
        String squery = "Update ncf set actual=actual+1 where codigo =" + codigo;

        try {
            con.prepareStatement(squery).executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en total ncf");
        }
    }
    
    public void borrarNcf(int codigo) {
        String squery = "DELETE FROM ncf WHERE codigo=" + codigo;
        try {
            con.createStatement().executeUpdate(squery);

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en borrar ncf");
        }
    }

    public void updateNcf(Ncf ncf) {

        String squery = "UPDATE ncf "
                + "SET codigo=" + ncf.getCodigo()
                + ",descripcion='" + ncf.getDescripcion()
                + "' WHERE codigo =" + ncf.getCodigo();

        try {
            con.createStatement().executeUpdate(squery);
        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en update ubicacion");
        }

    }
//    Pruebas
//    public static void main(String[] args) {
//        ManejoNcf mNcf = new ManejoNcf();
//        
//        mNcf.updateActual(1);
//
//        ManejoNcf.getNCFSiguiente(mNcf.getNcf(1));
//
//        Ncf test = new Ncf();
//        test.setDescripcion("Test1");
//        test.setPrefijo("Test2");
//        test.setTipo_ncf(1);
//        test.setSec_inicio(2);
//        test.setSec_final(3);
//        test.setActual(4);
//
//        System.out.println(mNcf.guardarNcf(test));
//
//        Ncf ncf1 = mNcf.getNcf(1);
//        System.out.println(ncf1.getPrefijo()+ncf1.getTipo_ncf()+ncf1.getActual());
//
//        System.out.println("===== Lista de detalle de factura =====");
//        for (Ncf ncf : mNcf.getListaNcf()) {
//            System.out.println(ncf.getDescripcion());
//            System.out.println(ncf.getPrefijo());
//            System.out.println(ncf.getTipo_ncf());
//            System.out.println(ncf.getSec_inicio());
//            System.out.println(ncf.getSec_final());
//            System.out.println(ncf.getActual());
//
//            System.out.println("===================");
//        }
//
//
//    }
}
