package arrays.hoja02;

import java.util.Scanner;

public class Ejercicio7b {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nombre[] = {"Luis", "David", "Cristian", "Julia", "Cristina", "Daniel", 
				"Sergio", "Marcos", "Jose", "Vanesa" };
		int telefono[] = {976000000, 976000011,976000022,976000033,976000044,976000055,
				976000066,976000077,976000088,976000099 };
		String nombreBuscado = null;
		
		System.out.println("Introduce el nombre que desea buscar: ");
		nombreBuscado = sc.next();
		
		for (int i = 0; i < nombre.length; i++) {
			if (nombreBuscado.equalsIgnoreCase(nombre[i])) {
				System.out.println("El n�mero de telefono de "+nombre[i]+" es "+telefono[i]);
			}
		}
		
		sc.close();
		
		

	}

}
