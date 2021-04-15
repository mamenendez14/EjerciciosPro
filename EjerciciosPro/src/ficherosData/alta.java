package ficherosData;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class alta {

	public static void main(String[] args) throws IOException {
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("jugadores.dat", true));
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		int edad;
		double altura;
		
		System.out.println("Introduce el nombre del jugador:");
		nombre = sc.next();
		
		System.out.println("Introduce la edad del jugador:");
		edad = sc.nextInt();
		
		System.out.println("Introduce la altura del jugador:");
		altura = sc.nextDouble();
		
		dos.writeUTF(nombre);
		dos.writeInt(edad);
		dos.writeDouble(altura);
		
		sc.close();
		dos.close();

	}

}
