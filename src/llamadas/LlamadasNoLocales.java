package llamadas;

import java.util.HashMap;
import java.util.Map;
import sisFacturacion.ILlamadasNoLocales;

public abstract class LlamadasNoLocales {
	protected static Map<Object, ILlamadasNoLocales> mappings = new HashMap<Object,ILlamadasNoLocales>();
	protected Object noLocales;
	protected int duracionEnMinutos;

	public double costoLlamada() {
		ILlamadasNoLocales segunPais = mappings.get(noLocales);
		double costo = segunPais.costo(noLocales);
		double total = costo * duracionEnMinutos;
		System.out.println("Su llamada no local duro: " + duracionEnMinutos + 
				" minutos, el costo era de: " + costo + " pesos" +
				". Se llamo a: " + noLocales +
				". El total de la llamada fue: " + total + " pesos");
		return total;
	}


}
