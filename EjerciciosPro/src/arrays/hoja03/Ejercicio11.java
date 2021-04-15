package arrays.hoja03;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = new int[6][7];
		arrays.hoja01.Ejercicio9.llena(matriz);
		arrays.hoja01.Ejercicio9.ver(matriz);
		
		boolean find = false;
		int fila = 0;
		int columna = 0;
		
		System.out.println("Introduce el número que deseas buscar: ");
		int numBuscado = sc.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (numBuscado == matriz[i][j]) {
					find = true;
					fila = i+1;
					columna = j+1;
				}
			}
		}
		if (find) {
			System.out.println("El número se encuentra en la fila "+fila+" y en la columna "+columna);
		}
		else {
			System.out.println("El número no ha sido encontrado.");
		}
		
		sc.close();

	}

}
