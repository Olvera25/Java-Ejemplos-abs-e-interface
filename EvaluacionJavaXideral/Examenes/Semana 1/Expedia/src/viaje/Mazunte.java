package viaje;

public class Mazunte extends Destino{
	
	int ppersona = 1000;
	int pdias = 700;
	
	Mazunte(int persona, int dias) {
		super(persona,dias);
	}
	
	@Override
	int costo() {
		return (persona*ppersona) + (dias*pdias);
	}
	
	@Override
	public String toString() {
		return "Viajaran a Mazunte "+persona+" personas por " +dias+ " dias ";
	}
}
