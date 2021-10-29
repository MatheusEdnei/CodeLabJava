package scanner;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {		
		/*
		System.out.println("Digite o nome do aluno: ");
		String nomeAluno = sc.nextLine();
		System.out.println("Digite a nota do aluno: ");
		double notaAluno = sc.nextDouble();
		
		System.out.println("O nome do aluno é: " + nomeAluno);
		System.out.println("A nota do aluno é: " + notaAluno);
		*/
		
		/*
		while (!nome.equals("-1")) {
			System.out.println("Digite o nome da pessoa: ");
			nome = sc.nextLine();
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		String nome = "";
		
		System.out.println("Bem vindo a calculadora:");
		System.out.println("Digite a operação (+ , - , / , *): ");
		String operacao = sc.nextLine();
		
		switch(operacao) {
		case "+":
			System.out.println("Mais");
			break;
		case "-":
			System.out.println("Menos");
			break;
		case "*":
			System.out.println("Multiplicar");
			break;
		case "/":
			System.out.println("Dividir");
			break;
		}
		
		
	}
}
