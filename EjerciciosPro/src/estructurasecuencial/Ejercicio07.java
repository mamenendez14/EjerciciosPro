package estructurasecuencial;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		Double area, altura, base;
		System.out.println("Introduce la base del tri�ngulo:");
		base = Sc.nextDouble();
		System.out.println("Introduce la altura del tri�ngulo:");
		altura = Sc.nextDouble();
		
		area = altura*base/2;
		
		System.out.println("El �rea del tri�ngulo es "+area);
	}

}
