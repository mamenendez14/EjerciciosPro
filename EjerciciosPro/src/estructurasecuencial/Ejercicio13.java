package estructurasecuencial;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		Double a, b, x;
		System.out.println("Introduce a y b: ");
		a = Sc.nextDouble();
		b = Sc.nextDouble();
		
		x = -b/a;
		
		System.out.println("El resultado es x igual a "+x);
	}

}
