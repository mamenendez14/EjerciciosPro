package ficheros;

import java.io.FileWriter;

import java.io.IOException;

public class crearfichero {

	public static void main(String[] args) throws IOException {

		FileWriter fichero1 = new FileWriter("hola.txt",true);
		fichero1.write("Hola que tal?\n");
		fichero1.write("Bien y tu?\n");
		fichero1.close();


	}

}
