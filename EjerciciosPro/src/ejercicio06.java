import java.util.Scanner;

public class ejercicio06 {
	
	static String tirada() {
		double r = Math.random();
		int res =(int) (r*3+1);
		String tirada;
		if (res==1) {
			tirada="Piedra";
		}
		else if (res==2) {
			tirada="Papel";
		}
		else {
			tirada="Tijera";
		}
		return tirada;

	}

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Elige Piedra, Papel o Tijera:");
		String jugador = Sc.next();
		
		String maquina = tirada();
		
		
		if (jugador.equals("Piedra")) {
			if (maquina.equals("Piedra")){
				System.out.println("La máquina ha sacado Piedra. Es un empate!");	
			}
			if (maquina.equals("Tijera")){
				System.out.println("La máquina ha sacado Tijera. Has ganado!");	
			}
			if (maquina.equals("Papel")){
				System.out.println("La máquina ha sacado Papel. Has perdido!");	
			}
		}
		if (jugador.equals("Tijera")) {
			if (maquina.equals("Piedra")){
				System.out.println("La máquina ha sacado Piedra. Has perdido!");	
			}
			if (maquina.equals("Tijera")){
				System.out.println("La máquina ha sacado Tijera. Es un empate!");	
			}
			if (maquina.equals("Papel")){
				System.out.println("La máquina ha sacado Papel. Has ganado!");	
			}
		}
		if (jugador.equals("Papel")) {
			if (maquina.equals("Piedra")){
				System.out.println("La máquina ha sacado Piedra. Has ganado!");	
			}
			if (maquina.equals("Tijera")){
				System.out.println("La máquina ha sacado Tijera. Has perdido!");	
			}
			if (maquina.equals("Papel")){
				System.out.println("La máquina ha sacado Papel. Es un empate!");	
			}
		}
	}

}
