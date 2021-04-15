package estructuracondicional;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		String x;
		int longitud;
		System.out.println("Introduzca un verbo en infinitivo: ");
		x = Sc.next();
		
		longitud = x.length();
		
		if (x.substring(longitud-2, longitud)=="ar") {
			System.out.println("Es un verbo de primera generación.");
		}
		
		else if (x.substring(longitud-2, longitud)=="er") {
			System.out.println("Es un verbo de segunda generación.");
		}
		else if (x.substring(longitud-2, longitud)=="ir") {
			System.out.println("Es un verbo de tercera generación.");
		}
		else {
			System.out.println("No es infinitivo.");
		}
		
		Sc.close();
	}

}
