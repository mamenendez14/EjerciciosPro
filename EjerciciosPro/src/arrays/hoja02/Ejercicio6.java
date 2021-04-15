package arrays.hoja02;

public class Ejercicio6 {
	
	/*Leer dos series de 10 enteros, que estar�n ordenados crecientemente. Copiar (fusionar) los dos
	vectores en un tercero, de forma que sigan ordenados.*/
	

	public static void main(String[] args) {
		
		int vectorUno[] = {1,3,5,7,9,11,13,15,17,19};
		int vectorDos[] = {2,4,6,8,10,12,14,16,18,20};
		int vectorTres[] = new int [vectorUno.length+vectorDos.length];

		int k = 0;
		int i = 0;
		int z = 0;
		
		while(i < vectorUno.length && k < vectorDos.length) {
			if (vectorUno[i]<vectorDos[k]) {
				vectorTres[z]=vectorUno[i];
				i++;
			}
			else {
				vectorTres[z]=vectorDos[k];
				k++;
			}
			z++;
		}
		
		for (; i < vectorUno.length; i++) {
			vectorTres[z]=vectorUno[i];
			z++;
		}
		for (; k < vectorDos.length; k++) {
			vectorTres[z]=vectorDos[k];
			z++;
		}
		
		for (int j = 0; j < vectorTres.length; j++) {
			
			System.out.print(vectorTres[j]+" ");
		}
	
	}
}
