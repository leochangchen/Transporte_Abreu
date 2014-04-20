package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Leo-PC:U83U06 Transporte_Abreu Hecho por : Enriquillo, Erick Abreu,
 * Chang I-hua Fecha : 2013-Primer semestre
 */
public class BdConection {

    private static Connection conexion;
    private static BdConection bdConexion;

    //Constructor BdConection para conectarse a la base de dato
    public BdConection() {
        try {

            final String CONTROLADOR = "com.mysql.jdbc.Driver";
            Class.forName(CONTROLADOR);

            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/transporte?user=root&password=Leochangchen2013");
        } catch (ClassNotFoundException ex1) {
            ex1.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null, "Error Carga Driver");
            System.exit(1);
        } catch (SQLException ex) {
            ex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null, "Error Creacion Statement");
            System.exit(1);
        }
    }

    public static BdConection getBdConection() {

        if (bdConexion == null) {
            bdConexion = new BdConection();
        }
        return bdConexion;
    }

    public Connection getConexion() {
        return conexion;
    }
}
