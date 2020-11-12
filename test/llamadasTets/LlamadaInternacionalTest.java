package llamadasTets;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import llamadas.LlamadaInternacional;
import segunPaises.*;

class LlamadaInternacionalTest {
	private LlamadaInternacional internacional;
	
	@Test
	void testCostoLlamadaChina() {
		internacional = new LlamadaInternacional(5,new PaisChina());
		assertEquals(internacional.costoLlamada(), 157.5);
	}
	
	@Test
	void testCostoLlamadaEEUU() {
		internacional = new LlamadaInternacional(20,new PaisEEUU());
		assertEquals(internacional.costoLlamada(), 108);
	}
	@Test
	void testCostoLlamadaEspaña() {
		internacional = new LlamadaInternacional(40,new PaisEspaña());
		assertEquals(internacional.costoLlamada(), 600);
	}
	@Test
	void testCostoLlamadaRusia() {
		internacional = new LlamadaInternacional(40,new PaisRusia());
		assertEquals(internacional.costoLlamada(), 1172);
	}
	@Test
	void testCostoLlamadaResto() {
		internacional = new LlamadaInternacional(10,new Resto());
		assertEquals(internacional.costoLlamada(), 509);
	}
}
