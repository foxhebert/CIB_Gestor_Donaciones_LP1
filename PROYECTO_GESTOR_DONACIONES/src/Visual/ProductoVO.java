package Visual;

public class ProductoVO {

/*Todo los atributos*/
    int idproducto;
    String nombre;
    double cantidad;
    String marca;
    private byte[] foto;

public ProductoVO(){}

/*Todo los codigos get*/
    public int getIdproducto(){
        return idproducto;
    }
    public String getNombre(){
        return nombre;
    }
    public double getCantidad(){
        return cantidad;
    }
    public String getMarca(){
        return marca;
    }


/*Todo los codigos set*/
    public void setIdproducto(int idproducto){
        this.idproducto = idproducto;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    /**
     * @return the foto
     */
    public byte[] getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

}
