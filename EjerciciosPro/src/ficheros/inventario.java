package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class inventario {
	
	static void listado() throws IOException {
		
		File f1 = new File("inventario.dat");
		
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
		String leido = br.readLine();
		
		while(leido!=null) {
			
			System.out.println(leido);
			
			leido = br.readLine();
			
		}
		
		br.close();
		fr.close();
	}
	
	static void alta() throws IOException {
		
		File f1 = new File("inventario.dat");
		File f2 = new File("inventarioTemp.dat");
		
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		
		Scanner sc = new Scanner(System.in);
		
		String leido;
		String[]col = null;
		
		leido = br.readLine();
		
		System.out.println("Introduce el número de registro:");
		String codigoBuscado = sc.nextLine();
		System.out.println("Introduce la cantidad:");
		int cantidad = sc.nextInt();
		
		col = leido.split("\\|");
		String anterior = null;
		
		while(leido!=null) {
			
			col = leido.split("\\|");
			anterior = col[0];
		
			if (codigoBuscado.equals(col[0])) {
				System.out.println("No se pudo completar la acción. Este registro ya existe.");
			}
			
			else {
				
				int compara = codigoBuscado.compareTo(col[0]);
				int comparaAnterior = codigoBuscado.compareTo(anterior);
				
				if (compara<0 && comparaAnterior>0) {
					
					bw.write(codigoBuscado + "|" + cantidad + "\n");
				
				}
					
				bw.write(leido + "\n");	
				
			}
			
			anterior = col[0];
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
	
	static void baja() throws IOException {
		
		File f1 = new File("inventario.dat");
		File f2 = new File("inventarioTemp.dat");
		
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		
		Scanner sc = new Scanner(System.in);
		
		String leido;
		String[]col = null;
		
		leido = br.readLine();
		
		System.out.println("Introduce el registro que quieres borrar:");
		String codigoBuscado = sc.nextLine();
		
		while(leido!=null) {
			
			col = leido.split("\\|");
		
			if (!codigoBuscado.equals(col[0])) {
				
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
	
	static void buscar() throws IOException {
		
		File f1 = new File("inventario.dat");
		
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
		Scanner sc = new Scanner(System.in);
		
		String leido,
			   codigoBuscado,
			   encontrado = null;
		String[]col = null;
		boolean salida=false;

		System.out.println("Introduce el registro que desea buscar:");
		codigoBuscado = sc.nextLine();
		
		leido = br.readLine();
		
		
		while (leido!=null && !salida) {
			
			col = leido.split("\\|");

			if (codigoBuscado.equals(col[0]) || codigoBuscado.compareTo(col[0])<0) {
				salida=true;
				encontrado=leido;
				
			}
			
			leido = br.readLine();
			
		}
		
		if(salida) {
			System.out.println(encontrado);
		}
		else {
			System.out.println("El registro no existe.");
		}
	
		
		br.close();
		sc.close();
		
		
		
	}
	static void modificar() throws IOException {
		
		File f1 = new File("inventario.dat");
		File f2 = new File("inventarioTemp.dat");
		
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		
		Scanner sc = new Scanner(System.in);
		
		String  codigo,
				leido,
				codigoBuscado,
				codigoAct;
			int cantidadAct;
		boolean encontrado = false;
		
		String[]col = null;
		
		leido = br.readLine();
		
		System.out.println("Introduce el registro que quieres actualizar:");
		codigoBuscado = sc.nextLine();		
		
		while (leido!=null) {
			
			col = leido.split("\\|");
			codigo = col[0];
			
			if (codigoBuscado.equals(codigo)) {
				
				System.out.println(leido + "\n");
				
				System.out.println("Introduce el nuevo codigo:");
				codigoAct = sc.nextLine();
				
				System.out.println("Introduce la cantidad:");
				cantidadAct = sc.nextInt();

				bw.write(codigoAct + "|" + cantidadAct + "\n");
				
				System.out.println("Inventario actualizado.");
				
				encontrado=true;
			
			}
			else {
				
				bw.write(leido + "\n");
				
			}
			
			leido = br.readLine();
			
		}
		
		if (!encontrado) {
			System.out.println("El registro no existe.");
		}
		
		sc.close();
		bw.close();
		fw.close();
		br.close();
		fr.close();
		
		f1.delete();
		f2.renameTo(f1);
		

	}


	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Selecciona una opción de inventario:");
		System.out.println(" ------------");
		System.out.println("|1.Listado   |");
		System.out.println("|2.Alta      |");
		System.out.println("|3.Baja      |");
		System.out.println("|4.Buscar    |");
		System.out.println("|5.Modificar |");
		System.out.println("|6.Fin       |");
		System.out.println(" ------------");
		
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
			
		switch (opcion) {
			
			case 1:
				listado();
				break;
			case 2:
				alta();
				break;
			case 3:
				baja();
				break;
			case 4: 
				buscar();
				break;
			case 5:
				modificar();
				break;
			
			
		}
		
		sc.close();
    }


}