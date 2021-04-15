package ejerciciosrepaso;

import java.util.Scanner;

public class ejercicio05 {
	
	static void fibonacci(int serie) {
		int num1 = 0;
		int num2 = 1; 
		int suma = 1;
         
        for (int i = 1; i < serie; i++) {

            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
            
            if (num2<=serie) {
            
            System.out.println(num2);
            
            }
             
        }
    
 
}


	public static void main(String[] args) {
		Scanner tecla = new Scanner(System.in);
		int num = tecla.nextInt();
		fibonacci(num);

	}

}
