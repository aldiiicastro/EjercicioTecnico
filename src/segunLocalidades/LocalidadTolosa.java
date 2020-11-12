package segunLocalidades;

import sisFacturacion.ILlamadasNoLocales;

public class LocalidadTolosa implements ILlamadasNoLocales{
	@Override
	public double costo(Object localidad) {
		if (localidad == Localidades.TOLOSA) {
			return 1.9;
		}
		else { return 0; } 
	}
}
