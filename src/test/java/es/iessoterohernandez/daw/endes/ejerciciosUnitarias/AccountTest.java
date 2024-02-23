package es.iessoterohernandez.daw.endes.ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {
	private Account a;

	@BeforeEach
	public void setUp() {
		a = new Account("Owner", 123456789, 1000);
	}

	@Test
	public void depositTest() {
		assertTrue(a.deposit(500));
		assertEquals(1500, a.getBalance());

		var a2 = new Account("Owner2", 123456789, 1000);
		assertFalse(a2.deposit(-500));
		assertEquals(1000, a2.getBalance());
	}

	@Test
	public void withDrawTest() {
		assertTrue(a.withdraw(500, 0));
		assertEquals(500, a.getBalance());

		var a2 = new Account("Owner2", 123456789, 1000);
		assertFalse(a2.withdraw(1500, 0));
		assertEquals(1000, a2.getBalance());

		var a3 = new Account("Owner3", 123456789, 1000);
		assertFalse(a3.withdraw(500, 50));
		assertEquals(450, a3.getBalance());

		var a4 = new Account("Owner4", 123456789, 1000);
		assertFalse(a4.withdraw(500, -50));
		assertEquals(1000, a4.getBalance());
	}
	
	@Test
	public void addInterestTest() {
		a.addInterest();
		assertEquals(1045, a.getBalance());
	}
	
	@Test
	public void toStringTest() {
		assertEquals("123456789\tOwner\t1.000,00 €", a.toString());
	}

}