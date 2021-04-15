import java.util.Scanner;

public class ejercicios03 {

	public static void main(String[] args) {
		int nmayor = 0;
		int x;
		boolean hayNeg = false;
		Scanner Sc = new Scanner(System.in);
		x = Sc.nextInt();
		
		while (x!=0) {
			if (nmayor<x){
				nmayor=x;
			}
			if (x<0) {
				hayNeg = true;
			}
			System.out.println("Introduzca otro número:");
			x = Sc.nextInt();
			
		}
		System.out.println("El número mayor introducido es:" + nmayor);
		
		

	}

}
