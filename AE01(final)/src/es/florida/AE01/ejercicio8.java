package es.florida.AE01;

import java.util.Scanner;

public class ejercicio8 {

	//Iniciamos un contador y pedimos dos números al usuario, y comprobamos los números primos y no primos de entre estos dos números y sacamos el tiempo de ejecución.
	public static void intervalo(String[] args) {
		long inicioTiempo = System.nanoTime();
		// TODO Auto-generated method stub
		int numero1 = 0;
		int numero2 = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número:");
		numero1 = sc.nextInt();
		System.out.println("Dime otro número:");
		numero2 = sc.nextInt();
		
		for (int i = numero1; i < numero2+1; i++) {
			 boolean prime = true; 
			    for(int y = 2; y < i; y++) {
			        if (i % y == 0) {
			            prime = false;
			            break;
			        }
			    }
			    if (prime)
			    	System.out.println(i + ": es primo");
			    else
			    	System.out.println(i + ": no es primo");
		}
		long finTiempo = System.nanoTime();
		System.out.println("Duración: " + (finTiempo-inicioTiempo)/1e6 + "ms");
	}
	public static void main(String[] args) {
		intervalo(args);
	}

}
