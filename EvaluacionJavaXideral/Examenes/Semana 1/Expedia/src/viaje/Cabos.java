package viaje;

public class Cabos extends Destino{
	
	int ppersona = 1500;
	int pdias = 600;
	
	Cabos(int persona, int dias) {
		super(persona,dias);
	}
	
	@Override
	int costo() {
		return (persona*ppersona) + (dias*pdias);
	}
	
	@Override
	public String toString() {
		return "Viajaran a Los Cabos "+persona+" personas por " +dias+ " dias ";
	}

}
