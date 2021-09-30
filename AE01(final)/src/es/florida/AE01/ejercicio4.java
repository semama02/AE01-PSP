package es.florida.AE01;

public class ejercicio4 {

	//En este caso el método es el encargado de calcular el resultado del factorial de un número.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero = Integer.parseInt(args[0]);
		double factorial = 1;
		while (numero != 0) {
			factorial=factorial*numero;
			numero--;
		}
		System.out.println(factorial);
	}

}
