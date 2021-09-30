package es.florida.AE01;

public class ejercicio6 {

	//Aqui vemos como devolvemos los numeros en orden inverso al proporcionado y también se suman.
	public static void numeros(String[] args) {
		// TODO Auto-generated method stub
		int numeros = 0;
		int x = args.length;
		for (int i = (x-1); i != -1; i--) {
			System.out.println(args[i]);
			int numero = Integer.parseInt(args[i]);
			numeros += numero;
		}
		System.out.println("");
		System.out.println(numeros);
	}
	
	public static void main(String[] args) {
		numeros(args);
	}
	
}
