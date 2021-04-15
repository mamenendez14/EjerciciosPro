package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fusion {
	
	public static void main(String[] args)throws IOException {
		
		FileReader fr1 = new FileReader("fichero2.txt");
		FileReader fr2 = new FileReader("fichero3.txt");
		
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);
		
		FileWriter fw = new FileWriter("fichero23temp.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String leido1, leido2;
		int total=0, comparar;
		String[]col1 = new String[2];
		String[]col2 = new String[2];
		
		leido1 = br1.readLine();
		leido2 = br2.readLine();
		
		while (leido1!=null && leido2!=null){
			col1 = leido1.split("\\|");
			col2 = leido2.split("\\|");
			comparar = col1[0].compareTo(col2[0]);
			
			if (comparar==0){
				total=Integer.valueOf(col1[1])+Integer.valueOf(col2[1]);
				bw.write(col1[0]+"|"+total+ "\n");

				leido1 = br1.readLine();
				leido2 = br2.readLine();
			}
			else{
				if (comparar<0){
					total=Integer.valueOf(col1[1]);
					bw.write(col1[0]+"|"+total+ "\n");

					leido1 = br1.readLine();
				}
				else{
					total=Integer.valueOf(col2[1]);
					bw.write(col2[0]+"|"+total + "\n");

					leido2 = br2.readLine();
				}
			}
		}
		while (leido1!=null) {
			bw.write(leido1+"\n");
			leido1=br1.readLine();
		}
		while (leido2!=null) {
			bw.write(leido2+"\n");
			leido2=br2.readLine();
		}
	bw.close();
	br1.close();
	br2.close();
	}
}