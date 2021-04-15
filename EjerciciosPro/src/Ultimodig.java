import java.util.Scanner;

public class Ultimodig {
	
	static int digito (int numero) {
		return numero%10;
		
	}

	public static void main(String[] args) {
		int x, numero;
		Scanner Sc = new Scanner (System.in);
		System.out.println("Introduce un número:");
		numero = Sc.nextInt();
		
		x = digito(numero);
		System.out.println("El último digito es " + x);

	}

}
