package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import model.Paciente;

class PacienteTest {

	Paciente paciente = new Paciente("Martin", "Garcia", "12345678", "12347567", LocalDate.of(2001, 6, 15));

	@Test
	void testTelefonoInvalido() {
		assertThrows(IllegalArgumentException.class, () -> paciente.setTelefono("123w456"));
	}

	@Test
	void testTelefonoValido() {
		assertDoesNotThrow(() -> paciente.setTelefono("123456789"));
	}

}
