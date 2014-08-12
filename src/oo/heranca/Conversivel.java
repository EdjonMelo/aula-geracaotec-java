package oo.heranca;

public class Conversivel extends Carro {
	private boolean capota;
	
	public boolean isCapota() {
		return capota;
	}

	public void setCapota(boolean capota) {
		this.capota = capota;
	}

	public void abreCapota() {
		this.capota = false;
	}
	
	public void fechaCapota() {
		this.capota = true;
	}
	
	
}
