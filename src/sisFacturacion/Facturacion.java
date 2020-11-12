package sisFacturacion;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import llamadas.LlamadasLocales;
import llamadas.LlamadasNoLocales;

public class Facturacion {
	private int abonoBasico;
	private Month mesFacturado;
	private List<LlamadasLocales> locales = new ArrayList<LlamadasLocales>();
	private List<LlamadasNoLocales> noLocales = new ArrayList<LlamadasNoLocales>();
	
	public Facturacion(int abonoBasico, LocalDate mesFacturado, List<LlamadasLocales> locales,
			List<LlamadasNoLocales> noLocales) {
		super();
		this.abonoBasico = abonoBasico;
		this.mesFacturado = mesFacturado.getMonth();
		this.locales = locales;
		this.noLocales = noLocales;
	}
	
	public void imprimirFacturacion() {
		System.out.println("Su abono mensual basico es de: " + abonoBasico);
		double gastoLocal = calcularGastoLocal();
		double gastoNoLocal = calcularNoGastoLocal();
		double totalFactura = gastoLocal + gastoNoLocal + abonoBasico;
		System.out.println("Su gasto total en llamados locales es: " +  gastoLocal + " pesos" + ".\n" +
				"Su gasto total de llamadas no locales es: " + gastoNoLocal + " pesos" + ".\n" + 
				"Se Facturo el mes: " + mesFacturado + ".\n" + 
				"El total de la facutra es de: " + totalFactura + " pesos");
	}

	private double calcularGastoLocal() {
		int total = 0;
		for (LlamadasLocales llamada : locales) {
			total += llamada.costoLlamada();
		}
		return total;
	}

	private double calcularNoGastoLocal() {
		int total = 0;
		for (LlamadasNoLocales llamada : noLocales) {
			total += llamada.costoLlamada();
		}
		return total;
	}
}
