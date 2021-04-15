package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		FileReader fr = new FileReader("Alumno2.dat");
		BufferedReader br = new BufferedReader(fr);

		String alumno,nombre,nombreBuscar;
		String[]col = null ;
		boolean encontrado = false;
		
		int nota1 = 0;
		int nota2 = 0;

		System.out.println("Inserte el nombre del alumno");
		nombreBuscar = sc.nextLine();
		
		alumno = br.readLine();
		
		
		while(alumno!= null && !encontrado) {
			
			col = alumno.split("\\|");
			nombre = col[0];
			nota1 = Integer.valueOf(col[1]);
			nota2 = Integer.valueOf(col[2]);

			
			if(nombre.equalsIgnoreCase(nombreBuscar)) {
			
				encontrado = true;
				
				System.out.println();
				
				System.out.printf("%-15s %5s %5s \n", "Alumno", "Nota", "Nota2" );
	
				System.out.printf("%-15s %5s %5s \n", "______", "____", "_____" );
	
				System.out.println();
				
				System.out.printf("%-15s %4s %4s \n", nombre, nota1, nota2 );
			}
			
			alumno = br.readLine();

		}
		
		sc.close();
		fr.close();
		br.close();

	}
}
