package arrays.hoja02;

public class Ejercicio1 {
	
	static void llenar(int v[]) {
		int random;
		for (int i = 0; i < v.length; i++) {
			random = (int) (Math.random()*100);
			v[i] = random;
		}
	}
	
	static double media(int[] v) {
		int acumulador = 0;
		int contador = 0;
		for (int i = 0; i < v.length; i++) {
			acumulador = acumulador + v[i];
			contador++;
		}
		return (double)acumulador/contador;
	}

	public static void main(String[] args) {
		int contador = 0;
		int vector[] = new int[30];
		llenar(vector);
		double media = media(vector);
		
		for (int i = 0; i < vector.length; i++) {
			if (vector[i]<media) {
				contador++;
			}
		}
		
		System.out.println("Hay "+contador+" valores menores que la media.");
		

	}

}
