package arrays.hoja03;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		int matriz[][] = {{1,6,8,5},{7,4,7,6},{3,6,8,9},{5,7,6,4}}; 
		int suma = 0;
		
		for (int i = 0; i < 4; i++) {
			suma = 0;
			for (int j = 0; j < 4; j++) {
				suma += matriz[i][j];
			}
			System.out.println("La fila "+i+" suma "+suma);
		}
		
		
		for (int j = 0; j < 4; j++) {
			suma = 0;
			for (int i = 0; i < 4; i++) {
				suma += matriz[i][j];
			}
			System.out.println("La columna "+j+" suma "+suma);
		}
	}

}


