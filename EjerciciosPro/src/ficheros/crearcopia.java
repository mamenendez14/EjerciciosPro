package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class crearcopia {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("Alumno2.dat");
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("Alumno2copia.dat");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String leido = br.readLine();
		
		while (leido!=null) {	
			
			System.out.println(leido);
			bw.write(leido + "\n");
			
			leido=br.readLine();
			
			
		
		}
		bw.close();
		fw.close();
		br.close();
		fr.close();
		
	}

}
