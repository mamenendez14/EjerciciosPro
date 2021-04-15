package estructurasecuencial;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		Double a, b, c;
		System.out.println("Introduce a y b: ");
		a = Sc.nextDouble();
		b = Sc.nextDouble();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Devuelve "+a+" y "+b);
	}

}
