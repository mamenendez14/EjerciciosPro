package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class borraregistro {

	public static void main(String[] args) throws IOException {
		
		/** File, Reader, Writer y Scanner **/
		
		File f1 = new File("Alumno2.dat");
		File f2 = new File("Alumno2temp.dat");
		
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		
		/**Declaraciones**/
		
		Scanner sc = new Scanner(System.in);
		
		String 
				leido,
				nombreBuscado;
		
		String[]col = null;
		
		/**Codigo**/
		
		leido = br.readLine();
		
		System.out.println("Introduce el registro que quieres borrar:");
		nombreBuscado = sc.nextLine();
		
		while (leido!=null) {
			
			col = leido.split("\\|");
			
			if (!nombreBuscado.equalsIgnoreCase(col[0])) {
				
				bw.write(leido + "\n");
			
			}
			
			
			leido = br.readLine();
			
		}
		
		sc.close();
		bw.close();
		fw.close();
		br.close();
		fr.close();
		
		f1.delete();
		f2.renameTo(f1);
		

	}

}