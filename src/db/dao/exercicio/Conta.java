package db.dao.exercicio;

public class Conta {
	private int identificador;
	private double saldo;
	private double limite;
	private String nome;
	
	public Conta(double limite, String nome) {
		this.saldo = 0;
		this.limite = limite;
		this.nome = nome;
	}
	
	public Conta(int identificador, double saldo, double limite, String nome) {
		this.identificador = identificador;
		this.saldo = 0;
		this.limite = limite;
		this.nome = nome;
	}
	
	public String toString() {
		String str = "";
		str += "Id: " + identificador;
		str += "\nNome: " + nome;
		str += "\nSaldo: " + saldo;
		str += "\nLimite: " + limite + "\n";
		
		return str;
	}
	
	public void credito(double valor) {
		this.saldo += valor;
	}
	
	public void debito(double valor) {
		if( (this.saldo + limite) >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Pobre, vai codar!!");
		}
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public String getNome() {
		return nome;
	}
}
