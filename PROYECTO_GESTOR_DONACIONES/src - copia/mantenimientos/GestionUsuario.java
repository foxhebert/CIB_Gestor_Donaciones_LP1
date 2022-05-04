package mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import interfases.InterfaseUsuario;
import model.Usuario;
import utils.MySQLConexion;

public class GestionUsuario implements InterfaseUsuario {

	@Override
	public int registrar(Usuario u) {
		int resultado=0;
		Connection con=null;
		PreparedStatement pst=null;
		try {
			con = MySQLConexion.getConexion();
			
			//ACTUALIZAR String sql="UPDATE producto SET nombre=?,stock=?,precio=?,id_categoria=? WHERE id_producto=?";
			//String sql="insert into usuario values (?,?,?,?,?,?)";
			String sql="call registrar (?,?,?,?,?,?)";
			pst=con.prepareStatement(sql);
			pst.setString(1, u.getDni());
			pst.setString(2, u.getNombre());
			pst.setString(3, u.getApellido());
			pst.setString(4, u.getCargo());
			pst.setString(5, u.getFechaIngreso());
			pst.setString(6, u.getClave());
			
			/*pst.setDouble(3, p.getPrecio());
			pst.setInt(4, p.getStock());
			pst.setInt(5, p.getCategoria());*/
			
			resultado=pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pst!=null) pst.close();
				if (con!=null) con.close();
			} catch (Exception e) {
				System.out.println("Error al cerrar:"+e);
			}
		}
		return resultado;
	}

	@Override
	public List<Usuario> listado() {
    List<Usuario> lstUsuario=new ArrayList<Usuario>();
		
		ResultSet resul=null;
		Connection con=null;
		PreparedStatement pst=null;
		try {
			con = MySQLConexion.getConexion();
			
			String sql="SELECT * FROM usuario";
			pst=con.prepareStatement(sql);
			resul=pst.executeQuery();
			while(resul.next()) {
				Usuario u=new Usuario();
				u.setDni(resul.getString("dni")); // en vez codigo poner 1 para ejemplo;
				u.setNombre(resul.getString("nombre"));
				u.setApellido(resul.getString("apellido"));
				u.setCargo(resul.getString("cargo"));
				u.setFechaIngreso(resul.getString("fechaIngreso"));
				u.setClave(resul.getString("clave"));
				/*p.setPrecio(resul.getDouble("precio"));
				p.setStock(resul.getInt("stock"));
				p.setCategoria(resul.getInt("id_categoria"));*/
				
				lstUsuario.add(u);
			}
			System.out.println("Registros :"+lstUsuario.size());
		} catch (Exception e) {
			System.out.println("Error en la sentencia:"+e);
		}finally {
			try {
				if (pst!=null) pst.close();
				if (con!=null) con.close();
			} catch (Exception e) {
				System.out.println("Error al cerrar:"+e);
			}
		}
		return lstUsuario;
	}

	@Override
	public int actualizar(Usuario u) {
		// TODO Auto-generated method stub
		int resultado=0;
		Connection con=null;
		PreparedStatement pst=null;
		try {
			con = MySQLConexion.getConexion();
			
			//ACTUALIZAR String sql="UPDATE producto SET nombre=?,stock=?,precio=?,id_categoria=? WHERE id_producto=?";
			//String sql="insert into usuario values (?,?,?,?,?)";
			// String sql="UPDATE usuario SET nombre=?,apellido=?,cargo=?,fechaIngreso=? WHERE dni=?";
			
			String sql="CALL actualizar (?, ?, ?, ?, ?, ?)";
			pst=con.prepareStatement(sql);
			pst.setString(1, u.getDni());
			pst.setString(2, u.getNombre());
			pst.setString(3, u.getApellido());
			pst.setString(4, u.getCargo());
			pst.setString(5, u.getFechaIngreso());
			pst.setString(6, u.getClave());
			
			/*pst.setDouble(3, p.getPrecio());
			pst.setInt(4, p.getStock());
			pst.setInt(5, p.getCategoria());*/
			
			resultado=pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pst!=null) pst.close();
				if (con!=null) con.close();
			} catch (Exception e) {
				System.out.println("Error al cerrar:"+e);
			}
		}
		return resultado;
	}
	
	
}
