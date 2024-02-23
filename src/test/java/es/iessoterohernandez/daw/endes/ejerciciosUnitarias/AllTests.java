package es.iessoterohernandez.daw.endes.ejerciciosUnitarias;

import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ BoaTest.class, FridgeTest.class, OperadorAritmeticoTest.class, PilaTest.class,
		SubscripcionTest.class })
public class AllTests {
}