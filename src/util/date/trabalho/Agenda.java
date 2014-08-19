package util.date.trabalho;

import java.util.ArrayList;
import java.util.Date;

public class Agenda {
	private ArrayList<Compromisso> compromissos;
	
	public Agenda() {
		compromissos = new ArrayList<>();
	}
	
	public void compromissosMes(int mes) {
		for(Compromisso compromissoAgenda: this.compromissos) {
			if(compromissoAgenda.getMesCompromisso().equals(String.valueOf(mes))) {
				System.out.println(compromissoAgenda);
			}
		}
	}
	
	public void addCompromisso(Compromisso compromisso) {
		boolean dataDisponivel = true;
		for(Compromisso compromissoAgenda: this.compromissos) {
			if(compromissoAgenda.getDataString().equals(compromisso.getDataString())) {
				dataDisponivel = false;
				break;
			}
		}
		
		if(dataDisponivel) {
			compromissos.add(compromisso);
		} else {
			System.out.println("Já há compromisso neste dia");
		}
	}
	
	public ArrayList<Compromisso> getCompromissos() {
		return compromissos;
	}
	
	
}
