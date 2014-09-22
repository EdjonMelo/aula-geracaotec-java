package revisao.oo;

public class Estatico {

	// Atributo estático, o seu valor é igual entre todas as instancias 
	// da classe Estatico.
	public static int a;
	
	// Atributo normal
	public int b;
	
	// Método estático, permite ser acessado sem a necessidade de instanciar
	// um objeto.
	public static int getA() {
		return a;
	}
	
	// Um método estático não consegue referenciar atributos da classe que 
	// não sejam estáticos também.
//	public static int getB() {
//		return b;
//	}
}
