package viaje;

import java.util.*;



public class Viaje {

	public static void main(String[] args) {
		
		List<Destino> ListaDestinos = new ArrayList<>();
		ListaDestinos.add(new Cancun(2,5));
		ListaDestinos.add(new Cabos(1,3));
		ListaDestinos.add(new Huatulco(5,2));
		ListaDestinos.add(new Mazunte(3,2));
	
		
		for(Destino des:ListaDestinos) {
			System.out.println(des.toString());
			System.out.println("El costo final del viaje es: "+des.costo());
			System.out.println("-----------------------------------------");
			
		}
	}

}
