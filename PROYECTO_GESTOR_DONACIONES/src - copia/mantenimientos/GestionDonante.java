package mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import interfases.InterfaseDonante;
import model.Donante;
import model.Usuario;
import utils.MySQLConexion;

public class GestionDonante implements InterfaseDonante  {

	@Override
	public int registrar(Donante d) {
		// TODO Auto-generated method stub
		
			int resultado=0;
			Connection con=null;
			PreparedStatement pst=null;
			try {
				con = MySQLConexion.getConexion();
				
				//ACTUALIZAR String sql="UPDATE producto SET nombre=?,stock=?,precio=?,id_categoria=? WHERE id_producto=?";
				//String sql="insert into tb_usuarios values (null,?,?,?,?,?,default,default)";
				String sql="insert into Donante values (null,?,?,?,null,default,?,?,?)";
				pst=con.prepareStatement(sql);
				pst.setString(1, d.getNomRepresenante());
				pst.setString(2, d.getApeRepresenante());
				pst.setString(3, d.getCargoRepresenante());
				pst.setString(4, d.getFechaRegistro());
				pst.setString(5, d.getDireccion());
				pst.setString(6, d.getTelefono());
				
				

				
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
	public List<Donante> listado() {
		// TODO Auto-generated method stub
    List<Donante> lstUsuario=new ArrayList<Donante>();
		
		ResultSet resul=null;
		Connection con=null;
		PreparedStatement pst=null;
		try {
			con = MySQLConexion.getConexion();
			
			String sql="SELECT * FROM Donante";
			pst=con.prepareStatement(sql);
			resul=pst.executeQuery();
			while(resul.next()) {
				Donante u=new Donante();
				u.setRazonSocial(resul.getString("razonSocial")); // en vez codigo poner 1 para ejemplo;
				u.setNomRepresenante(resul.getString("nomRepresenante"));
				u.setApeRepresenante(resul.getString("apeRepresenante"));
				u.setCargoRepresenante(resul.getString("cargoRepresenante"));
				u.setFechaRegistro(resul.getString("fechaRegistro"));
				u.setDireccion(resul.getString("direccion"));
				u.setTelefono(resul.getString("telefono"));
				
				
				/*****************TABLA DONANTE***************
				1-- codigo  int auto_increment,
				2 razonSocial varchar(25),
				3 nomRepresenante varchar(15),
				4 apeRepresenante varchar(15),
				5 cargoRepresenante varchar(15),
				6-- tipoDonante    int DEFAULT 2,
				7 fechaRegistro date  null,
				8 direccion varchar(25),
				9 telefono varchar(9),
				primary key (codigo)*************************/
				
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
	public int actualizar(Donante d) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
