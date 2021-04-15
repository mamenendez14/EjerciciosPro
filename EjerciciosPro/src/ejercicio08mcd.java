import java.util.Scanner;

public class ejercicio08mcd {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int num1 = Sc.nextInt();
		System.out.println("Introduce otro número:");
		int num2 = Sc.nextInt();
		
		if (num1>num2) {
			int mayor=num1;
			int menor=num2;
			int mcd=0;
			
			for (int i = 2; i <= menor; i++) {
				if (mayor%i==0 && menor%i==0) {
					mcd=i;
				}
			}
			System.out.println("El m.c.d. es:");
			System.out.println(mcd);
		}
		else {
			int mayor=num2;
			int menor=num1;
			int mcd=0;
				
			for (int i = 2; i <= menor; i++) {
				if (mayor%i==0 && menor%i==0) {
						mcd=i;
			
				}
			}
			System.out.println("El m.c.d. es:");
			System.out.println(mcd);
		}
			
	}	

}
