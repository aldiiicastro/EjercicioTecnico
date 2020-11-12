package segunLocalidades;

public class LocalidadFlores  implements ILocalidad{
	@Override
	public double costo() {
		return 1.2;
	}

	@Override
	public String nombre() {
		return "Flores";
	}
}
