package db.dao;

import java.util.Date;

public class Humano {
	
	private int id;
	private String nome;
	private double peso;
	private double altura;
	private boolean morto;
	private Date nascimento;
	
	public Humano() {}
	public Humano(String nome, double peso, double altura, boolean morto) {
		setNome(nome);
		setPeso(peso);
		setAltura(altura);
		setMorto(morto);
		setNascimento(new Date());
	}
	
	public String toString() {
		return nome + " | " + peso + " | " + altura; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isMorto() {
		return this.morto;
	}
	
	public void setMorto(boolean morto) {
		this.morto = morto;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

}
