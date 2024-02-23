package es.iessoterohernandez.daw.endes.ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubscripcionTest {
	private Subscripcion s;
	
	@BeforeEach
	public void setUp() {
		s = new Subscripcion(120, 12);
	}
	
	@Test
	public void precioPorMesTest() {
		assertEquals(10, s.precioPorMes());
		
		var s2 = new Subscripcion(0, 12);
		assertEquals(0, s2.precioPorMes());
		
		var s3 = new Subscripcion(120, 0);
		assertEquals(0, s3.precioPorMes());
		
		var s4 = new Subscripcion(0, 0);
		assertEquals(0, s4.precioPorMes());
	}
}
