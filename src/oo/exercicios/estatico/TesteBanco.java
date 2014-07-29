package oo.exercicios.estatico;

import java.util.Scanner;

public class TesteBanco {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("Digite o limite");
		double limite = k.nextDouble();
		
		Conta c1 = new Conta(limite, "Nassor");
		c1.debito(1000);
		c1.debito(90);
		
		Conta c2 = new Conta(100000000, "Um cara ricooooo");
		c1.credito(100000);
		c1.debito(3000);
		
		double saldoGeral = GerenteDaConta.saldoGeral(c1, c2);
		System.out.println(saldoGeral);
		
		GerenteDaConta.dadosContas(c1, c2);
	}

}
