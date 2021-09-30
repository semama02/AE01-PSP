package es.florida.AE01;

import java.util.ArrayList;
import java.util.List;

public class ejercicio2 {

	//En este caso nos muestra por pantalla tanto los elementos de un array como los de una lista.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Nombres con Array:");
		String[] nombres = new String [6];
		nombres[0]="Enrique";
		nombres[1]="Ximo";
		nombres[2]="Pau";
		nombres[3]="Alejandro";
		nombres[4]="Oscar";
		nombres[5]="Aleix";
		
		for(int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		
		System.out.println("");
		
		System.out.println("Nombres con Lista:");
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("Enrique");
		lista.add("Ximo");
		lista.add("Pau");
		lista.add("Alejandro");
		lista.add("Oscar");
		lista.add("Aleix");
		
		for(int y = 0; y < 6; y++) {
			System.out.println(lista.get(y));
		}
	}

}
