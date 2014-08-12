package oo.heranca.exercicios;

public class Imovel {
	private String endereco;
	private double preco;
	
	public Imovel(String endereco, double preco) {
		setEndereco(endereco);
		setPreco(preco);
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String toString() {
		return getPreco() + "";
	}
	
	
}
