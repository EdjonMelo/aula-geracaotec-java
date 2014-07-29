package oo.exercicios.estatico;

import java.util.ArrayList;

public class Agencia {
//	Conta[] contas;
	private ArrayList<Conta> contas = new ArrayList<>(40);
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public void removerConta(Conta conta) {
		contas.remove(conta);
	}
	
	public void removerConta(int index) {
		contas.remove(index);
	}
	
	/* Criem métodos da agecia que:
	 * 
	 * 1 - Encontrem uma conta pelo número identificador da conta. 
	 * E a retornem (conta).
	 * 
	 * 2 - Removam uma conta pelo número identificador.
	 * 
	 * 3 - Encontrem uma conta pelo nome do seu dono.
	 * 
	 * 4 - Crie um método que cobre a taxa administativa de 
	 * R$10,00 para cada uma das contas
	 */
	
	
	public void exemplos() {
		Conta c1 = new Conta(100, "Nassor");
		Conta c2 = new Conta(100000000, "Um cara ricooooo");
		
		contas.add(c1);
		contas.add(c2);
		contas.add(new Conta(3000, "Mimimi"));
		
		Conta[] contasArray = (Conta[]) contas.toArray();
		
		/*
		 * for(int i = 0; i < contas.size(); i++) {
		 *    Conta conta = contas.get(i);
		 *    System.out.println(conta);
		 * }
		 */
		for(Conta conta: contas) {
			if(conta.getIdentificador() == 1) {
				System.out.println(conta);
			}
		}
		
		Conta c3 = contas.get(2);
		System.out.println(c3);
		System.out.println(contas.get(1));
		
		// Remover
		System.out.println(contas.size());
		contas.remove(0);
		contas.remove(0);
//		contas.clear(); // Remove todos os elementos do ArrayList
		System.out.println(contas.size());
		
		System.out.println(contas.get(0));
	}
}
