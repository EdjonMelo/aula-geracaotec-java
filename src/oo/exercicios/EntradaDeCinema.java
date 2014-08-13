package oo.exercicios;

import java.text.ParseException;

import oo.date.exercicios.DataMundoReal;

/*
 * 
Escreva uma classe “EntradaDeCinema” com a seguinte estrutura (dados): 
-String DataMundoRealDoFilme
-float horário
-int sala
-float valor 

E com as seguintes ações (métodos):
- Construtor: com a finalidade de inicializar todos os atributos.
- CalculaDesconto: que deve receber como parâmetro a DataMundoReal de nascimento do cliente (do tipo String) e caso seja menor de 12 anos, deve ser dado um desconto de 50% no valor normal.
- CalculaDesconto: que deve receber como parâmetro a DataMundoReal de nascimento do cliente (do tipo String) e o número de sua carteira de estudante (do tipo int). Se o estudante tiver idade entre 12 e 15 anos, deve ser dado um desconto de 40%, de 16 a 20 um desconto de 30% e mais que 20 anos um desconto de 20% no valor normal.
- CalculaDescontoHorário: esse método deve dar um desconto de 10% sobre o valor aferido após todas as outras opções de desconto, caso o horário do filme seja antes das 16 horas.
- toString(): que deve imprimir todos os dados do ingresso.
 */

public class EntradaDeCinema {
	private String DataMundoRealDoFilme;
	private float horario;
	private int sala;
	private float valor;
	
	public EntradaDeCinema(String DataMundoRealDoFilme, float horario, int sala, float valor) {
		this.DataMundoRealDoFilme = DataMundoRealDoFilme;
		this.horario = horario;
		this.sala = sala;
		this.valor = valor;
	}
	
	public void calculaDesconto(String dtNascimento) throws ParseException {
		if(DataMundoReal.diferencaAnos(this.DataMundoRealDoFilme, dtNascimento, 12)) {
			this.valor *= 0.5;
		}
	}
	
	public void calculaDesconto(String dtNascimento, int carteira) throws ParseException {
		boolean algumDesconto = false;
		int[] anos = {13, 14, 15};
		for(int a : anos) {
			if(DataMundoReal.diferencaAnos(this.DataMundoRealDoFilme, dtNascimento, a)) {
				this.valor *= 0.6;
				algumDesconto = true;
				break;
			}
		}
		
		if(!algumDesconto) {
			int[] anos2 = {16, 17, 18, 19, 20};
			for(int a : anos2) {
				if(DataMundoReal.diferencaAnos(this.DataMundoRealDoFilme, dtNascimento, a)) {
					this.valor *= 0.7;
					algumDesconto = true;
					break;
				}
			}
		}
		
		if(!algumDesconto) {
			this.valor *= 0.8;
		}
	}
	
	public void calculaDescontoHorario() {
		if(this.horario < 16) {
			this.valor *= 0.9;
		}
	}
	
	public String toString() {
		calculaDescontoHorario();
		
		String str = "";
		str += this.DataMundoRealDoFilme + "\n";
		str += this.horario + "\n";
		str += this.sala + "\n";
		str += this.valor;
		
		
		return str;
	}
}







