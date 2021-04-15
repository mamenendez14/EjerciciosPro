package ficheros;

import java.io.File;
import java.io.IOException;

public class clasefile {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("adioses.txt");
		File f2 = new File("holases.txt");
		
		if (f1.exists()==false) {
			f1.createNewFile();
		}

	}

}
