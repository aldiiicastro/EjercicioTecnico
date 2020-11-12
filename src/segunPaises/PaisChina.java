package segunPaises;

import sisFacturacion.ILlamadasNoLocales;

public class PaisChina implements ILlamadasNoLocales{
	@Override
	public double costo(Object pais) {
		if (pais == Paises.CHINA) {
			return 31.5;
		}
		else { return 0; } 
	}
}
