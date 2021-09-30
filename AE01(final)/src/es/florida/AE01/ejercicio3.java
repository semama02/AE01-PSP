package es.florida.AE01;

public class ejercicio3 {

	//En este caso el método suma nos suma los numeros pares hasta el numero que introducimos.
	static void suma(int value) {
		int x = 0; 
		for (int i = 0; i <= value; i++) {
			if ( i % 2 == 0 ) {
				x += i;
			}
		}
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		suma(num);
	}

}
