package oo.heranca;

public abstract class Carro {
	private int portas;
	private int rodas;
	private int lugares;
	private String cor;
	private float capacidadeCombustivel;
	private String tipoCombustivel;
	
	public void dirigir() {
		
	}
	
	public void estacionar(){
		
	}
	
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public int getRodas() {
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	public int getLugares() {
		return lugares;
	}
	public void setLugares(int lugares) {
		this.lugares = lugares;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}
	public void setCapacidadeCombustivel(float capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	
}
