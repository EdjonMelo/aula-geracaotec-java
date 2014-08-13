package util.arraylist.exercicios;

public class Ingrediente {
	private String nome;
	private float quantidade;
	
	// Construtor
	public Ingrediente(String nome, float quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}
	
	// Retorna o nome
	public String getNome() {
		return this.nome;
	}
	
	// Retorna a quantidade
	public float getQuantidade() {
		return this.quantidade;
	}
   
	// Retorna um string no formato "ingrediente (quantidade)"    
	// Por exemplo: "Farinha (4)"
	public String toString() {
		return this.nome + " (" + this.quantidade + ")"; 
	}
}
