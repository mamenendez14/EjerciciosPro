package arrays.hoja02;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String codigo[] = new String[10];
		int cantidad[] = new int[10];
		String codigoNuevo;
		int cantidadNueva;
		
		
		System.out.println("Introduce el codigo del producto: ");
		codigoNuevo = sc.next();
		
		while (!codigoNuevo.equalsIgnoreCase("fin")) {
			
			System.out.println("Introduce la cantidad vendida: ");
			cantidadNueva = sc.nextInt();
			
			int i = 0;
			int j = 0;
			boolean exit = false;
			
			while (!exit && i < codigo.length) {
				if (codigoNuevo.equals(codigo[i])) {
					cantidad[i] = cantidad[i] + cantidadNueva;
					exit = true;
				}
				i++;
			}
			if (!exit) {
				while(!exit && j < codigo.length) {
					if (codigo[j]==null) {
						codigo[j] = codigoNuevo;
						cantidad[j] = cantidadNueva;
						exit = true;
					}
					j++;
				}
			}
			
			System.out.println("Introduce el codigo del producto: ");
			codigoNuevo = sc.next();
		}
		
		for (int j = 0; j < codigo.length; j++) {
			if (codigo[j]!=null) {
				System.out.println("El producto con el codigo "+codigo[j]+" se ha vendido "+cantidad[j]+" veces.");
			}
		}
		
		
		
		sc.close();

	}

}
