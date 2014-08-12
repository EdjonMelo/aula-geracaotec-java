package oo.heranca;

import java.util.ArrayList;

public class Estacionamento {
	public static void main(String[] args) {
		ArrayList<Carro> estacionados = new ArrayList<>();
		
		Caminhonete cmUm = new Caminhonete();
		cmUm.setCargaCacamba(40.2f);
		Carro cmDois = new Caminhonete();
		
		estacionados.add(cmUm);
		estacionados.add(cmDois);
		estacionados.add(new Conversivel());
		
		Caminhonete cmt = (Caminhonete) estacionados.get(0);
		System.out.println(cmt.getCargaCacamba());
		
		// Reordenar todos os carros;
		for(Carro c : estacionados) {
			c.dirigir();
		}
	}
}
