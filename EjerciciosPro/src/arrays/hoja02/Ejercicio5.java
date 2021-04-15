package arrays.hoja02;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int vector[] = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println("Introduce la posicion que desea eliminar: ");
		int pos = sc.nextInt();
		
		for (int i = pos; i < vector.length-1; i++) {
			vector[i] = vector[i+1];
		}
		vector[vector.length-1] = 0;
		
		for (int i = 0; i < vector.length-1; i++) {
			System.out.print(vector[i]+" ");
		}
		
		sc.close();

	}

}
