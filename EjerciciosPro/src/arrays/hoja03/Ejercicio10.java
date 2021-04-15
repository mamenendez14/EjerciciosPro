package arrays.hoja03;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int matrizUno[][] = new int[3][3];
		int matrizDos[][] = new int[3][3];
		int matrizSuma[][] = new int[3][3];
		
		arrays.hoja01.Ejercicio9.llena(matrizUno);
		arrays.hoja01.Ejercicio9.ver(matrizUno);
		System.out.println("    +");
		arrays.hoja01.Ejercicio9.llena(matrizDos);
		arrays.hoja01.Ejercicio9.ver(matrizDos);
		System.out.println("-------------");
		
		for (int i = 0; i < matrizUno.length; i++) {
			for (int j = 0; j < matrizUno[0].length; j++) {
				matrizSuma[i][j] = matrizUno[i][j] + matrizDos[i][j];
				System.out.print(matrizSuma[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
