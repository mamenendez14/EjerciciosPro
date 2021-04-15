package fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class cambioFormato {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		String fecha;
		
		System.out.println("Introduce una fecha en formato español:");
		fecha = sc.nextLine();
		
		Date d1 = new Date();
		SimpleDateFormat europeo = new SimpleDateFormat("dd/MM/yyyy");
		d1 = europeo.parse(fecha);
		
		SimpleDateFormat internacional = new SimpleDateFormat("yyyy/MM/dd");
		
		
		System.out.println(internacional.format(d1));
		
		sc.close();
		
		
		

	}

}
