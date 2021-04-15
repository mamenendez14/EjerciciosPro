package arrays.hoja03;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int matriz[][] = new int[5][5];
		
		arrays.hoja01.Ejercicio9.llena(matriz);
		arrays.hoja01.Ejercicio9.ver(matriz);
		int suma = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (i==j) {
					suma += matriz[i][j];
				}
			}
		}
		int i = 0;
		int j = matriz.length-1;
		while (i < matriz.length && j >= 0) {
			suma += matriz[i][j];
			i++;
			j--;
		}
		System.out.println("La suma de las diagonales es "+suma);

	}

}
