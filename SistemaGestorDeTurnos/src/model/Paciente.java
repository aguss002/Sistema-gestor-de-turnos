package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {

	private String obraSocial;
	private List<Turno> turnosResevados;

	public Paciente(String nombre, String apellido, String dni, String telefono, LocalDate fechaDeNacimiento) {
		super(nombre, apellido, dni, telefono, fechaDeNacimiento);
	}

	public Paciente(String nombre, String apellido, String dni, String telefono, LocalDate fechaDeNacimiento,
			String obraSocial) {
		super(nombre, apellido, dni, telefono, fechaDeNacimiento);
		this.obraSocial = obraSocial;
		this.turnosResevados = new ArrayList<>();
	}

	public String getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}

	public List<Turno> getTurnosResevados() {
		return turnosResevados;
	}

	public void setTurnosResevados(List<Turno> turnosResevados) {
		this.turnosResevados = turnosResevados;
	}

	@Override
	public String toString() {
		return "\nNombre del paciente: " + nombre + " " + apellido + "\nObra social: " + obraSocial + "\nDNI: " + dni + "\nTurnos reservados: " + turnosResevados;
	}
	
}
