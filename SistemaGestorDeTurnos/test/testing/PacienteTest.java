package testing;

import static org.junit.Assert.*;
import java.time.LocalDate;
import org.junit.Test;
import model.Paciente;

public class PacienteTest {
	
	private static Paciente paciente = new Paciente("Lucas", "Martinez", "12345678", "12345678", LocalDate.of(2004, 06, 20));
	
	@Test
	public void verificoQueElDNICumplaConLaLongitudRequerida() {
		assertTrue(paciente.verificarLongitudDNI());
	}
	
	@Test
	public void verificaQueElDNIContengaSoloNumeros() {
		assertTrue(paciente.verificarCaracteresNumericos());
	}

}
