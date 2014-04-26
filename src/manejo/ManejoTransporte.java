package manejo;

import clases.BdConection;
import entidades.Transporte;
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
public class ManejoTransporte {

    //Conectar a base de datos
    private Connection con = BdConection.getBdConection().getConexion();

    //Buscar un cliente con condiciones
    public Transporte getTransporte(int codigo) {
        Transporte transporte = new Transporte();
        String squery = "SELECT * FROM transporte WHERE codigo =" + codigo;

        System.out.println(con);
        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            if (rs.next()) {
                transporte.setCodigo(rs.getInt("codigo"));
                transporte.setDescripcion(rs.getString("descripcion"));
                transporte.setPlaca(rs.getString("placa"));
                transporte.setColor(rs.getString("color"));
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "No existe este transporte ncf en el registro");
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en getTransporte");
        }

        return transporte;
    }

    //Buscar lista de todos los clientes
    public List<Transporte> getListaTransporte() {
        List<Transporte> listaTransporte = new ArrayList<>();

        Transporte transporte = new Transporte();
        String squery = "SELECT * FROM transporte ";

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            while (rs.next()) {
                transporte = new Transporte();

                transporte.setCodigo(rs.getInt("codigo"));
                transporte.setDescripcion(rs.getString("descripcion"));
                transporte.setPlaca(rs.getString("placa"));
                transporte.setColor(rs.getString("color"));

                listaTransporte.add(transporte);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en Lista de transporte");
        }

        return listaTransporte;
    }

    //Guardar clientes
    public boolean guardarTransporte(Transporte transporte) {

        boolean guardado = false;
        String squery = "INSERT transporte "
                + "(descripcion,placa,color) VALUES "
                + "(?,?,?) ";

        try {

            PreparedStatement pst = con.prepareStatement(squery);

            pst.setString(1, transporte.getDescripcion());
            pst.setString(2, transporte.getPlaca());
            pst.setString(3, transporte.getColor());

            guardado = pst.execute();

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en guardar transporte");
        }

        return guardado;
    }

    public int getTotal() {
        String squery = "SELECT count(codigo) as codigo FROM transporte";
        int total = 0;

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);
            if (rs.next()) {
                total = rs.getInt("codigo");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en total transporte");
        }
        return total;
    }

//    Prueba
//    public static void main(String[] args) {
//        ManejoTransporte mTransporte = new ManejoTransporte();
//
//        Transporte test = new Transporte();
//
//        test.setDescripcion("test1");
//        test.setPlaca("testplaca");
//        test.setColor("testcolor");
//
//        System.out.println(mTransporte.guardarTransporte(test));
//
//        Transporte transporte1 = mTransporte.getTransporte(1);
//        System.out.println(transporte1);
//
//        System.out.println("=========== Lista de transporte ===============");
//        for (Transporte transporte : mTransporte.getListaTransporte()) {
//            System.out.println(test.getDescripcion());
//            System.out.println(test.getPlaca());
//            System.out.println(test.getColor());
//            System.out.println("===================");
//        }
//
//    }
}
