package es.iessoterohernandez.daw.endes.ExamenJUnit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SelectClasses({MovimientoTest.class, CuentaTest.class})
public class AllTests {

}
