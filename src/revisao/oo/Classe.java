package revisao.oo;

import java.util.ArrayList;

//definindo uma classe, nome sempre em maísculo
public class Classe {
	
	// definindo um atributo privado da classe (apenas a classe consegue
    // enxerga-lo. Nome de atributos sempre se iniciam com letra minúscula.
	private int a; 
	
	// definindo um atributo publico, qualquer um que possuir uma 
    // instância de Classe pode pode alterar ou modifica-lo.
	public String b;
	
	// definindo um atributo protegido, apenas a classe e suas filhas
	// possuem acesso a este dados.
	protected float c;
	
	// ------------------
	
	// Construtores definem como a classe será montada durante a sua
	// "instanciação". Eles não possuem tipo de retorno e seus nomes
	// são os mesmos que a da própria classe.
	public Classe() {
		this.a = 0;
		b = null;
		c = 0.0f;
	}
	
	// Tem como principal função configurar os dados dos atributos do
	// objeto corretamente durante a "instanciação".
	public Classe(int a, String b, String c) {
		setA(a);
		this.b = b;
		this.c = Float.parseFloat(c);
	}
	
	// ------------------

	// Métodos de acesso ao atributo 'a': retorna o valor de a;
	public int getA() {
		return a;
	}

	// Método de acesso ao atributo 'a': altera o valor de a;
	public void setA(int a) {
		this.a = a;
	}
	
	// ------------------
	// Métodos executam frações de código.
	
	// Quando tem o tipo de retorno "void" eles não retornam nenhum 
	// ao programa que programa que os "chamou". 
	public void executarAlgoSemRetornar() {
		System.out.println("executei, pronto, acabou");
	}
	
	// Quando possuem qualquer coisa no lugar do void eles retornam
	// nenhum este dado ao final do programa utilizando a palavra-chave
	// 'return'
	public String executarAlgoComRetorno() {
		System.out.println("executei, pronto... ");
		return "... agora o retorno esta String";
	}
	
	// Parametros, são os dados que são repassados para o métodos
	// eles só existem durante a existência do mesmo.
	public double executarAlgoComRetornoParteDois(double a, double b) {
		// cálculo super complexo.
		return a+b;
	}
	
	// Eles pode parecer bem "tensos", mas todos seguem o mesmo padrão.
	// Tipo de Acesso: public
	// Tipo de Retono: ArrayList<Integer>, um array variável de tipo Inteiro.
	// Nome do Método: executarAlgoComRetornoParteDois
	// Parametros: - um inteiro chamado multiplicador
	//             - uma lista variada de inteiros
	public ArrayList<Integer> executarAlgoComRetornoParteDois(int multiplicador, int... listaInt) {
		ArrayList<Integer> listaMultiplicada = new ArrayList<Integer>();
		for(int i: listaInt) {
			// adicionando numero multiplicado a lista
			listaMultiplicada.add(i * multiplicador);
		}
		return listaMultiplicada;
	}
}
