package oo;

public class ExemploStatic {

	public static void main(String[] args) {
		Static s1 = new Static();
		System.out.println(s1.numeroObjetos);
		System.out.println(s1.contador);
		
		Static s2 = new Static();
		s2.addContador();
		System.out.println(s2.contador);
		
		
		s1.addNumObjetos();
		s1.addNumObjetos();
		s2.addNumObjetos();
		

		System.out.println(s1.numeroObjetos);
		System.out.println(s2.numeroObjetos);
		
		System.out.println(s1.VALOR_CONSTANTE);
		System.out.println(Static.addConstante(10));
	}

}
