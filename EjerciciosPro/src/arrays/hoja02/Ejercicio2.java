package arrays.hoja02;

public class Ejercicio2 {
	
	static void desplazar(int[] v) {
		int aux = v[v.length-1];
		for (int i = v.length-2; i >= 0; i--) {
			v[i+1] = v[i];
		}
		v[0] = aux;
		
	}

	public static void main(String[] args) {
		
		int vector[] = {1,2,3,4,5};
		
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		
		desplazar(vector);
		System.out.println("");
		
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		
	}
	
	

}
