package oo.heranca.exercicios;

public class Velho extends Imovel {
	private double valorReduzido;
	
	public Velho(String endereco, double preco, double valorReduzido) {
		super(endereco, (preco - valorReduzido ));
		setValorReduzido(valorReduzido);
	}

	public double getValorReduzido() {
		return valorReduzido;
	}

	public void setValorReduzido(double valorReduzido) {
		this.valorReduzido = valorReduzido;
	}
	
//	public String toString() {
//		return valorReduzido + "";
//	}
}
