import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {
		int N;
		Scanner Sc = new Scanner (System.in);
		System.out.println("Introduce un número entero: ");
		N = Sc.nextInt();
		System.out.println("");
		System.out.println("Lista de divisores de " + N + ":");
		
	    for (int i = 1; i <= N; i++) {
	    	if (N%i==0) {
	    		System.out.println(i);
	    	}
			
		}
	    Sc.close();

	}

}
