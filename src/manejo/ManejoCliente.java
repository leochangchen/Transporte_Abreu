package manejo;

import clases.BdConection;
import entidades.Cliente;
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
public class ManejoCliente {

    //Conectar a base de datos
    private Connection con = BdConection.getBdConection().getConexion();

    //Buscar un cliente con condiciones
    public Cliente getClienteString(String identificacion) {
        Cliente cliente = new Cliente();
        String squery = "SELECT * FROM cliente WHERE identificacion =" + identificacion;

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            if (rs.next()) {
                cliente.setCodigo(rs.getInt("codigo"));
                cliente.setFecha(rs.getDate("Fecha"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDireccion(rs.getString("Direccion"));
                cliente.setIdentificacion(rs.getString("identificacion"));
                cliente.setEmail(rs.getString("Email"));
                cliente.setTelefono(rs.getString("Telefono"));
                cliente.setActivo(rs.getBoolean("Activo"));
                cliente.setBalance(rs.getDouble("Balance"));
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "No existe este cliente en el registro");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "No existe este cliente en el registro");
        }

        return cliente;
    }

    public Cliente getCliente(int codigo) {
        Cliente cliente = new Cliente();
        String squery = "SELECT * FROM cliente WHERE codigo =" + codigo;

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            if (rs.next()) {
                cliente.setCodigo(rs.getInt("codigo"));
                cliente.setFecha(rs.getDate("Fecha"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDireccion(rs.getString("Direccion"));
                cliente.setIdentificacion(rs.getString("identificacion"));
                cliente.setEmail(rs.getString("Email"));
                cliente.setTelefono(rs.getString("Telefono"));
                cliente.setActivo(rs.getBoolean("Activo"));
                cliente.setBalance(rs.getDouble("Balance"));
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en getCliente");
        }

        return cliente;
    }
    //Buscar lista de todos los clientes

    public List<Cliente> getListaClientes() {
        List<Cliente> listaClientes = new ArrayList<>();

        Cliente cliente = new Cliente();
        String squery = "SELECT * FROM cliente ";

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);

            while (rs.next()) {
                cliente = new Cliente();

                cliente.setCodigo(rs.getInt("codigo"));
                cliente.setFecha(rs.getDate("Fecha"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDireccion(rs.getString("Direccion"));
                cliente.setIdentificacion(rs.getString("identificacion"));
                cliente.setEmail(rs.getString("Email"));
                cliente.setTelefono(rs.getString("Telefono"));
                cliente.setActivo(rs.getBoolean("Activo"));
                cliente.setBalance(rs.getDouble("Balance"));

                listaClientes.add(cliente);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en Lista de cliente");
        }

        return listaClientes;
    }

    //Guardar clientes
    public boolean guardarCliente(Cliente cliente) {

        boolean guardado = false;
        String squery = "INSERT cliente "
                + "(fecha,nombre,direccion,identificacion,email,telefono) VALUES "
                + "(?,?,?,?,?,?) ";

        try {

            PreparedStatement pst = con.prepareStatement(squery);

            pst.setDate(1, new java.sql.Date(cliente.getFecha().getTime()));
            pst.setString(2, cliente.getNombre());
            pst.setString(3, cliente.getDireccion());
            pst.setString(4, cliente.getIdentificacion());
            pst.setString(5, cliente.getEmail());
            pst.setString(6, cliente.getTelefono());
//            pst.setBoolean(7, cliente.isActivo());
//            pst.setDouble(8, cliente.getBalance());

            guardado = pst.execute();

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en guardar cliente");
        }

        return guardado;
    }

    //Buscar el total de registro
    public int getTotal() {
        String squery = "SELECT count(codigo) as codigo FROM cliente";
        int total = 0;

        try {
            ResultSet rs;
            rs = con.createStatement().executeQuery(squery);
            if (rs.next()) {
                total = rs.getInt("codigo");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en total cliente");
        }
        return total;
    }

    public void borrarCliente(int codigo) {
        String squery = "DELETE FROM cliente WHERE codigo=" + codigo;
        try {
            con.createStatement().executeUpdate(squery);

        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en borrarCliente");
        }
    }

    public void updateCliente(Cliente cliente) {

        String squery = "UPDATE cliente "
                + "SET nombre='" + cliente.getNombre()
                + "',direccion='" + cliente.getDireccion()
                + "',identificacion='" + cliente.getIdentificacion()
                + "',email='" + cliente.getEmail()
                + "',telefono='" + cliente.getTelefono()
                + "'WHERE codigo =" + cliente.getCodigo();

        try {
            con.createStatement().executeUpdate(squery);
        } catch (SQLException ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement en update cliente");
        }

    }

//     Prueba
//    public static void main(String[] args) {
//        ManejoCliente mCliente = new ManejoCliente();
//
//        Cliente hector = new Cliente();
//
//        hector.setFecha(new Date());
//        hector.setNombre("Test");
//        hector.setDireccion("Direccion test");
//        hector.setIdentificacion("04700010913");
//        hector.setEmail("Email test1");
//        hector.setTelefono("Telefono Test");
//        hector.setActivo(true);
//        hector.setBalance(0.0);
//        hector.setCodigo(5);
//        
//
//        System.out.println(mCliente.guardarCliente(hector));
//            mCliente.updateCliente(hector);
//        Cliente cliente1 = mCliente.getCliente(1);
//        System.out.println(cliente1);
//
//        System.out.println("=========== Lista de Clientes ===============");
//        for (Cliente cliente : mCliente.getListaClientes()) {
//            System.out.println(cliente.getFecha());
//            System.out.println(cliente.getNombre());
//            System.out.println(cliente.getDireccion());
//            System.out.println(cliente.getIdentificacion());
//            System.out.println(cliente.getEmail());
//            System.out.println(cliente.getTelefono());
//            System.out.println(cliente.isActivo());
//            System.out.println(cliente.getBalance());
//            System.out.println("===================");
//        }
//
//    }
}
