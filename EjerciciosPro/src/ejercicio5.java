import java.util.Scanner;

public class ejercicio5 {

	
	static boolean flota(double masa, double volumen) {
		double densidad = masa%volumen;
		if (densidad>997) {
			return(true);
		}
		else {
			return(false);
		}
	}

	public static void main(String[] args) {
		Scanner Sc = new Scanner (System.in);
		System.out.println("Introduce la masa del objeto:");
		double masa=Sc.nextDouble();
		System.out.println("Introduce el volumen del objeto:");
		double volumen=Sc.nextDouble();
		
		if (flota(masa, volumen)==true) {
			System.out.println("El objeto flota en el agua");
		}
		else {
			System.out.println("El objeto no flota en el agua");
		}
		Sc.close();
	}

}
