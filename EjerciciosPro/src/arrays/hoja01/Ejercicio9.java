package arrays.hoja01;

public class Ejercicio9 {
	
	public static void llena(int[] v) {
		int random;
		for (int i = 0; i < v.length; i++) {
			random = (int) (Math.random()*100);
			v[i] = random;
		}
	}
	
	public static void llena(int[][] v) {
		int random;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[0].length; j++) {
				random = (int) (Math.random()*100);
				v[i][j] = random;
			}
		}
	}
	
	public static void ver(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}
	
	public static void ver(int[][] v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[0].length; j++) {
				System.out.print(v[i][j]+" ");
			}
			System.out.println("");
		}
	}

	

}
