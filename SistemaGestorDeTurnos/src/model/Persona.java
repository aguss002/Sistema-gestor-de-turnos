package model;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Persona {
	protected String nombre;
	protected String apellido;
	protected final String dni;
	protected String telefono;
	protected LocalDate fechaDeNacimiento;

	public Persona(String nombre, String apellido, String dni, String telefono, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		validarTelefono(telefono);
		this.fechaDeNacimiento = fechaDeNacimiento;
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

	public String getDni() {
		return dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		validarTelefono(telefono);
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	@Override
	public String toString() {
		return "\nNombre completo: " + nombre + " " + apellido + "\nDNI: " + dni + "\nTelefono: " + telefono
				+ "\nFecha de nacimiento: " + fechaDeNacimiento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}

	private void validarTelefono(String telefono) {
		for (char caracter : telefono.toCharArray())
			if (!Character.isDigit(caracter))
				throw new IllegalArgumentException("Error: no se admiten caracteres no numericos");
		this.telefono = telefono;
	}

}
