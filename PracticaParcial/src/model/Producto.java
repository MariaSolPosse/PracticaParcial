package model;

public class Producto {
	private String NombreP; 
	private String Codigo; 
	private String Marca; 
	private int Precio; 
	private int Stock;
	
	
	
	public String getNombreP() {
		return NombreP;
	}
	public String getCodigo() {
		return Codigo;
	}
	public String getMarca() {
		return Marca;
	}
	public int getPrecio() {
		return Precio;
	}
	public int getStock() {
		return Stock;
	}
	public Producto(String nombreP, String codigo, String marca, int precio, int stock) {
		super();
		NombreP = nombreP;
		Codigo = codigo;
		Marca = marca;
		Precio = precio;
		Stock = stock;
	} 
	

}
