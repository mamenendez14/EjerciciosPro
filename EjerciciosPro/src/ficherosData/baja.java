package ficherosData;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class baja {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("jugadores.dat");
		File f2 = new File("jugadoresTemp.dat");
		
		FileInputStream fis = new FileInputStream(f1);
		DataInputStream dis = new DataInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream(f2);
		DataOutputStream dos = new DataOutputStream(fos);
		
		Scanner sc = new Scanner (System.in);
		
		String nombre, nombreBuscado;
		int edad;
		double altura;
		boolean eof = false;
		
		System.out.println("Introduce el nombre del jugador que quieres borrar:");
		nombreBuscado = sc.nextLine();
		
		while (!eof) {
			try {
				
				nombre = dis.readUTF();
				edad = dis.readInt();
				altura = dis.readDouble();
			
				if (!nombreBuscado.equals(nombre)) {
					dos.writeUTF(nombre);
					dos.writeInt(edad);
					dos.writeDouble(altura);
				}
			} catch (EOFException e) {
				eof = true;
			}
		}
		
		sc.close();
		dos.close();
		dis.close();
		
		f1.delete();
		f2.renameTo(f1);

	}

}
