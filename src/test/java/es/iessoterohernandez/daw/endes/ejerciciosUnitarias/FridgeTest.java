package es.iessoterohernandez.daw.endes.ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FridgeTest {
	private Fridge f;

	@BeforeEach
	public void setUp() {
		f = new Fridge();
	}

	@ParameterizedTest
	@CsvSource({ "item1", "item2", "item3" })
	public void putTest(String item) {
		assertTrue(f.put(item));
		assertTrue(f.contains(item));
	}
	
	@ParameterizedTest
	@CsvSource({ "item1", "item2", "item3" })
	public void containsTest(String item) {
		assertFalse(f.contains(item));
		f.put(item);
		assertTrue(f.contains(item));
	}
	
	@ParameterizedTest
	@CsvSource({ "item1", "item2", "item3" })
	public void takeTest(String item) {
		f.put(item);
		try {
			f.take(item);
		} catch (NoSuchItemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}