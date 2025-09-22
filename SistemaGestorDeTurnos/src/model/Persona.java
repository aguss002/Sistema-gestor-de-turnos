package model;

import java.time.LocalDate;
import java.util.Iterator;

public abstract class Persona {
	
	protected String nombre;
	protected String apellido;
	protected final String DNI;
	protected String telefono;
	protected LocalDate fechaDeNacimiento;
	
	
	public Persona(String nombre, String apellido, String DNI, String telefono, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNI = DNI;
		this.telefono = telefono;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public Boolean verificarCaracteresNumericos() {
		Boolean verifica = true;
		for (char caracter : this.DNI.toCharArray()) {
			if(!Character.isDigit(caracter))
				verifica = false;
		}
		return verifica;
	}
	
	public Boolean verificarLongitudDNI() {
		return this.DNI.length() == 8;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getDNI() {
		return DNI;
	}
}
