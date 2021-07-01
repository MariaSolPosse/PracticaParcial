package model;

import java.sql.Date;

public abstract class Cliente {
   private String Nombre; 
   private String Apellido; 
   private Date Fecha; 
   private int Telefono; 
   private int Dni;
public Cliente(String nombre, String apellido, Date fecha, int telefono, int dni) {
	super();
	Nombre = nombre;
	Apellido = apellido;
	Fecha = fecha;
	Telefono = telefono;
	Dni = dni;
}

public String getNombre() {
	return Nombre;
}
public String getApellido() {
	return Apellido;
}
public Date getFecha() {
	return Fecha;
}
public int getTelefono() {
	return Telefono;
}
public int getDni() {
	return Dni;
}
@Override
public String toString() {
	return "Cliente [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Fecha=" + Fecha + ", Telefono=" + Telefono
			+ ", Dni=" + Dni + "]";
} 
   
}
