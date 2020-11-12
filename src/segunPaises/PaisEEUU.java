package segunPaises;

import sisFacturacion.ILlamadasNoLocales;

public class PaisEEUU implements ILlamadasNoLocales{
	@Override
	public double costo(Object pais) {
		if (pais == Paises.EEUU) {
			return 5.4;
		}
		else { return 0; } 
	}
}
