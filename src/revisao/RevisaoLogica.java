package revisao;

public class RevisaoLogica {
public static int potencia(int n){
		return (int) Math.pow(n, 3);
	}
	
	public static double imc(double altura, double peso){
		
		 return peso / Math.pow(altura, 2);
		
	}
	
	public static double multa(double quilos){
		double excesso = 0;
		double multa = 0;
		if(quilos > 50){
			excesso = quilos - 50;
			multa = excesso * 4;
		}
		return multa;
	}

	public static String nadadores(int i) {
		
		if(i >= 5 && i <=7){
			return "Infantil A";
		}else if(i >= 8 && i <=11){
			return "Infantil B";
		}else if(i >= 12 && i <=13){
			return "Juvenil A";
		}else if(i >= 14 && i <=17){
			return "Juvenil B";
		}else if(i >= 18){
			return "Adultos";
		}
		
		return null;
	}

	public static double mongePilantra() {
		
		double quadro = 1;
		double total = 1;
		
		for(int i = 1; i < 64; i++){
			quadro = quadro * 2;
			total = total + quadro;
		}
		
		return total;
	}

	public static int maiores(int ... numeros) {
		int maior = 0;
		
		for(int n : numeros){
			if(n > maior){
				maior = n;
			}
		}
		return maior;
	}
}
