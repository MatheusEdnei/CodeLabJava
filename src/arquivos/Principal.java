package arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		FileWriter arquivo = new FileWriter("C:/codelab/Ficha.txt");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = scanner.nextLine();
		System.out.println("Digite a sua altura: ");
		String altura = scanner.nextLine();
		System.out.println("Digite o seu peso: ");
		String peso = scanner.nextLine();
		
		gravarArquivo.printf("Ficha de " + nome + "%n");
		gravarArquivo.printf("Nome: " + nome + "%n");
		gravarArquivo.printf("Altura: " + altura + "%n");
		gravarArquivo.printf("peso: " + peso + "%n");
		
		arquivo.close();

	}

}
