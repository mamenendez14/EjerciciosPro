import java.util.Scanner;

public class ejercicio4 {
	
	static double maxAbs (double x, double y) {
		x=Math.abs(x);
		y=Math.abs(y);
		return(Math.max(x, y));
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
