package llamadas;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.EnumSet;
import java.util.Set;

public class LlamadaLocal implements Llamada{
	private Set<DayOfWeek> weekend = EnumSet.of(DayOfWeek.SATURDAY , DayOfWeek.SUNDAY); 
	private LocalTime comienzo = LocalTime.of(8, 0,0);
	private LocalTime fin = LocalTime.of(20, 0,0);
	private LocalTime horarioDeLlamada;
	private DayOfWeek diaLlamada;
	private int duracionEnMinutos;
	private double costo = 0.20;
	
	public LlamadaLocal(LocalTime horarioDeLlamada, DayOfWeek diaLlamada, int duracionEnMinutos) {
		super();
		this.horarioDeLlamada = horarioDeLlamada;
		this.diaLlamada = diaLlamada;
		this.duracionEnMinutos = duracionEnMinutos;
	}

	public double costoLlamada() {
		if (horarioDeLlamada.isBefore(comienzo) || horarioDeLlamada.isAfter(fin) || isWeekEnd()) {
			costo = 0.10;
		}
		double total = costo * duracionEnMinutos;
		System.out.println("Su llamada local duro: " + duracionEnMinutos + 
				" minutos, el costo era de: " + costo +" pesos"+
				". El total de la llamada fue: " + total + " pesos");
		return total;
		
	}

	private boolean isWeekEnd() {
		return weekend.contains(diaLlamada);
	}
 }
