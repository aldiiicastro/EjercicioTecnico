package segunLocalidades;

import sisFacturacion.ILlamadasNoLocales;

public class LResto  implements ILlamadasNoLocales{
	@Override
	public double costo(Object localidad) {
		if (localidad == Localidades.RESTO) {
			return 2.4;
		}
		else { return 0; } 
	}
}
