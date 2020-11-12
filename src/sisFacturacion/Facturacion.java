package sisFacturacion;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import llamadas.Llamada;
public class Facturacion {
	private int abonoBasico;
	private Month mesFacturado;
	private List<Llamada> llamadas= new ArrayList<Llamada>();
	
	public Facturacion(int abonoBasico, LocalDate mesFacturado, List<Llamada> llamadas) {
		super();
		this.abonoBasico = abonoBasico;
		this.mesFacturado = mesFacturado.getMonth();
		this.llamadas = llamadas;
	}
	
	public void imprimirFacturacion() {
		System.out.println("Su abono mensual basico es de: " + abonoBasico);
		double gasto = calcularGastoLocal();
		double totalFactura = gasto + abonoBasico;
		System.out.println("Su gasto total en llamados es de: " +  gasto + " pesos" + ".\n" + 
				"Se Facturo el mes: " + mesFacturado + ".\n" + 
				"El total de la facutra es de: " + totalFactura + " pesos");
	}

	private double calcularGastoLocal() {
		int total = 0;
		for (Llamada llamada : llamadas) {
			total += llamada.costoLlamada();
		}
		return total;
	}
}
