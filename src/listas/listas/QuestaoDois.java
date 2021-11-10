package listas;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestaoDois {

	public static void main(String[] args) {
		
		/*
		 * Escreva um programa que solicite nomes de cores e adicione eles em
		 um ArrayList. O programa deve ser encerrado quando a pessoa
         usuária digitar a palavra “fim”.
		 */
		
		ArrayList<String> cores = new ArrayList<String>();
		String cor = "";
		Scanner scanner = new Scanner(System.in);
		
		while(!cor.equals("fim")) {
			System.out.println("Digite uma cor: ");
			cor = scanner.nextLine();
			cores.add(cor);	
		}
		
		for (int i = 0; i < cores.size(); i++) {
			System.out.println(cores.get(i));
		}

		

	}

}
