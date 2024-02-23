package es.iessoterohernandez.daw.endes.ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BoaTest {

	public Boa boa;

	@BeforeEach
	public void setUp() {
		boa = new Boa("Boa", 10, "granola bars");
	}

	@ParameterizedTest
	@CsvSource({ "Boa1, 2, granola bars, true", "Boa2, 4, otra comida, false", "Boa3, 6, otra comida 2, false",
			"Boa4, 8, otra comida 3, false" })
	public void BoaTest(String name, int length, String favoriteFood, boolean expectedIsHealthyValue) {
		var b = new Boa(name, length, favoriteFood);
		assertEquals(expectedIsHealthyValue, b.isHealthy());
	}

	@Test
	public void isHealthyTest() {
		assertTrue(boa.isHealthy());
	}
	
	@ParameterizedTest
	@CsvSource({
		"15, true",
		"10, false"
	})
	public void fitsInCage(int cageLength, boolean expectedValue) {
		var b = new Boa("Boa", 10, "granola bars");
		assertEquals(expectedValue, b.fitsInCage(cageLength));
	}
}