package ejerciciosrepaso;

import java.util.Scanner;

public class ejercicio03 {
	
	static void lado(int lado) {
		for (int i = 1; i <=lado; i++) {
			System.out.printf("*");
		}
	}

	public static void main(String[] args) {
		
		Scanner tecla = new Scanner(System.in);
		System.out.println("Introduce los lados que debe tener el cuadrado:\n");
		int n = tecla.nextInt();
		System.out.println("");
		
		for (int i = 1; i <= n; i++) {
			
			lado(n);
			System.out.println("");
			
		}
		

	}

}
