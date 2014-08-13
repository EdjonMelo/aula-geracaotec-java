package util.arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AbreArquivo {

	public static void main(String[] args) {
		// Cria um objeto que referencia um arquivo específico
		File arquivo = new File("res/arquivo-teste.txt");

		// verifica se o arquivo exite ou não
		if (arquivo.exists()) {
			try {
				
				// le o arquivo e imprime cada linha do mesmo no console
				FileReader fr = new FileReader(arquivo);
				BufferedReader br = new BufferedReader(fr);
				while( br.ready() ){
					System.out.println(br.readLine());
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Arquivo não encontrado");
		}

	}

}
