package interfases;

import java.util.List;

import model.Usuario;

public interface InterfaseUsuario {
	
	public int registrar(Usuario u);
	
	public List<Usuario> listado();
	
	public int actualizar(Usuario u);

}
