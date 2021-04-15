package ficheros;

import java.io.FileWriter;

import java.io.IOException;

import java.util.Scanner;

public class carta {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("carta.txt");
		Scanner sc = new Scanner(System.in);
		
		String parrafo = sc.nextLine();
		
		while (!parrafo.equals("FIN")) {
			fw.write(parrafo + "\n");
			parrafo = sc.nextLine();
		}
		fw.close();
		sc.close();

	}

}
