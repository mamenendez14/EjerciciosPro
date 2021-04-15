package estructuracondicional;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int x;
		x = Sc.nextInt();
		
		if (10<=x && x<=100) {
			System.out.println(x+" está comprendido entre 0 y 100");
		}		
	    else {
			     System.out.println(x+" no está comprendido entre 0 y 100");
	    }
		
		Sc.close();
	}

}