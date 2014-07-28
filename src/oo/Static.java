package oo;

public class Static {
	public static int numeroObjetos;
	public int contador;
	public static final int VALOR_CONSTANTE = 10;
	
	public Static() {
		numeroObjetos++;
	}
	
	public void addNumObjetos() {
		numeroObjetos++;
	}
	
	public void addContador() {
		contador++;
	}
	
	public static int addConstante(int num) {
		return VALOR_CONSTANTE + num;
		
	}
	
//	public void setValor(int valor) {
//		this.VALOR_CONSTANTE = valor;
//	}
	
	public int getValor() {
		return this.VALOR_CONSTANTE;
	}
	
	
}
