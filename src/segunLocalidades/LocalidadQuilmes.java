package segunLocalidades;

import sisFacturacion.ILlamadasNoLocales;

public class LocalidadQuilmes implements ILlamadasNoLocales{
	@Override
	public double costo(Object localidad) {
		if (localidad == Localidades.QUILMES) {
			return 0.8;
		}
		else { return 0; } 
	}
}
