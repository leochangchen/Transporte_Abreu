package manejo;

import clases.BdConection;
import entidades.Ubicacion;
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
public class ManejoUbicacion {

    //Conectar a base de datos
    private Connection con = BdConection.getBdConection().getConexion();

    //Buscar un cliente con condiciones
    public Ubicacion getUbicacion(int codigo) {
        Ubicacion ubicacion = new Ubicacion();
        String squery = "SELECT * FROM ubicacion WHERE codigo =" + codigo;

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            if (rs.next()) {
                ubicacion.setCodigo(rs.getInt("codigo"));
                ubicacion.setDescripcion(rs.getString("descripcion"));
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "No existe este tipo de ubicacion en el registro");
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en getUbicacion");
        }

        return ubicacion;
    }

    //Buscar lista de todos los clientes
    public List<Ubicacion> getListaUbicacion() {
        List<Ubicacion> listaUbicacion = new ArrayList<>();

        Ubicacion ubicacion = new Ubicacion();
        String squery = "SELECT * FROM ubicacion ";

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            while (rs.next()) {
                ubicacion = new Ubicacion();

                ubicacion.setCodigo(rs.getInt("codigo"));
                ubicacion.setDescripcion(rs.getString("descripcion"));

                listaUbicacion.add(ubicacion);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en Lista de ubicacion");
        }

        return listaUbicacion;
    }

    //Guardar clientes
    public boolean guardarUbicacion(Ubicacion ubicacion) {

        boolean guardado = false;
        String squery = "INSERT ubicacion "
                + "(descripcion) VALUES "
                + "(?) ";

        try {

            PreparedStatement pst = con.prepareStatement(squery);

            pst.setString(1, ubicacion.getDescripcion());

            guardado = pst.execute();

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en guardar ubicacion");
        }

        return guardado;
    }

    public int getTotal() {
        String squery = "SELECT count(codigo) as codigo FROM ubicacion";
        int total = 0;

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);
            if (rs.next()) {
                total = rs.getInt("codigo");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en total Ubicacion");
        }
        return total;
    }

    public int getCod_Ubicacion(Ubicacion ubicacion) {
        int codigo = ubicacion.getCodigo();
        return codigo;
    }

    public Ubicacion getSUbicacion(String codigo) {
        Ubicacion ubicacion = new Ubicacion();
        String squery = "SELECT * FROM ubicacion WHERE codigo =" + codigo;

        System.out.println(con);
        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            if (rs.next()) {
                ubicacion.setCodigo(rs.getInt("codigo"));
                ubicacion.setDescripcion(rs.getString("descripcion"));
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "No existe este tipo de ubicacion en el registro");
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en getUbicacion");
        }

        return ubicacion;
    }

    public void borrarUbicacion(int codigo) {
        String squery = "DELETE FROM ubicacion WHERE codigo=" + codigo;
        try {
            con.createStatement().executeUpdate(squery);

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en borrar ubicacion");
        }
    }

    public void updateUbicacion(Ubicacion ubicacion) {

        String squery = "UPDATE ubicacion "
                + "SET codigo=" + ubicacion.getCodigo()
                + ",descripcion='" + ubicacion.getDescripcion()
                + "' WHERE codigo =" + ubicacion.getCodigo();

        try {
            con.createStatement().executeUpdate(squery);
        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en update ubicacion");
        }

    }

//    Prueba
//    public static void main(String[] args) {
//        ManejoUbicacion mUbicacion = new ManejoUbicacion();
//
//        Ubicacion test = new Ubicacion();
//
//        test.setDescripcion("test1");
//
//        System.out.println(mUbicacion.guardarUbicacion(test));
//
//        Ubicacion ubicacion1 = mUbicacion.getUbicacion(1);
//        System.out.println(ubicacion1);
//
//        System.out.println("=========== Lista de ubicacion ===============");
//        for (Ubicacion ubicacion : mUbicacion.getListaUbicacion()) {
//            System.out.println(test.getDescripcion());
//            System.out.println("===================");
//        }
//
//    }
}
