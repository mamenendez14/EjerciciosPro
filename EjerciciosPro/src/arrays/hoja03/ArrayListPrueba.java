package arrays.hoja03;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPrueba {

	public static void main(String[] args) {
		
		ArrayList <String> lista = new ArrayList <String>();
		
		lista.add("Primero");
		lista.add("Segundo");
		
		lista.set(1, "Tercero");
		lista.add(1, "Segundo");
		lista.add("Cuarto");
		
		
		//.size()
		//.remove("Segundo") -> Borra solo el primer elemento de la lista.
		//.remove(1) -> Si la lista es de enteros borra la posicion, no el entero.
		//.clear()
		//.contains(cad)
		//.indexOf(cad)
		//collections.sort(lista)
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("");
		Collections.sort(lista);
		
		for (String var: lista) {
			System.out.println(var);
		}

	}

}
