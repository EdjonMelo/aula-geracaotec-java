package testes.exercicios;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CaixaEletronicoTest {

	CaixaEletronico caixa;
	
	@Before
	public void setUp() throws Exception {
		caixa = new CaixaEletronico();
	}

	@Test
	public void saqueTrinta() throws Exception {
		int[] resultado = caixa.saque(30);
		assertTrue(resultado[2] == 1);
		assertTrue(resultado[3] == 1);
	}
	
	@Test
	public void saqueOitenta() throws Exception {
		int[] resultado = caixa.saque(80);
		assertTrue(resultado[1] == 1);
		assertTrue(resultado[2] == 1);
		assertTrue(resultado[3] == 1);
	}
	
	@Test
	public void saqueUmDeCada()throws Exception  {
		int[] resultado = caixa.saque(180);
		assertTrue(resultado[0] == 1);
		assertTrue(resultado[1] == 1);
		assertTrue(resultado[2] == 1);
		assertTrue(resultado[3] == 1);
	}
	
	@Test
	public void saqueTodos()throws Exception  {
		for(int j = 10; j < 4000; j+= 10) {
			int[] resultado = caixa.saque(j);
			
			int i = j;
			int resultado100 = i / 100;
			i -= resultado100 * 100;
			assertTrue(resultado[0] == resultado100);
			
			int resultado50 = i / 50;
			i -= resultado50 * 50;
			assertTrue(resultado[1] == resultado50);
			
			int resultado20 = i / 20;
			i -= resultado20 * 20;
			assertTrue(resultado[2] == resultado20);
			
			int resultado10 = i / 10;
			i -= resultado10 * 10;
			assertTrue(resultado[3] == resultado10);
		}
	}
	
//	@Test(expected = Exception.class)
//	public void saqueNotaDeUm() {
//		for(int j = 1; j < 1000; j+= 1) {
//			if(j % 10 > 0) {
//				try {
//					int[] resultado = caixa.saque(j);
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//	}
}

















