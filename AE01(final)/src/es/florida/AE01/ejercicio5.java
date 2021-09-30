package es.florida.AE01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ejercicio5 {

	//En este caso lo que hacemos es crear una lista y ir añadiendo los números, y al acabar mostrar por pantalla el mayor.
	static void array(String[] args) {
		List listA = new ArrayList();
		for (int i = 0; i<args.length;i++) {
			int numero = Integer.parseInt(args[i]);
			listA.add(numero);
		}
		System.out.println(Collections.max(listA));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array(args);
	}

}
