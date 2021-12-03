package arquivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Testando git");

		FileInputStream stream = new FileInputStream("C:/codelab/Ficha.txt");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		
		String linha = br.readLine();
		
		while (linha != null) {
				
			System.out.println(linha);
			linha = br.readLine();
		}
		

	}

}
