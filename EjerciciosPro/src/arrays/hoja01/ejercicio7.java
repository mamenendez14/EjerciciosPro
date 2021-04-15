package arrays.hoja01;

import java.util.Scanner;

public class ejercicio7 {
	
	public static void main(String[] args) {
	
		int x;
		int vector[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		x = sc.nextInt();
		
		if (x<10) {
		
			while(x!=-1) {
				
				vector[x] = vector[x]+1;
				
				System.out.println("Vuelve a introducir otro número: ");
				x = sc.nextInt();
				
			}
		}
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Hay "+vector[i]+ " números "+i);
		}
		
		sc.close();
	}
	

}
