package ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class alumnos {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("alumnos.csv");
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		int nota;
		
		System.out.println("Nombre del alumno:");
		nombre = sc.nextLine();
		
		
		while (!nombre.equals("stop")) {
			System.out.println("Nota del alumno:");
			nota = sc.nextInt();
			fw.write(nombre + ";"+ nota + "\n");
			System.out.println("Nombre del alumno:");
			sc.nextLine();
			nombre = sc.nextLine();
		}
		
		fw.close();
		sc.close();

	}

}
