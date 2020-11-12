package sisFacturacion;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import org.quartz.CronTrigger;

import llamadas.*;
import segunLocalidades.Localidades;
import segunPaises.Paises;

import static org.quartz.TriggerBuilder.*;
import static org.quartz.CronScheduleBuilder.*;
	
public class Main {
	private static List<LlamadasLocales> locales = new ArrayList<LlamadasLocales>();
	private static List<LlamadasNoLocales> noLocales = new ArrayList<LlamadasNoLocales>();
	public static void main(String[] args) {
			agregarLlamadasLocales();
			agregarLlamadasNoLocales();
		 	Facturacion factura = new Facturacion(1500, LocalDate.now(), locales, noLocales);
		 	factura.imprimirFacturacion();

	 }
	private static void agregarLlamadasNoLocales() {
		LlamadasNacionales nacional1 = new LlamadasNacionales(15, Localidades.QUILMES);
		LlamadasNacionales nacional2 = new LlamadasNacionales(5, Localidades.RESTO);
		LlamadasInternacionales internacional1 = new LlamadasInternacionales(40, Paises.RUSIA);
		LlamadasInternacionales internacional2 = new LlamadasInternacionales(15, Paises.RESTO);
		noLocales.add(nacional1);;
		noLocales.add(nacional2);
		noLocales.add(internacional1);
		noLocales.add(internacional2);
	}
	private static void agregarLlamadasLocales() {
		 LlamadasLocales llamada1 = new LlamadasLocales(LocalTime.of(21, 0,0), DayOfWeek.FRIDAY, 30);
		 LlamadasLocales llamada2 = new LlamadasLocales(LocalTime.of(15, 0,0), DayOfWeek.TUESDAY, 10);
		 LlamadasLocales llamada3 = new LlamadasLocales(LocalTime.of(10, 0,0), DayOfWeek.SUNDAY, 60);
		 locales.add(llamada1);
		 locales.add(llamada2);
		 locales.add(llamada3);
	}
	
	private void mensualmente() {
		//Mensualmente el ultimo dia del mes, a las 23-59
		CronTrigger trigger = newTrigger()
		    .withIdentity("trigger3", "group1")
		    .withSchedule(cronSchedule("0 59 23 L * ?"))
		    .forJob("myJob", "group1")
		    .build();
	}
}
