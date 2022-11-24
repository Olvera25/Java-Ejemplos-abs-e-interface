package viaje;

public class Cancun extends Destino{

	int ppersona = 1000;
	int pdias = 500;
	
	Cancun(int persona, int dias) {
		super(persona,dias);
	}
	
	@Override
	int costo() {
		return (persona*ppersona) + (dias*pdias);
	}
	
	@Override
	public String toString() {
		return "Viajaran a Cancún "+persona+" personas por " +dias+ " dias ";
	}

	
}
