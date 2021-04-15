package ejerciciosrepaso;

import java.util.Scanner;

public class ejercicio06 {
	
	static int aleatorio() {
		int n=(int)(Math.random()*100)+1;
		return n;
	}

	public static void main(String[] args) {
		int random = aleatorio();
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Adivina el número aleatorio:");
			num = sc.nextInt();
			if (num>random) {
				System.out.println("Ups! El número que buscamos es más pequeño.");
				System.out.println("");
			}
			else {
				System.out.println("Deberias probar con un número más alto.");
				System.out.println("");
			}
		} while (num!=random);
		
		System.out.println("Enhorabuena! Has acertado el número.");

	}

}
