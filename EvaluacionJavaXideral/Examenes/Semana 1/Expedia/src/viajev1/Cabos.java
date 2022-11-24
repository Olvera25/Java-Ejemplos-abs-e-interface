package viajev1;

public class Cabos implements Destino{

	
	int persona, dias;
	int ppersona = 1000;
	int pdias = 500;
	
	Cabos(int persona, int dias){
		this.persona = persona;
		this.dias = dias;
	}
	
	@Override
	public int costo() {
		return (persona*ppersona) + (dias*pdias);
	}
	
	@Override
	public String toString() {
		return "Viajaran a Cancún "+persona+" personas por " +dias+ " dias ";
	}

}
