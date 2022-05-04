package utils;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Heber
 */
public class Conexion_integrantes {
    static Connection conexion=null;
    static Statement sentencia;
    static ResultSet resultado;
    public static void conectar(){
        //String ruta="jdbc:mysql://localhost/bd_registrar_persona_combo";
        String ruta="jdbc:mysql://localhost/mensajeros_jue_04";
        
        
        String user="root";
        String pass="mysql";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection(ruta,user,pass); 
            sentencia= conexion.createStatement();
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("No conectado");
        }
    }
    
    
    
    public static ArrayList<String> llenar_combo(){
        ArrayList<String> lista = new ArrayList<String>();
        String q = "SELECT * FROM usuario";
        try {
            resultado = sentencia.executeQuery(q);
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(resultado.next()){
                lista.add(resultado.getString("Nombre")+ " " +resultado.getString("Apellido"));//Apellido o Nombre
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
