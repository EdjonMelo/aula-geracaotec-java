package util.date.trabalho;

import java.util.Date;

public class TestaAgenda {
	public static void main(String[] args) {
		Agenda ag = new Agenda();
		
		Compromisso c1 = new Compromisso(new Date(), "mimimi", "lalala");
		Compromisso c2 = new Compromisso(new Date(2014, 7, 20), "asdasd", "ewqeqw");
		
		ag.addCompromisso(c1);
		ag.addCompromisso(c2);
		ag.addCompromisso(new Compromisso(new Date(), "1919191", "asda34234"));
		
//		for(Compromisso c : ag.getCompromissos()) {
//			System.out.println(c);
//		}
		
		ag.compromissosMes(8);
	}
}
