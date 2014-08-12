package oo.heranca.exercicios;

import oo.exercicios.estatico.Conta;

public class ContaCorrente extends Conta {
	private double taxaMensal;
	
	public ContaCorrente(double limite, String nome) {
		super(limite, nome);
		setTaxaMensal(9);
	}
	
	public ContaCorrente(double limite, String nome, double taxaMensal) {
		super(limite, nome);
		setTaxaMensal(taxaMensal);
	}

	public double getTaxaMensal() {
		return taxaMensal;
	}

	public void setTaxaMensal(double taxaMensal) {
		this.taxaMensal = taxaMensal;
	}
	
}
