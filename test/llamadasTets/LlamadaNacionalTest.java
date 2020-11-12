package llamadasTets;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import llamadas.LlamadaNacional;
import segunLocalidades.*;

class LlamadaNacionalTest {
	private LlamadaNacional nacional;
	
	@Test
	void testCostoLlamadaAbasto() {
		nacional = new LlamadaNacional(40,new LocalidadAbasto());
		assertEquals(nacional.costoLlamada(), 64);
	}
	
	@Test
	void testCostoLlamadaFlores() {
		nacional = new LlamadaNacional(20,new LocalidadFlores());
		assertEquals(nacional.costoLlamada(), 24);
	}
	@Test
	void testCostoLlamadaMoron() {
		nacional = new LlamadaNacional(80,new LocalidadMoron());
		assertEquals(nacional.costoLlamada(), 120);
	}
	@Test
	void testCostoLlamadaQuilmes() {
		nacional = new LlamadaNacional(65,new LocalidadQuilmes());
		assertEquals(nacional.costoLlamada(), 52);
	}
	@Test
	void testCostoLlamadaTolosa() {
		nacional = new LlamadaNacional(15,new LocalidadTolosa());
		assertEquals(nacional.costoLlamada(), 28.5);
	}
	@Test
	void testCostoLlamadaResto() {
		nacional = new LlamadaNacional(10,new LResto());
		assertEquals(nacional.costoLlamada(), 24);
	}

}
