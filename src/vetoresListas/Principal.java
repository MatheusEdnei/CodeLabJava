package vetoresListas;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		// Vetores
		
		int[] idades = new int[4];
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i*2;
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		
		// Listas
		ArrayList<String> listaNome = new ArrayList<String>();
		
		listaNome.add("Manoel");
		listaNome.add("Ana");
		listaNome.add("Leticia");
		
		for(int i = 0; i < listaNome.size(); i++) {
			System.out.println(listaNome.get(i));
		}
		
		
		
		
		
		

	}

}

