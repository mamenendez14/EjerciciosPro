import java.util.Scanner;

public class ejercicio10 {
	
	static int factorial(int num) {
		int z;
		z=1;
		for (int i = 1; i <= num; i++) {
			z=z*i;
		}
		return z;
		
	}

	public static void main(String[] args) {
		Scanner Sc = new Scanner (System.in);
		System.out.println("Introduce un número:");
		int num = Sc.nextInt();
		
		System.out.println("El factorial es " + factorial(num));
		Sc.close();

	}

}
