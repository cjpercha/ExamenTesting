package es.iessoterohernandez.daw.endes.ExamenJUnit;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iessoterohernandez.daw.endes.ExamenJUnit.cuentas.Movimiento;

class MovimientoTest extends CoreMatchers{

	Movimiento m;
	
	@BeforeEach
	void setUp() throws Exception {
		 m = new Movimiento();
	}
	
	@Test
	void testSetImporte() {
		m.setImporte(50.0);
		assertEquals(50.0, m.getImporte());
	}
	
	@Test
	void testSetConcepto() {
		m.setConcepto("Ingreso en cajero");
		assertEquals("Ingreso en cajero", m.getConcepto());
	}
	
	@Test
	void testSetConceptoHamcrest() {
		m.setConcepto("Ingreso en cajero");
		assertThat(m.getConcepto(), is("Ingreso en cajero"));
	}

}
