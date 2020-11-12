package segunPaises;

import sisFacturacion.ILlamadasNoLocales;

public class PaisEspaña implements ILlamadasNoLocales{

	@Override
	public double costo(Object pais) {
		if (pais == Paises.ESPAÑA) {
			return 15.0;
		}
		else { return 0; } 
	}
	
}
