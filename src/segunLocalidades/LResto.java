package segunLocalidades;

public class LResto  implements ILocalidad{
	@Override
	public double costo() {
		return 2.4; 
	}

	@Override
	public String nombre() {
		return "Resto localidades";
	}
}
