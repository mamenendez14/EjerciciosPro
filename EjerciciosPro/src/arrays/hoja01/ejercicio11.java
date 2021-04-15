package arrays.hoja01;

public class ejercicio11 {
	
	static int Maximo(int[] v) {
		int max = v[0];
		for (int i = 0; i < v.length; i++) {
			if (max<v[i]) {
				max = v[i];
			}
		}
		return max;
	}
	
	static int Minimo(int[] v) {
		int min = v[0];
		for (int i = 0; i < v.length; i++) {
			if (min>v[i]) {
				min = v[i];
			}
		}
		return min;
	}
	
	static double Media(int[] v) {
		int acumulador = 0;
		int contador = 0;
		for (int i = 0; i < v.length; i++) {
			acumulador = acumulador + v[i];
			contador++;
		}
		return acumulador/(double)contador;
	}

	public static void main(String[] args) {
		
		int vector[] = new int[3];
		Ejercicio9.llena(vector);
		Ejercicio9.ver(vector);
		
		System.out.println("");
		System.out.println("El número máximo es: " + Maximo(vector));
		System.out.println("El número mínimo es: " + Minimo(vector));
		System.out.println("La media de todos es: " + Media(vector));


	}

}
