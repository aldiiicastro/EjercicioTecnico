package llamadas;

import segunLocalidades.ILocalidad;
public class LlamadaNacional extends LlamadaNoLocal{

	public LlamadaNacional(int duracionEnMinutos, ILocalidad localidad) {
		super();
		this.lugar = localidad;
		this.duracionEnMinutos = duracionEnMinutos;
		noLocales.add(localidad);
	}
}
