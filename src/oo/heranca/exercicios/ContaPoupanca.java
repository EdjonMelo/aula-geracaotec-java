package oo.heranca.exercicios;

import oo.estatico.exercicios.Conta;

public class ContaPoupanca extends Conta {
	private double rendimentos;
	
	public ContaPoupanca(double limite, String nome) {
		super(limite, nome);
		setRendimentos(0.0056);
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}
	
	
}
