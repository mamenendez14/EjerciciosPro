package estructurasecuencial;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		Double area, altura, base;
		System.out.println("Introduce la base del triángulo:");
		base = Sc.nextDouble();
		System.out.println("Introduce la altura del triángulo:");
		altura = Sc.nextDouble();
		
		area = altura*base/2;
		
		System.out.println("El área del triángulo es "+area);
	}

}
