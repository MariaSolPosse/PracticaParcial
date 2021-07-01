package model;

import java.sql.Date;

public class Empresa extends Cliente {
  private int cuil; 
  private String Condicion;
  

public Empresa(String nombre, String apellido, Date fecha, int telefono, int dni, int cuil, String condicion) {
	super(nombre, apellido, fecha, telefono, dni);
	this.cuil = cuil;
	Condicion = condicion;
}


@Override
public String toString() {
	return super.toString()+"Empresa [cuil=" + cuil + ", Condicion=" + Condicion + "]";
} 
  
}