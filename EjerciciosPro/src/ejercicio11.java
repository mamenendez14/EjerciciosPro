import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner (System.in);
		System.out.println("Introduce un número:");
		int num = Sc.nextInt();
		int cont;
		cont=0;
		
		for (int i = 1; i <= num; i++) {
			if (num%i==0) {
				cont++; //contador
			}
		}
		if (cont==2) {
			System.out.println(num + " es un número primo.");
		}
		else {
			System.out.println(num + " no es un número primo.");
		}
		Sc.close();

	}

}
