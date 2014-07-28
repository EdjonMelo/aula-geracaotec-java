package oo.exercicios.estatico;

public class TesteBanco {

	public static void main(String[] args) {
		Conta c1 = new Conta(100, "Nassor");
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
