package ficherosData;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class listar {
public static void main(String[] args) throws IOException {
		
		DataInputStream dis = new DataInputStream(new FileInputStream("jugadores.dat"));
		
		String name;
		int age;
		double height;
		boolean exit= false;
		try {
			while(!exit) {
		
			name = dis.readUTF();
			age = dis.readInt();
			height = dis.readDouble();
			
			System.out.println("Nombre: " + name);
			System.out.println("Edad: " + age);
			System.out.println("Altura: " + height);
			System.out.println("");
			

			}
		}catch (EOFException e) {
			exit = true;
        } 
	
		

		dis.close();

	}

}
