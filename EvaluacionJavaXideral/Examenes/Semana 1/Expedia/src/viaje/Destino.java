package viaje;

public abstract class Destino {
	
	int persona;
	int dias;
	
	Destino(int persona, int dias){
		this.persona = persona;
		this.dias = dias;
	}
	
	abstract int costo();
	
}
