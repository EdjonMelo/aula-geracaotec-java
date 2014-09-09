package testes;

public class MontanhaRussa {
	private int lugares;
	private float velocidadeMaxima;
	private float velocidadeAtual;
	private float comprimento;
	private float posicaoAtual;
	private int loopings;
	
	public boolean recebePassageiros(int lugaresAOcupar) {
		if(this.lugares > lugaresAOcupar) {
			this.lugares = lugaresAOcupar;
			return true;
		} else {
			return false;
		}
	}
	
	public void acelera(float velocidade) {
		if(velocidade > this.velocidadeMaxima) {
			this.velocidadeAtual = this.velocidadeMaxima;
		} else if (velocidade < 0) {
			this.velocidadeAtual = 0;
		} else {
			this.velocidadeAtual = velocidade;
		}		
	}
	
	public float getPosicaoAtual() {
		return posicaoAtual;
	}

	public void setPosicaoAtual(float posicaoAtual) {
		if(posicaoAtual >= this.getComprimento()) {
			this.posicaoAtual = 0;
		} else {
			this.posicaoAtual = posicaoAtual;
		}
		
	}

	public void setVelocidadeAtual(float velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public float getVelocidadeAtual() {
		return this.velocidadeAtual;
	}

	public int getLugares() {
		return lugares;
	}

	public void setLugares(int lugares) {
		this.lugares = lugares;
	}

	public float getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(float velocidade) {
		this.velocidadeMaxima = velocidade;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public int getLoopings() {
		return loopings;
	}

	public void setLoopings(int loopings) {
		this.loopings = loopings;
	}	
}
