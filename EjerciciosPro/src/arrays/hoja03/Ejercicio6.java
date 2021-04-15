package arrays.hoja03;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		int matriz[][][] = new int[9][9][9]; 
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				for (int k = 0; k < 9; k++) {
					if (i==0 || j==0 || k==0 || i==matriz.length-1 || j==matriz[0].length-1 || k==matriz[0][0].length-1) {
						matriz[i][j][k] = 1;
					}
					System.out.print(matriz[i][j][k]+" ");
				}
				System.out.println("");
			}
			System.out.println("");
		}

	}

}

