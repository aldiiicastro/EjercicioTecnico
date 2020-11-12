package llamadas;

import segunPaises.IPais;
public class LlamadaInternacional extends LlamadaNoLocal{
	
	public LlamadaInternacional(int duracionEnMinutos, IPais pais) {
		super();
		this.lugar = pais;
		this.duracionEnMinutos = duracionEnMinutos;
		noLocales.add(pais);
	}
}
