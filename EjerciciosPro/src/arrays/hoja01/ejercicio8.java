package arrays.hoja01;

import java.util.Scanner;

public class ejercicio8 {
	
	public static void main(String[] args) {
		
		int vector[] = new int[6];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una palabra: ");
		String palabra = sc.nextLine();
		
		while (!palabra.equals("")) {
			switch (palabra.toLowerCase().charAt(0)) {
				
			case 'a':
				vector[0]++;
				break;
			case 'e':
				vector[1]++;
				break;
			case 'i':
				vector[2]++;
				break;
			case 'o':
				vector[3]++;
				break;
			case 'u':
				vector[4]++;
				break;
			default:
				vector[5]++;
				break;
		
			}
			
			System.out.println("Introduce otra palabra: ");
			palabra = sc.nextLine();
		}
			System.out.println("Palabras que empiezan por la vocal a :"+ vector[0]);
			System.out.println("Palabras que empiezan por la vocal e :"+ vector[1]);
			System.out.println("Palabras que empiezan por la vocal i :"+ vector[2]);
			System.out.println("Palabras que empiezan por la vocal o :"+ vector[3]);
			System.out.println("Palabras que empiezan por la vocal u :"+ vector[4]);
			System.out.println("Palabras que no empiezan por vocal :"+ vector[5]);
		sc.close();
	}

}
