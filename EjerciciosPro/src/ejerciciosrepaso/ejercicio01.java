package ejerciciosrepaso;

import java.util.Scanner;

public class ejercicio01 {
	
	static boolean esPerfecto(int num) {
		boolean perfecto = false;
		int acumulador = 0;
		for (int i = 1; i < num; i++) {
			if (num%i==0) {
				acumulador=acumulador + i;
			}
			
		}
		if (acumulador==num) {
			perfecto=true;
		}
		return perfecto;
	}

	public static void main(String[] args) {
		
		int num;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número:");
		num = sc.nextInt();
	    } while (num<=0);
		
			
			
			if (esPerfecto(num)==true) {
				System.out.println("El número introducido es un número perfecto.");
			}
			else {
				System.out.println("El número introducido no es perfecto.");
			}
			
		

	}

}
