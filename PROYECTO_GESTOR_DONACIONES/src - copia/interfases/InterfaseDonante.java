package interfases;

import java.util.List;

import model.Donante;

public interface InterfaseDonante {
	
	public int registrar(Donante d);
	
	public List<Donante> listado();
	
	public int actualizar(Donante d);
	

}
