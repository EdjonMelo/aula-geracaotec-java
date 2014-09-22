package revisao.oo;

// Classe abstrata não pode ser instanciada, apesar de poder possuir 
// atributos e métodos próprios.
public abstract class HerancaPai {
	// apenas visivel dentro da classe abstrada
	private int a;
	
	// privado para classes que não fazem parte da herança,
	// público para os filhos.
	protected int b;
	
	// Uma vez que eu defino o método construtor sou obrigado a chamá-lo
	// durante a construção das classes filhos.
	public HerancaPai(int a) {
		this.a = a;
		this.b = 0;
	}
	
	protected int getA() {
		return this.a;
	}
}
