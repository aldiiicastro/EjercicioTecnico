package segunPaises;

import sisFacturacion.ILlamadasNoLocales;

public class PaisRusia implements ILlamadasNoLocales{
	@Override
	public double costo(Object pais) {
		if (pais == Paises.RUSIA) {
			return 29.3;
		}
		else { return 0; } 
	}
}
