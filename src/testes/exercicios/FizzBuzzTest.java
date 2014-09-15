package testes.exercicios;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	
	@Test(expected = Exception.class)
	public void testarLimiteAbaixo() throws Exception {
		FizzBuzz.resultado(0);
	}
	
	@Test(expected = Exception.class)
	public void testarLimiteAcima() throws Exception {
		FizzBuzz.resultado(101);
	}

	@Test
	public void divisivelPorTres() throws Exception {
		assertEquals("Fizz", FizzBuzz.resultado(3));
		assertEquals("Fizz", FizzBuzz.resultado(6));
		assertEquals("Fizz", FizzBuzz.resultado(9));
		assertEquals("Fizz", FizzBuzz.resultado(12));
		assertEquals("Fizz", FizzBuzz.resultado(99));
	}
	
	@Test 
	public void divisivelPorCinco() throws Exception {
		assertEquals("Buzz", FizzBuzz.resultado(5));
		assertEquals("Buzz", FizzBuzz.resultado(10));
	}
	
	@Test
	public void divisivelPorTresECinco() throws Exception {
		assertEquals("FizzBuzz", FizzBuzz.resultado(15));
		assertEquals("FizzBuzz", FizzBuzz.resultado(30));
	}
	
	@Test
	public void naoDivisivel() throws Exception {
		assertEquals("1", FizzBuzz.resultado(1));
		assertEquals("4", FizzBuzz.resultado(4));
		assertEquals("98", FizzBuzz.resultado(98));
	}

}
