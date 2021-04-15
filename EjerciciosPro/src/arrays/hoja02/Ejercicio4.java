package arrays.hoja02;

import java.util.Scanner;

public class Ejercicio4 {
	
	static void alta(int[] v, int num) {
		
		int i = 5;
		
		while(i>0 && v[i-1]>num) {
			v[i]=v[i-1];
			i--;
		}
		v[i]=num;
		for (int j = 0; j < v.length; j++) {
			System.out.print(v[j]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vector[] = {2,4,6,8,10,0,0,0,0,0};
		
		System.out.println("Introduce el número que deseas introducir:");
		int num = sc.nextInt();
		
		System.out.println("");
		
		alta(vector, num);
		
		sc.close();

	}

}