package oo.exception;

import java.util.Scanner;

public class TesteBanco {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("Digite o limite: ");
		double limite = k.nextDouble();
		
		Conta c1, c2;
		
		// Necessidade do "try" para capturar o erro de falta de saldo
		try {
			c1 = new Conta(limite, "Nassor");
			c1.debito(1000);
			c1.debito(90);
			
			c2 = new Conta(100000000, "Um cara ricooooo");
			c2.debito(300000000);
			
		// O "catch" captura o erro e o "printStackTrace" imprime o erro na tela
		} catch (Exception e) {
			e.printStackTrace();
		// o "finally" sempre irá executar o código dentro do seu bloco, mesmo que uma
		// exception ocorra.
		} finally {
			k.close();
		}
		
	}

}
