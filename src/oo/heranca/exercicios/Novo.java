package oo.heranca.exercicios;

public class Novo extends Imovel {
	private double valorAdicional;
	
	public Novo(String endereco, double preco, double valorAdicional) {
		super(endereco, (preco + valorAdicional ));
		setValorAdicional(valorAdicional);
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
//	public String toString() {
//		return valorAdicional + "";
//	}
	
	
}
