package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class buffer {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("alumnos.csv");
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println(br.readLine());
		
		fr.close();
		br.close();
	}

}
