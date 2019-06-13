package Conexiones;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class Procedimientos {
    
    public static void EntradaUsuario(String n, String em, String u, String c )
        throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call AgregarUsuario(?,?,?,?)}");
        entrada.setString(1, n);
        entrada.setString(2, em);
        entrada.setString(3, u);
        entrada.setString(4, c);
        entrada.execute();
    }
    
    public static void BuscarUsuario(String u, String c)
        throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BuscarUsuario(?,?)}");
        entrada.setString(1, u);
        entrada.setString(2, c);
        entrada.execute();
    }
    
    /*
    ResultSet res;
    int cont;
    
    try{
        res= Conexiones.Conexion.Consulta("Select COUNT(usuario) from usuario where usuario='" + /Colocar el textfield/ +"'");
        try{
            while(res.next()){
               cont = res.getInt(1);
                }
            }catch(SQLException e){
                }
            if(cont>=1){JOptionPane.showMessageDialog(this,"este usuario ya existe","Informacion",JOptionPane.INFORMATION_MESSAGE);
            else{Procedimientos.EntradaUsuario(//poner los getText);
                 JOptionPane.showMessageDialog(this,"Los datos se han guardado correctamente");}
    catch(SQLException e){
    }
    
    */
    
}
