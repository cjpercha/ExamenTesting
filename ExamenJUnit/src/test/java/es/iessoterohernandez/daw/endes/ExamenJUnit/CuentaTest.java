package es.iessoterohernandez.daw.endes.ExamenJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iessoterohernandez.daw.endes.ExamenJUnit.cuentas.Cuenta;
import es.iessoterohernandez.daw.endes.ExamenJUnit.cuentas.IngresoNegativoException;
import es.iessoterohernandez.daw.endes.ExamenJUnit.cuentas.SaldoInsuficienteException;

class CuentaTest {
	
	Cuenta c;
	
	@BeforeEach
	void setUp() throws Exception {
		 c = new Cuenta("123123123", "Juan");
	}
	
	@Test
	void testIngresar() throws IngresoNegativoException {
		c.ingresar("Ingreso en cajero", 50.0);
		assertEquals(50.0, c.getSaldo());
	}
	
	@Test
	void testRetirar() throws IngresoNegativoException, SaldoInsuficienteException {
		c.ingresar("Ingreso en cajero", 50.0);
		c.retirar("Retirada de cajero", 10.0);
		assertEquals(40, c.getSaldo());
	}
	

}
