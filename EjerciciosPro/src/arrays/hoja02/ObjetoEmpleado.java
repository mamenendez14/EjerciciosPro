package arrays.hoja02;

import java.util.Scanner;

public class ObjetoEmpleado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Empleado[] empl = new Empleado[4];
		String codigoBuscado;
		int i = 0;
		
		empl[0] = new Empleado("A10", "Miguel");
		empl[1] = new Empleado("A20", "Ruben");
		empl[2] = new Empleado("A30", "Cristian");
		empl[3] = new Empleado("A40", "Alvaro");
		
		
		System.out.println("Introduce el  código del empleado: ");
		codigoBuscado = sc.next();
		
		while (i < empl.length && !codigoBuscado.equalsIgnoreCase(empl[i].getCode())) {
			i++;
		}
		
		if (i < empl.length) {
			System.out.println("El nombre del empleado con codigo "+empl[i].getCode()+" es "+empl[i].getName());
		}
		else {
			System.out.println("El empleado no ha sido encontrado.");
		}

		sc.close();

	}

}
