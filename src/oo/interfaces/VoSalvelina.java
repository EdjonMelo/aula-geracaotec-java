package oo.interfaces;

import java.util.ArrayList;
import java.util.List;

public class VoSalvelina {

	public static void main(String[] args) {
		List<Automovel> auto = new ArrayList<>();
		auto.add(new Carro());
		auto.add(new Carrinho());
		auto.add(new Carro());
		auto.add(new Carrinho());
		auto.add(new Carro());
		auto.add(new Carro());
		auto.add(new Carrinho());
		auto.add(new Carrinho());
		auto.add(new Carrinho());
		
		for(Automovel a: auto) {
			a.dirigir();
		}

	}

}
