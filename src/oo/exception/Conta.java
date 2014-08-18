package oo.exception;

/*
 * Desenvolva uma classe chamada Conta:
 * - Ela deve possui um identificador (número inteiro que incrementa 
 * a cada nova conta), um saldo, um limite e um dono (nome String);
 * - Toda conta inicia com saldo 0;
 * - Durante a construção o limite e o Dono desta conta será definido;
 * - Ela possui 2 metodos: debito, credito. O debito nunca podera 
 * ser efetuado se a operacao ultrapassar o limite.
 */
public class Conta {
	private static int numContas;
	private int identificador;
	private double saldo;
	private double limite;
	private String nome;
	
	public Conta(double limite, String nome) {
		numContas++;
		this.identificador = numContas;
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
	
	// "throws" afirma que a função ao ser executada pode gerar uma exception
	// jogano a responsabilidade de tratar a exception para a classe que utilizá-la.
	public void debito(double valor) throws Exception {
		if( (this.saldo + limite) >= valor) {
			this.saldo -= valor;
		} else {
			// o "throw" cria uma nova exception
			// a exception é uma classe que pode ser extendida, portanto você pode criar
			// suas próprias exceptions. 
			throw new Exception("Saldo insuficiente");
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
