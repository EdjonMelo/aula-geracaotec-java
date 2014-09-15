package testes.exercicios;

public class FizzBuzz {
	
	public static String resultado(int i) throws Exception {
		if(i < 1 || i > 100) {
			throw new Exception("Fora do intervalo");
		}
		
		if(i % 3 == 0 && i % 5 == 0) {
			return "FizzBuzz";
		}
		
		if(i % 3 == 0) {
			return "Fizz";
		}
		
		if(i % 5 == 0) {
			return "Buzz";
		}
		
		return String.valueOf(i);
	}
	
}
