package util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataMundoReal {
	public static boolean diferencaAnos(String comparador, String aComparar, int limiteAnos) throws ParseException {
		// Definindo quanto tempo tem a diferença em anos
		Calendar dtComparador = new GregorianCalendar();
		Calendar dtAComparar = new GregorianCalendar();
		
		// Criando um formatador de datas no formato padrão brasileiro
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		// Transformando as duas datas String em datas de "verdade"
		dtComparador.setTime(df.parse(comparador));
		dtAComparar.setTime(df.parse(aComparar));
		
		// Adicionando anos a data a comparar
		dtAComparar.add(Calendar.YEAR, limiteAnos);
		
		// Transformando datas em "longs" e comparando quais delas são maiores ou menores
		if(dtAComparar.getTimeInMillis() > dtComparador.getTimeInMillis()) {
			return false;
		}
		
		return true;
	}
}
