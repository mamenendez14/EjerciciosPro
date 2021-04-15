package ejerciciosrepaso;

import java.util.Scanner;

public class ejercicio07 {
	
	static boolean esNegativo(int num) {
		boolean negativo = false;
		if (num<0) {
			negativo = true;
		}
		
		return negativo;

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce diez números:");
		int contador = 0;
		
		for (int i = 0; i < 10; i++) {
			
			int num = sc.nextInt();
			if (esNegativo(num)==true) {
				contador++;
			}
			
		}
		
		System.out.println("Has introducido " + contador + " números negativos.");

	}

}
