package utils;

import java.sql.*;

public class ConectarImagenes{

    static String bd = "mensajeros_jue_04";
    static String login = "root";
    static String password = "mysql";
    static String url = "jdbc:mysql://localhost/"+bd;
    Connection connection = null;

    public ConectarImagenes(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url,login,password);
        if (connection!=null){
            System.out.println("Conexión a base de datos "+bd+" OK\n");
        }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection(){
        return connection;
    }

    public void desconectar(){
        try{
            System.out.println("Cerrando conexion");
            connection.close();
        }catch(Exception ex){}
    }


}
