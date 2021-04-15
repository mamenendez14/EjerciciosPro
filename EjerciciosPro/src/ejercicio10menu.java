import java.util.Scanner;

public class ejercicio10menu {
	
	static void hola() {
		System.out.println("Hola");
	}
	
	static double aleatorio() {
		double random = Math.random();
		return random;
	}
	
	static double logaritmo(double num) {
		double resultado = Math.log10(num);
		return resultado;
	}
	
	static void continuar() {
		
		Scanner sc = new Scanner(System.in);
		String resp = sc.nextLine();
		do  {
			System.out.println("");
			System.out.println("Si desea volver al menú pulse <Enter>");
			resp = sc.nextLine();
		} while(!resp.equals(""));
		
		sc.close();
		
		}


	public static void main(String[] args) {
		
		int option;
		
		do {
				
				System.out.println("MENU\n");
				System.out.println("1.- Escribir Hola\n");
				System.out.println("2.- Dame un número aleatorio\n");
				System.out.println("3.- Calcular logaritmo\n");
				System.out.println("4.- FIN\n");
				System.out.println("Elija opción:");
				Scanner sc = new Scanner(System.in);
				option = sc.nextInt();
				int n=20;
				
				for (int i = 0; i < n; i++) {
					System.out.println("");
					
				}
				if (option<1 || option>4) {
					System.out.println("Los valores introducidos no son correctos.");
					
				} else if (option!=4) {
				
				switch (option) {
				case 1: 
					hola();
					break;
				
				case 2: 
					System.out.println("El número aleatorio es: "+aleatorio());
					break;
				
				case 3: 
					System.out.println("Introduce el número del que quieres calcular el logaritmo:");
					double num = sc.nextDouble();
					System.out.println("El logaritmo en base 10 de "+ num + " es "+ logaritmo(num));
					break;
					
				}
				
				continuar();
				}
				
				
	
			} while (option!=4);
		

		
		}
	}