package testes.exercicios;

public class CaixaEletronico {
	public int[] saque(int valor) throws Exception {
		int[] notas = new int[4];
		
		if(valor % 10 > 0) {
			throw new Exception("O caixa não possui as notas que você deseja");
		}
		
		while(valor != 0) {
			if(valor / 100 > 0) {
				notas[0] = valor / 100;
				valor -= (valor / 100) * 100;
			}
			
			if(valor / 50 > 0) {
				notas[1] = valor / 50;
				valor -= (valor / 50) * 50;
			}
			
			if(valor / 20 > 0) {
				notas[2] = valor / 20;
				valor -= (valor / 20) * 20;
			}
			
			if(valor / 10 > 0) {
				notas[3] = valor / 10;
				valor -= (valor / 10) * 10;
			}
		}
		
		return notas;
	}
}
