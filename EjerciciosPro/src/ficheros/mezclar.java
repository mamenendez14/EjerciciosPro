package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class mezclar {

	public static void main(String[] args) throws IOException {
		File f1 = new File("fichero2.txt");
		File f2 = new File("fichero2temp.txt");
		
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String leido, codigo = null;		
		String[]col = null;
		
		int cantidad = 0;
		
		leido = br.readLine();
		
		while (leido!=null) {
			
			col = leido.split("\\|");
			
			if(!col[0].equals(codigo)) {
				if(codigo != null) {
					bw.write(codigo + "|" + cantidad + "\n");
					cantidad = 0;
				}
				
				codigo = col[0];
				
			}
			
			cantidad += Integer.valueOf(col[1]);
			leido = br.readLine();
			
			
		}
		bw.write(codigo + "|" + cantidad + "\n");
		bw.close();
		fw.close();
		br.close();
		fr.close();
		
		f1.delete();
		f2.renameTo(f1);

	}

}
