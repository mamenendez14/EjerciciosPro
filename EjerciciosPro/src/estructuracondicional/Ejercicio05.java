package estructuracondicional;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int x;
		int z;
		x = Sc.nextInt();
		z = Sc.nextInt();
		
		if (x==z) {
			System.out.println(x*z);
		}
		
		else if (x>z) {
			     System.out.println(x+z);
		}
		
	    else {
			     System.out.println(x/z);
	    }
		
		Sc.close();
	}

}