import java.util.Scanner;

public class ejercicio12 {

	static int divisores(int num) {
		int cont = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cont++; // contador
			}
		}
		return cont;
	}

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int num = Sc.nextInt();
		System.out.println("Lista de números primos hasta " + num + ":");
		
		for (int i = 1; i <= num; i++) {
			if (divisores(i)==2) {
				System.out.println(i);
			}
			
		}
		Sc.close();

	}
}