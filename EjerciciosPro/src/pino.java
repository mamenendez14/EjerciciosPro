import java.util.Scanner;

public class pino {
	
	static void copa() {
		System.out.println("       * ");
		System.out.println("      *** ");
		System.out.println("    ****** ");
		System.out.println("  ********** ");
		System.out.println(" ************ ");
		
	}
	static void tronco(int altura) {
		for (int i = 0; i <= altura; i++) {
		System.out.println("      ||| ");
		}
		
	}
	static void suelo() {
		System.out.println(" ............ ");
	}
	public static void main(String[] args) {
		int altura;
		Scanner Sc = new Scanner (System.in);
		System.out.println("Introduce la altura del pino:");
		altura = Sc.nextInt();
		
		copa();
		tronco(altura);
		suelo();
		
		Sc.close();

	}

}
