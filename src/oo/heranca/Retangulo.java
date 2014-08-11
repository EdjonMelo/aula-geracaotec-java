package oo.heranca;

public class Retangulo extends Forma {
	public Retangulo(int altura, int largura) {
		setAltura(altura);
		setLargura(largura);
	}
	
	public int area() {
		return super.getAltura() * super.getLargura();
	}
	
	public double diagonal() {
		// diagonal do retangulo é: raiz quadrada da soma dos lados ao quadrado
		return Math.sqrt(Math.pow(getAltura(), 2) + Math.pow(getLargura(), 2));
	}
	
	public int perimetro() {
		return (getAltura() + getLargura()) * 2;
	}
}
