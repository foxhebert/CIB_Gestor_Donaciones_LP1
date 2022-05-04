
package utils;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionExcel {
    
    private final String base = "mensajeros_jue_04";
    private final String user = "root";
    //private final String password = "1234";
    private final String password = "mysql";
    private final String url = "jdbc:mysql://localhost/" + base;
    private Connection con = null;
    
    public Connection getConexion()
    {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;  
    }

}
