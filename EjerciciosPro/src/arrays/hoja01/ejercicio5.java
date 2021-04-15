package arrays.hoja01;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int mivector[];//declaro una variable de otra forma,
		// podría usar la del ejemplo anterior,

		mivector =new int[5];//creo el objeto
		int x;
		System.out.println("mi vector tiene una longitud de : "+mivector.length) ;

		for(int i=0;i<5;i++){
			System.out.print("Dame un n° para la componente "+i+" : ");
			x=sc.nextInt();
			mivector[i]=x;
		}
		for(int i=0;i<5;i++){
			System.out.println("posicion: "+i+" Valor= "+mivector[i]);
		}
		
		System.out.println("La suma de las posiciones 0,2,3 es "+ (mivector[0]+mivector[2]+mivector[3]));
		
	sc.close();
	}
}
