package arrays.hoja03;

import arrays.hoja01.Ejercicio9;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		int matriz[][] = new int[5][10];
		Ejercicio9.llena(matriz);
		Ejercicio9.ver(matriz);
		
		int max = matriz[0][0];
		int filamax = 0;
		int colmax = 0;
		int min = matriz[0][0];
		int filamin = 0;
		int colmin = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (max < matriz[i][j]) {
					max = matriz[i][j];
					filamax = i;
					colmax = j;
				}
				if (min > matriz[i][j]) {
					min = matriz[i][j];
					filamin = i;
					colmin = j;
				}
			}
		}
		
		System.out.println("El número máximo es "+max+" y se encuentra en la fila "+filamax+" y columna "+colmax);
		System.out.println("El número mínimo es "+min+" y se encuentra en la fila "+filamin+" y columna "+colmin);
		

	}

}
