package segunLocalidades;

import sisFacturacion.ILlamadasNoLocales;

public class LocalidadFlores  implements ILlamadasNoLocales{
	@Override
	public double costo(Object localidad) {
		if (localidad == Localidades.FLORES) {
			return 1.2;
		}
		else { return 0; } 
	}
}
