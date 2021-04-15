package estructurasecuencial;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		Double centigrados, fahrenheit;
		System.out.println("Introduce la temperatura en Grados Centígrados: ");
		centigrados = Sc.nextDouble();
		
		fahrenheit = 9/5*centigrados+32;
		
		System.out.println("Son "+fahrenheit+" Grados Fahrenheit");
	}

}
