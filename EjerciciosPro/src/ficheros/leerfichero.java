package ficheros;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

public class leerfichero {

	public static void main(String[] args) throws IOException {
		

		FileReader leer1 = new FileReader("carta.txt");
		
		 int letra = leer1.read();
		
		while (letra != -1) {
	
		System.out.println((char) letra);
		letra = leer1.read();
		
		
		}
		leer1.close();


	}

}
