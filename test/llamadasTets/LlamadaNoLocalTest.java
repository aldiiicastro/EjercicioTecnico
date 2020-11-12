package llamadasTets;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import llamadas.LlamadaInternacional;
import llamadas.LlamadaNacional;
import llamadas.LlamadaNoLocal;
import segunLocalidades.*;
import segunPaises.*;

class LlamadaNoLocalTest {
	private  List<LlamadaNoLocal> noLocales = new ArrayList<LlamadaNoLocal>();
	private LlamadaNacional nacional1;
	private LlamadaNacional nacional2;
	private LlamadaInternacional internacional1;
	private LlamadaInternacional internacional2;
	@BeforeEach
	void setUp() throws Exception {
		nacional1 = new LlamadaNacional(15, new LocalidadQuilmes());
		nacional2 = new LlamadaNacional(5, new LResto());
		internacional1 = new LlamadaInternacional(40,new  PaisRusia());
		internacional2 = new LlamadaInternacional(15,new  Resto());
		noLocales.add(nacional1);;
		noLocales.add(nacional2);
		noLocales.add(internacional1);
		noLocales.add(internacional2);
	}
	@Test
	void testQuilmes() {
		assertEquals(12 ,noLocales.get(0).costoLlamada());
	}
	@Test
	void testLResto() {
		assertEquals(12 ,noLocales.get(1).costoLlamada());
	}
	@Test
	void testRusia() {
		assertEquals(1172 ,noLocales.get(2).costoLlamada());
	}
	
	@Test
	void testPResto() {
		assertEquals(763.5,noLocales.get(3).costoLlamada());
	}
}
