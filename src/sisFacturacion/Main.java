package sisFacturacion;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import llamadas.*;
import segunLocalidades.*;
import segunPaises.*;

	
public class Main {
	private static List<Llamada> llamada = new ArrayList<Llamada>();
	public static void main(String[] args) {
			agregarLlamadasLocales();
			agregarLlamadasNoLocales();
		 	Facturacion factura = new Facturacion(1500, LocalDate.now(), llamada);
		 	factura.imprimirFacturacion();

	 }
	private static void agregarLlamadasNoLocales() {
		LlamadaNacional nacional1 = new LlamadaNacional(15, new LocalidadQuilmes());
		LlamadaNacional nacional2 = new LlamadaNacional(5, new LResto());
		LlamadaInternacional internacional1 = new LlamadaInternacional(40, new PaisRusia());
		LlamadaInternacional internacional2 = new LlamadaInternacional(15, new Resto());
		llamada.add(nacional1);;
		llamada.add(nacional2);
		llamada.add(internacional1);
		llamada.add(internacional2);
	}
	private static void agregarLlamadasLocales() {
		 LlamadaLocal llamada1 = new LlamadaLocal(LocalTime.of(21, 0,0), DayOfWeek.FRIDAY, 30);
		 LlamadaLocal llamada2 = new LlamadaLocal(LocalTime.of(15, 0,0), DayOfWeek.TUESDAY, 10);
		 LlamadaLocal llamada3 = new LlamadaLocal(LocalTime.of(10, 0,0), DayOfWeek.SUNDAY, 60);
		 llamada.add(llamada1);
		 llamada.add(llamada2);
		 llamada.add(llamada3);
	}
}
