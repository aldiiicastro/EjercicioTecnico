package llamadas;

import java.util.ArrayList;
import java.util.List;
import sisFacturacion.ILlamadasNoLocales;

public abstract class LlamadaNoLocal implements Llamada {
	protected static List<ILlamadasNoLocales> noLocales = new ArrayList<ILlamadasNoLocales>();
	protected ILlamadasNoLocales lugar;
	protected int duracionEnMinutos;

	public double costoLlamada() {
	//	ILlamadasNoLocales segunPais = aDondeLlamo(nombre);
		double costo = lugar.costo();
		double total = costo * duracionEnMinutos;
		System.out.println("Su llamada no local duro: " + duracionEnMinutos + 
				" minutos, el costo era de: " + costo + " pesos" +
				". Se llamo a: " + lugar.nombre() +
				". El total de la llamada fue: " + total + " pesos");
		return total;
	}
}
