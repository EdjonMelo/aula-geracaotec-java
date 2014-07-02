package oo.jogo;

public class Heroi {
	String nome;
	int posicao, vida;
	double ataque, defesa;
	boolean velocidadeDobrada;
	
	public Heroi(String nome, int posicao, int vida, double ataque, double defesa) {
		this.nome = nome;
		this.posicao = posicao;
		this.vida = vida;
		this.ataque = ataque;
		this.defesa = defesa;
		this.velocidadeDobrada = false;
	}
	
	public void ataca(Heroi inimigo) {
		int dano = (int) (this.ataque - inimigo.getDefesa());
		if(dano > 0) {
			inimigo.setVida(inimigo.getVida() - dano);
		} else {
			inimigo.setVida(inimigo.getVida() - 1);
		}
	}
	
	public void tomarPocaoVelocidade() {
		this.velocidadeDobrada = true;
	}
	
	public void tomarPocaoVida() {
		this.vida += 10;
	}
	
	public void caminha() {
		this.posicao += (velocidadeDobrada ?  30 : 15 );
		System.out.println("O heroi " + this.getNome() + " caminhou.");
	}
	
	public void corre() {
		this.posicao += (velocidadeDobrada ?  300 : 150);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public double getAtaque() {
		return ataque;
	}
	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}
	public double getDefesa() {
		return defesa;
	}
	public void setDefesa(double defesa) {
		this.defesa = defesa;
	}

}
