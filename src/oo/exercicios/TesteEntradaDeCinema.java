package oo.exercicios;

import java.text.ParseException;

public class TesteEntradaDeCinema {

	public static void main(String[] args) {
		try {
			EntradaDeCinema pokemon = new EntradaDeCinema("03/07/2000", 17.00f,
					1, 15.00f);
			pokemon.calculaDesconto("04/07/1988");
			System.out.println(pokemon);

			EntradaDeCinema oProcurado = new EntradaDeCinema("03/07/2014",
					13.00f, 5, 10.00f);
			oProcurado.calculaDesconto("03/07/2000", 11233);
			System.out.println(oProcurado);
			
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
	}

}
