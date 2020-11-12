package segunLocalidades;

import sisFacturacion.ILlamadasNoLocales;

public class LocalidadAbasto implements ILlamadasNoLocales{
	@Override
	public double costo(Object localidad) {
		if (localidad == Localidades.ABASTO) {
			return 1.6;
		}
		else { return 0; } 
	}
}
