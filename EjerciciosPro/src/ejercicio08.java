import java.util.Scanner;

public class ejercicio08 {
	
	static double impuestos(double sueldo) {
		if (sueldo>650) {
			return((sueldo-650)*0.75);
		}
			else if (sueldo>1650) {
				return(((sueldo-650)-1000*0.75)*0.55);
			}
			else {
				return sueldo;
			}
	
	}

	public static void main(String[] args) {
		Scanner Sc = new Scanner (System.in);
		double horas=Sc.nextDouble();
		if (horas<35) {
			System.out.println(20*horas-impuestos(20*horas));
		}
		else {
			System.out.println(30*horas-impuestos(30*horas));
		}
    Sc.close();
	}

}
