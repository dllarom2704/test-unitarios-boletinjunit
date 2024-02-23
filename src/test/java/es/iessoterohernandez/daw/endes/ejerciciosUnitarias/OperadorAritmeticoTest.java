package es.iessoterohernandez.daw.endes.ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OperadorAritmeticoTest {
	@Test
	public void sumaTest() {
		assertEquals(7, OperadorAritmetico.suma(4, 3));
		
		assertEquals(7, OperadorAritmetico.suma(-2, 9));
		
		assertEquals(0, OperadorAritmetico.suma(0, 0));
	}
	
	@Test
	public void divisionTest() {
		try {
			assertEquals(7, OperadorAritmetico.division(21, 3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
