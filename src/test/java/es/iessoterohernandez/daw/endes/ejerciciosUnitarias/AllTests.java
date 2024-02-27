package es.iessoterohernandez.daw.endes.ejerciciosUnitarias;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AccountPreciseTest.class, AccountTest.class, BoaTest.class, FridgeTest.class,
		OperadorAritmeticoTest.class, PilaTest.class, SubscripcionTest.class })
public class AllTests {

}
