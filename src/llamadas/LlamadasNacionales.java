package llamadas;

import segunLocalidades.*;

public class LlamadasNacionales extends LlamadasNoLocales{

	public LlamadasNacionales(int duracionEnMinutos, Localidades localidad) {
		super();
		this.duracionEnMinutos = duracionEnMinutos;
		this.noLocales = localidad;
	}
	
	static {
		   mappings.put(Localidades.ABASTO, new LocalidadAbasto());
		   mappings.put(Localidades.FLORES, new LocalidadFlores());
		   mappings.put(Localidades.MORON, new LocalidadMoron());
		   mappings.put(Localidades.QUILMES, new LocalidadQuilmes());
		   mappings.put(Localidades.TOLOSA, new LocalidadTolosa());
		   mappings.put(Localidades.RESTO, new LResto());
	}

}
