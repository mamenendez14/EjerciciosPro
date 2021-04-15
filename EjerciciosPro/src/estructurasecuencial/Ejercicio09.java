package estructurasecuencial;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		Double num1, num2, num3, num4, suma, diferencia23, producto24;
		num1 = Sc.nextDouble();
		num2 = Sc.nextDouble();
		num3 = Sc.nextDouble();
		num4 = Sc.nextDouble();
		
		suma = num1+num2+num3+num4;
		diferencia23 = num2-num3;
		producto24 = num2*num4;
		
		System.out.println(suma);
		System.out.println(diferencia23);
		System.out.println(producto24);
	}

}
