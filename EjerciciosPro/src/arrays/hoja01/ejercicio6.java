package arrays.hoja01;

import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int mivector[] =new int[5];//creo el objeto
		int x;
		System.out.println("mi vector tiene una longitud de : "+mivector.length) ;

		for(int i=0;i<5;i++){
			System.out.print("Dame un n° para la componente "+i+" : ");
			x=sc.nextInt();
			mivector[i]=x;
		}
		for(int i=0;i<5;i++){
			if (mivector[i]>5) {
				System.out.println("posicion: "+i+" Valor= "+mivector[i]);
			}
		}
	sc.close();
	}
}
