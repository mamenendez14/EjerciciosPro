import java.util.Scanner;

public class ejercicio08mcdwhile {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int num1 = Sc.nextInt();
		System.out.println("Introduce otro número:");
		int num2 = Sc.nextInt();
		
		int mayor, menor;
		int mcd;
		
		
		if (num1>num2) {
			 mayor=num1;
			 menor=num2;
		}
		else {
			 mayor=num2;
			 menor=num1;
		}
		
		int i=menor;
		mcd = menor;
			
		while (mayor%i!=0 || menor%i!=0) {
			i--;
		}
		mcd=i;
		System.out.println("El m.c.d. es:");
		System.out.println(mcd);
			
	}	

}