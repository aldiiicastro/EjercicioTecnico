package llamadas;

import segunPaises.*;

public class LlamadasInternacionales extends LlamadasNoLocales{
	
	public LlamadasInternacionales(int duracionEnMinutos, Paises pais) {
		super();
		this.duracionEnMinutos = duracionEnMinutos;
		this.noLocales = pais;
	}
	
	static {
		   mappings.put(Paises.ESPAÑA, new PaisEspaña());
		   mappings.put(Paises.EEUU, new PaisEEUU());
		   mappings.put(Paises.CHINA, new PaisChina());
		   mappings.put(Paises.RUSIA, new PaisRusia());
		   mappings.put(Paises.RESTO, new Resto());
	}
}
