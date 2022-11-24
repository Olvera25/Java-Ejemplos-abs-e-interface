package viaje;

public class Huatulco extends Destino{

	int ppersona = 800;
	int pdias = 500;
	
	Huatulco(int persona, int dias) {
		super(persona,dias);
	}
	
	@Override
	int costo() {
		return (persona*ppersona) + (dias*pdias);
	}
	
	@Override
	public String toString() {
		return "Viajaran a Huatulco "+persona+" personas por " +dias+ " dias ";
	}
}
