package es.iessoterohernandez.daw.endes.ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PilaTest {
	private Pila p;
	
	@BeforeEach
	public void setUp() {
		p = new Pila();
	}
	
	@Test
	public void pushTest() {
		p.push(5);
		assertFalse(p.isEmpty());
		assertEquals(5, p.top());
		
		var p2 = new Pila();
		p2.push(2);
		assertTrue(p2.isEmpty());
		
		var p3 = new Pila();
		p3.push(20);
		assertTrue(p3.isEmpty());
	}
	
	@Test
	public void topTest() {
		assertNull(p.top());
		
		p.push(5);
		assertEquals(5, p.top());
		
		p.pop();
		assertNull(p.top());
	}
}