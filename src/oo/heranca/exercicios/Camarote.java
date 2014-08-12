package oo.heranca.exercicios;

public class Camarote extends VIP {
	private String localizacao;
	
	public Camarote(double valor, double adicional, String localizacao) {
		super(valor, adicional);
		this.localizacao = localizacao;
	}
	
	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
}
