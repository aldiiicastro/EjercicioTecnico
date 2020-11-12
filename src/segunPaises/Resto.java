package segunPaises;

import sisFacturacion.ILlamadasNoLocales;

public class Resto implements ILlamadasNoLocales{
	@Override
	public double costo(Object pais) {
		if (pais == Paises.RESTO) {
			return 50.9;
		}
		else { return 0; } 
	}
}
