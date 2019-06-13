package Conexiones;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class Conexion {
    static Connection contacto = null;
    
    public static Connection getConexion(){
        String url = "jdbc:sqlserver://localhost:1433;databaseName=proyecto";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"No se pudo establecer la conexion. . . revisar el driver " + e.getMessage(),
                    "Error de conexion",JOptionPane.ERROR_MESSAGE);
        }
        
        try{
            contacto = DriverManager.getConnection(url,"sa","123");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error" + e.getMessage(),
                    "Error de conexion",JOptionPane.ERROR_MESSAGE);
        }
        
        return contacto;
    }
    
    public static ResultSet Consulta(String consulta){
        Connection con = getConexion();
        Statement declara;
        try{
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error" + e.getMessage(),
                    "Error de conexion",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
