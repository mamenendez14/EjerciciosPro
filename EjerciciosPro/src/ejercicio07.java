import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		int x;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Introduce el número de ordenadores comprados:");
		x = Sc.nextInt();
			

		if (x < 5) {
				System.out.println(x * 2000 * 0.9);
			} else if (5 <= x && x < 10) {
				System.out.println(x * 2000 * 0.8);
			} else {
				System.out.println(x * 2000 * 0.6);
			}
			Sc.close();


	}

}
