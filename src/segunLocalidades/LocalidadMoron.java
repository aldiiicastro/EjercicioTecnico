package segunLocalidades;

import sisFacturacion.ILlamadasNoLocales;

public class LocalidadMoron implements ILlamadasNoLocales{
	@Override
	public double costo(Object localidad) {
		if (localidad == Localidades.MORON) {
			return 1.5;
		}
		else { return 0; } 
	}
}
