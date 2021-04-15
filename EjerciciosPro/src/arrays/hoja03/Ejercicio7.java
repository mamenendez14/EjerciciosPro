package arrays.hoja03;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int matriz[][] = {{1,1,1,1},{1,0,0,1},{1,0,0,1},{1,1,1,1}};
		arrays.hoja01.Ejercicio9.ver(matriz);
		
		boolean asimetrica = false;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if(matriz[i][j] != matriz[j][i]) {
					asimetrica = true;
				}
			}
		}
		if (asimetrica) {
			System.out.println("La matriz no es simetrica");
		}
		else {
			System.out.println("La matriz es simetrica");
		}
		

	}

}
