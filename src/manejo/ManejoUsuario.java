package manejo;

import clases.BdConection;
import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Leo-PC:U83U06 Transporte_Abreu Hecho por : Enriquillo, Erick Abreu,
 * Chang I-hua Fecha : 2013-Primer semestre
 */
public class ManejoUsuario {

    //Conectar a base de datos
    private Connection con = BdConection.getBdConection().getConexion();

    //Buscar un cliente con condiciones
    public Usuario getUsuario(int codigo) {
        Usuario usuario = new Usuario();
        String squery = "SELECT * FROM usuario WHERE codigo =" + codigo;

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            if (rs.next()) {
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setPassword(rs.getString("password"));
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "No existe este usuario en el registro");
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en getUsuario");
        }

        return usuario;
    }

    public Usuario getSUsuario(String getusuario) {
        Usuario usuario = new Usuario();
        String squery = "SELECT * FROM usuario WHERE usuario ='" + getusuario + "'";
        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            if (rs.next()) {
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setPassword(rs.getString("password"));
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "No existe este usuario en el registro");
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en getUsuario");
        }

        return usuario;
    }

    //Buscar lista de todos los clientes
    public List<Usuario> getListaUsuario() {
        List<Usuario> listaUsuario = new ArrayList<>();

        Usuario usuario = new Usuario();
        String squery = "SELECT * FROM usuario ";

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            while (rs.next()) {
                usuario = new Usuario();

                usuario.setUsuario(rs.getString("usuario"));
                usuario.setPassword(rs.getString("password"));

                listaUsuario.add(usuario);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en Lista de usuario");
        }

        return listaUsuario;
    }

    //Guardar clientes
    public boolean guardarUsuario(Usuario usuario) {

        boolean guardado = false;
        String squery = "INSERT usuario "
                + "(usuario,password) VALUES "
                + "(?,?) ";

        try {

            PreparedStatement pst = con.prepareStatement(squery);

            pst.setString(1, usuario.getUsuario());
            pst.setString(2, usuario.getPassword());

            guardado = pst.execute();

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en guardar usuario");
        }

        return guardado;
    }

    public int getTotal() {
        String squery = "SELECT count(codigo) as codigo FROM usuario";
        int total = 0;

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);
            if (rs.next()) {
                total = rs.getInt("codigo");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en total usuario");
        }
        return total;
    }

//    public int getCod_Ubicacion(Ubicacion ubicacion) {
//        int codigo = ubicacion.getCodigo();
//        return codigo;
//    }
//    
//    public Ubicacion getSUbicacion(String codigo) {
//        Ubicacion ubicacion = new Ubicacion();
//        String squery = "SELECT * FROM ubicacion WHERE codigo =" + codigo;
//
//        System.out.println(con);
//        try {
//            ResultSet rs;
//            rs = con.createStatement().executeQuery(squery);
//
//            if (rs.next()) {
//                ubicacion.setCodigo(rs.getInt("codigo"));
//                ubicacion.setDescripcion(rs.getString("descripcion"));
//            } else {
//                javax.swing.JOptionPane.showMessageDialog(null, "No existe este tipo de ubicacion en el registro");
//            }
//
//        } catch (SQLException ex) {
//            System.out.println(ex);
//            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en getUbicacion");
//        }
//
//        return ubicacion;
//    }
    public void borrarUsuario(int codigo) {
        String squery = "DELETE FROM usuario WHERE codigo=" + codigo;
        try {
            con.createStatement().executeUpdate(squery);

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en borrar usuario");
        }
    }

    public void updateUsuario(Usuario usuario) {

        String squery = "UPDATE usuario "
                + "SET usuario='" + usuario.getUsuario()
                + ",password='" + usuario.getPassword()
                + "' WHERE codigo =" + usuario.getCodigo();

        try {
            con.createStatement().executeUpdate(squery);
        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en update usuario");
        }

    }

//    Prueba
//    public static void main(String[] args) {
//        ManejoUsuario mUsuario = new ManejoUsuario();
//
//        Usuario test = new Usuario();
//
//        test.setUsuario("test");
//        test.setPassword("test");
//
//        System.out.println(mUsuario.guardarUsuario(test));
//
//        Usuario usuario1 = mUsuario.getUsuario(1);
//        System.out.println(usuario1);
//
//        System.out.println("=========== Lista de ubicacion ===============");
//        for (Usuario usuario : mUsuario.getListaUsuario()) {
//            System.out.println(usuario.getUsuario());
//            System.out.println(usuario.getPassword());
//            System.out.println("===================");
//        }
//
//    }
}
