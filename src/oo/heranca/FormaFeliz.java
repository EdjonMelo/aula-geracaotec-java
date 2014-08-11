package oo.heranca;

public class FormaFeliz {

	public static void main(String[] args) {
		
		Quadrado quad = new Quadrado(40);
		System.out.println(quad.area());
		System.out.println(quad.diagonal());
		System.out.println(quad.perimetro());
		
		Retangulo rect = new Retangulo(40, 40);
		System.out.println(rect.area());
		System.out.println(rect.diagonal());
		System.out.println(rect.perimetro());
		
	}

}
