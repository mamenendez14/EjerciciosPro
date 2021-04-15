package estructurasecuencial;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		Double perimetro, radio, area;
		System.out.println("Introduce el radio del circulo:");
		radio = Sc.nextDouble();
		
		perimetro = radio*2*Math.PI;
		area = Math.PI*Math.pow(radio, 2);
		
		System.out.println("El perímetro del circulo es "+ perimetro);
		System.out.println("El área del circulo es "+area);
	}

}
