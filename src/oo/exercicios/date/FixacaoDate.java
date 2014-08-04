package oo.exercicios.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/*
 * 
- Crie uma classe que possui uma lista das datas comemorativas 
do mês de Novembro no Brasil (https://pt.wikipedia.org/wiki/Novembro) 
e imprima cada uma dessas datas no console.

- Entre os anos de 1400 e 2090, adicione todos os anos bissextos 
em uma lista chamada anosBissextos e depois imprima todos os 
valores desta lista. (Utilize um objeto do tipo GregorianCalendar para realizar esta verificação)

- Receba um data no teclado no formato dia/mes/ano e imprima 
no formato ano-mes-dia



 */
public class FixacaoDate {

	public static void main(String[] args) {
//		datasNovembro();
//		imprimeAnosBissextos();
		converteData();
	}
	
	public static void converteData() {
		Scanner k = new Scanner(System.in);
		System.out.print("Digite uma data: ");
		String dtStr = k.next();
		
		SimpleDateFormat dfIn = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dfOut = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			
			Date data = dfIn.parse(dtStr);
			System.out.println(dfOut.format(data));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		k.close();
		
	}
	
	public static void imprimeAnosBissextos() {
		ArrayList<Integer> anosBissextos = new ArrayList<>();
		GregorianCalendar gc = new GregorianCalendar();
		
		for(int ano = 1400; ano <= 2090; ano++) {
			if(gc.isLeapYear(ano)) {
				anosBissextos.add(ano);
			}
		}
		
		for(int ano : anosBissextos) {
			System.out.println(ano);
		}
	}
	
	public static void datasNovembro() {
		ArrayList<DataComemorativa> novembro = new ArrayList<>();
		novembro.add(new DataComemorativa("Dia dos Fiéis Defunto", "02/11"));
		novembro.add(new DataComemorativa("Dia da Bandeira Brasileira", "19/11"));
		novembro.add(new DataComemorativa("Dia da Consciência Negra no Brasil", "20/11"));
		
		for(DataComemorativa data : novembro) {
			System.out.println(data);
		}
	}
}

class DataComemorativa {
	String desc;
	String data;
	
	public DataComemorativa(String desc, String data) {
		this.desc = desc;
		this.data = data;
	}
	
	public String toString() {
		return data + " - " + desc;
	}
}












