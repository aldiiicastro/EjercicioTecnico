package llamadasTets;

import static org.junit.jupiter.api.Assertions.*;

import java.time.DayOfWeek;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

import llamadas.LlamadaLocal;

class LlamadaLocalTest {
	private LlamadaLocal local;
	@Test
	void testDiaDeSemanaEnHorario() {
		local = new LlamadaLocal(LocalTime.of(15, 30, 0), DayOfWeek.MONDAY, 30);
		assertEquals(6, local.costoLlamada());
	}
	
	@Test
	void testDiaDeSemanaNoEnHorario() {
		local = new LlamadaLocal(LocalTime.of(22, 05, 0), DayOfWeek.WEDNESDAY, 120);
		assertEquals(12, local.costoLlamada());
	}
	@Test
	void testFinDeSemana() {
		local = new LlamadaLocal(LocalTime.of(10, 18, 0), DayOfWeek.SATURDAY, 40);
		assertEquals(4, local.costoLlamada());
	}

}
