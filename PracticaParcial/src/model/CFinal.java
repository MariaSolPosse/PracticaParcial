package model;

import java.sql.Date;

public class CFinal extends Cliente {

	public CFinal(String nombre, String apellido, Date fecha, int telefono, int dni) {
		super(nombre, apellido, fecha, telefono, dni);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "CFinal [getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getFecha()=" + getFecha()
				+ ", getTelefono()=" + getTelefono() + ", getDni()=" + getDni() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
