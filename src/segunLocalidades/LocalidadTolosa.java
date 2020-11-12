package segunLocalidades;

public class LocalidadTolosa implements ILocalidad{
	@Override
	public double costo() {
		return 1.9;
	}

	@Override
	public String nombre() {
		return "Tolosa";
	}
}
