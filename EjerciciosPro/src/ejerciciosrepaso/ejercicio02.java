package ejerciciosrepaso;

import java.util.Scanner;

public class ejercicio02 {
	
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
		
		for (int i = 1; i < 1000; i++) {
			
			if (esPerfecto(i)) {
				System.out.println(i);
			}
			
		}

	}

}