package util.arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscreveArquivo {
	public static void main(String[] args) {
		// Cria um objeto que referencia um arquivo específico
		File arquivo = new File("res/arquivo-teste.txt");

		try {
			// A chamada abaixo método irá sobreescrever o arquivo
			// FileWriter fw = new FileWriter( arquivo );

			// Utilizando o atributo true no construtor o arquivo não será
			// recriado
			FileWriter fw = new FileWriter(arquivo, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.newLine(); // cria uma nova linha no arquivo
			bw.write("Super luper hiper liper pulo do tigrão");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
