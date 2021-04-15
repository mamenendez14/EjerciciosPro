package arrays.hoja03;

public class Ejercicio12 {

	public static void main(String[] args) {

		int matriz[][] = new int[6][8];
		arrays.hoja01.Ejercicio9.llena(matriz);
		arrays.hoja01.Ejercicio9.ver(matriz);
		
		int alumnos = 0;
		int max = 0;
		int pos = 0;
		int grupo = 0;
		
		for (int j = 0; j < matriz[0].length; j++) {
			for (int i = 0; i < matriz.length; i++) {
				alumnos += matriz[i][j];
			}
			System.out.println("La asignatura "+j+" tiene "+alumnos+" alumnos.");
			alumnos = 0;
		}
		
		for (int i = 0; i < matriz.length; i++) {
			grupo = i;
			max = 0;
			for (int j = 0; j < matriz[0].length; j++) {
				if (max < matriz [i][j]) {
					max = matriz[i][j];
					pos = j;
				}
			}
			System.out.println("El grupo "+grupo+" tiene mas alumnos en la asignatura "+pos);
		}

	}

}
