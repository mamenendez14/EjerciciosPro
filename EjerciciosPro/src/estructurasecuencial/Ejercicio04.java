package estructurasecuencial;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		Double a, b, suma, diferencia, producto, cociente;
		a = Sc.nextDouble();
		b = Sc.nextDouble();
		suma = a+b;
		diferencia = a-b;
		producto = a*b;
		cociente = a/b;
		
		System.out.println(suma);
		System.out.println(diferencia);
		System.out.println(producto);
		System.out.println(cociente);
	}

}
