package estructurasecuencial;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		Double altura, radio, area, volumen;
		System.out.println("Introduce el radio del cilindro:");
		radio = Sc.nextDouble();
		System.out.println("Introduce la altura del cilindro:");
		altura = Sc.nextDouble();
		
		volumen = Math.PI*Math.pow(radio, 2)*altura;
		area = 2*Math.PI*altura+2*Math.PI*Math.pow(radio, 2);
		
		System.out.println("El volumen del cilindro es "+volumen);
		System.out.println("El área del cilindro es "+area);
	}

}
