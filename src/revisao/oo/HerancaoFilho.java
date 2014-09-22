package revisao.oo;

public class HerancaoFilho extends HerancaPai {
	
	// Método construtor do Filho fazendo referencia ao Pai
	public HerancaoFilho() {
		super(0);
		super.b = 10;
	}
	
	// Acessando um dado protegido pelo pai
	public int getB() {
		return super.b;
	}
	
	// Acessando um método protegido pelo pai
	public int getA() {
		return super.getA();
		// return super.a não funcionar pois a é privado na HerancaPai
	}
}
