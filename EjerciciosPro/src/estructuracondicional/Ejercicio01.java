package estructuracondicional;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int x;
		x = Sc.nextInt();
		
		if (x>0) {
			System.out.println("Es un n�mero positivo.");
		}
		
		else if (x==0) {
			     System.out.println("Es un n�mero nulo.");
		}
		
	    else {
			     System.out.println("Es un n�mero negativo.");
	    }
		
		Sc.close();
	}

}