package es.florida.AE01;

import java.util.Scanner;

public class ejercicio7 {

	//Preguntamos al usuario el nombre y sus años de experiencia y en relación a esto le decimos el nivel y el salario.
	public static void experiencia(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime tu nombre: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        
        System.out.println("Dime tu antiguedad: ");
        int antiguedad = 0;
        antiguedad = sc.nextInt();
        
		if (antiguedad < 1) {
			System.out.println("Nivel: Desarrollador Junior L1");
			System.out.println("");
			System.out.println(nombre + " cobras: 15000-18000");
		}else if (antiguedad > 1 && antiguedad < 2) {
			System.out.println("Nivel: Desarrollador Junior L2");
			System.out.println("");
			System.out.println(nombre + " cobras: 18000-22000");
		}else if (antiguedad > 3 && antiguedad < 5) {
			System.out.println("Nivel: Desarrollador Senior L1");
			System.out.println("");
			System.out.println(nombre + " cobras: 22000-28000");
		}else if (antiguedad >= 5 && antiguedad < 8) {
			System.out.println("Nivel: Desarrollador Senior L2");
			System.out.println("");
			System.out.println(nombre + " cobras: 28000-36000");
		}else {
			System.out.println("Nivel: Analista / Arquitecto");
			System.out.println("");
			System.out.println(nombre + " cobras:  Salario a convenir en base a rol");
		}
	}

	public static void main(String[] args) {
		experiencia(args);
	}
	
}
