import java.util.Scanner;

public class ejercicio05 {
	
	static int factorial(int num) {
		int z;
		z=1;
		for (int i = 1; i <= num; i++) {
			z=z*i;
		}
		return z;
		
	}

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Introduce m:");
		int m=Sc.nextInt();
		System.out.println("Introduce n:");
		int n=Sc.nextInt();
		int combinatorio;
		
		combinatorio=factorial(m)/(factorial(n)*(factorial(m-n)));
		
		System.out.println("El combinatorio de ("+n+","+m+") es "+combinatorio);
		
		Sc.close();

	}

}
