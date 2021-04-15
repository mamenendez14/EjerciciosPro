package ficherosData;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class buscar {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("jugadores.dat");
		
		FileInputStream fis = new FileInputStream(f1);
		DataInputStream dis = new DataInputStream(fis);
		
		Scanner sc = new Scanner (System.in);
		
		String nombre, nombreBuscado;
		int edad;
		double altura;
		boolean eof = false;
		boolean encontrado = false;
		
		System.out.println("Introduce el nombre del jugador que quieres buscar:");
		nombreBuscado = sc.nextLine();
		
		
		while (!eof && !encontrado) {
			try {
				
				nombre = dis.readUTF();
				edad = dis.readInt();
				altura = dis.readDouble();
			
				if (nombreBuscado.equals(nombre)) {
					System.out.println("Nombre: " + nombre + "| Edad: "+ edad + "| Altura: " + altura);
					encontrado = true;
				}
			} catch (EOFException e) {
				eof = true;
			}
		}
		
		if (!encontrado) {
			System.out.println("No se ha encontrado el jugador que busca.");
		}
		
		sc.close();
		dis.close();

	}

}
