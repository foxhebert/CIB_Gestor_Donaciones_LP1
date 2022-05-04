package interfases;

import java.util.List;

import model.Donante;

public interface IOperaciones<T> {
	
	public int registrar(Donante d);
	
	public int actualizar(Donante d);
	
	public List<Donante> listado();
		
	public Donante buscar(int codigo);


}
