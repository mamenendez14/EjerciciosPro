package arrays.hoja02;

import java.util.Scanner;

public class Ejercicio3 {

	static void buscar(int[] v, int num) {
		boolean find = false;
		int posicion = 0;
		int i = 0;
		while (!find && i < v.length) {
			if (num == v[i]) {
				find = true;
				posicion = i;
			}
			i++;
		}
		if (find) {
			System.out.println("El número que buscas se encuentra en la posición "+posicion);
		}
		else {
			System.out.println("El número no ha sido encontrado.");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vector[] = new int [30];
		arrays.hoja01.Ejercicio9.llena(vector);
		
		System.out.println("Introduce el  número que deseas buscar: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		
		System.out.println("");
		buscar(vector, num);
		
		sc.close();

	}

}
