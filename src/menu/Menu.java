package menu;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		System.out.println("Bem vindo ao sistema da biblioteca");
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Cadastro de livros");
		System.out.println("2 - Visualização dos livros");
		
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		
		switch(opcao) {
			case 1:
				// executar o código de cadastrar os livros
			case 2:
				// executar o código de visualização dos livros
			default:
				System.out.println("Opção inválida");
		}
		
	}

}
