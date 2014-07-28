package oo.exercicios.estatico;

/*
 * Desenvolva uma classe com métodos estáticos chamada GerenteDaConta 
 * que gerencia uma conta.
 * Crie um método para verificar se uma conta está usando o seu limite ou não.
 * Crie um método para verificar se uma conta está próxima (faltando 10%) 
 *para estourar seu limite.
 * Crie um método para verificar o saldo de uma conta.
 * Crie um método que some o saldo de um número indefinido de contas.
 * Crie um método que liste os dados de cada uma das contas.
 */
public class GerenteDaConta {
	
	public static boolean usoLimite(Conta conta) {
		if(conta.getSaldo() < 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean quaseLimite(Conta conta) {
		if(usoLimite(conta) && ((conta.getSaldo() * -1) > conta.getLimite() * 0.9) ) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double verificarSaldo(Conta conta) {
		return conta.getSaldo();
	}
	
	public static double saldoGeral(Conta... contas) {
		double total = 0;
		for(Conta conta : contas) {
			total += conta.getSaldo();
		}
		
		return total;
	}
	
	public static void dadosContas(Conta... contas) {
		for(Conta conta : contas) {
			System.out.println(conta);
		}
	}
	
	
	
}
