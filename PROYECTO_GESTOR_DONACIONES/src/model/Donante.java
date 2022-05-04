package model;



public class Donante {
	
	private int     codigo, 
	                tipo;
	
    private String  razonSocial, 
                    nomRepresenante, 
                    apeRepresenante,
                    cargoRepresenante,
                    fechaRegistro ,
                    direccion,
                    telefono;
	
	
	/*
	1 codigo  int auto_increment,
	1 razonSocial varchar(25),
	2 nomRepresenante varchar(15),
	3 apeRepresenante varchar(15),
	4 cargoRepresenante varchar(15),
	5 tipoDonante    int DEFAULT 2,
	6 fechaRegistro date  null,
	7 direccion varchar(25),
	8 telefono varchar(9),
	primary key (codigo)*/
	
	/*
	 * private int    codigo, tipo, estado;
	 * private String dni, nombre, apellido, cargo, fechaIngreso, clave;*/
	
	public String getCargoRepresenante() {
		return cargoRepresenante;
	}
	public void setCargoRepresenante(String cargoRepresenante) {
		this.cargoRepresenante = cargoRepresenante;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getNomRepresenante() {
		return nomRepresenante;
	}
	public void setNomRepresenante(String nomRepresenante) {
		this.nomRepresenante = nomRepresenante;
	}
	public String getApeRepresenante() {
		return apeRepresenante;
	}
	public void setApeRepresenante(String apeRepresenante) {
		this.apeRepresenante = apeRepresenante;
	}
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	

}
