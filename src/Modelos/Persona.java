package Modelos;

import java.time.LocalDate;

public class Persona {

	protected String usuario;
	protected String clave;
	protected String nombre;
	protected String apellido;
	protected String cedula;
	protected String direccion;
	protected LocalDate fechaNac;
	protected Administrador registradoPor;

	public boolean logIn() {
		// TODO - implement Persona.logIn
		throw new UnsupportedOperationException();
	}

	public boolean logOut() {
		// TODO - implement Persona.logOut
		throw new UnsupportedOperationException();
	}

}