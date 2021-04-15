
import java.util.Scanner;

public class ejercicio4b {
	
	static double Abs (double x) {
		if (x<0) {
			return(x*-1);
		}
		else {
			return(x);
		}
	}
	
	static double maxAbs (double x, double y) {
		x=Abs(x);
		y=Abs(y);
		if (x>y) {
			return(x);
		}
		else {
			return(y);
		}
	}
	
	public static void main(String[] args) {
		Scanner Sc = new Scanner (System.in);
		double x,y;
		System.out.println("Introduce el primer número:");
		x=Sc.nextDouble();
		System.out.println("Introduce el segundo número:");
		y=Sc.nextDouble();
		
		
		System.out.println("El número cuyo valor absoluto es mayor es " + maxAbs(x,y));
		
		Sc.close();
		
		
	}

}
