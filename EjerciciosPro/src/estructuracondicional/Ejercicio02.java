package estructuracondicional;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int x;
		int z;
		x = Sc.nextInt();
		z = Sc.nextInt();
		
		if (x==z) {
			System.out.println(x+" es igual que "+z);
		}
		
		else if (x>z) {
			     System.out.println(x+" es mayor que "+z);
		}
		
	    else {
			     System.out.println(x+" es menor que "+z);
	    }
		
		Sc.close();
	}

}