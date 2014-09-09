package teste;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import testes.MontanhaRussa;

/*
 * Nossa montanha russa:
 * x se move para frente, acelera
 * x possui um limite de velocidade
 * x se locomove em cima do trilho
 * x recebe um número limitado de pessoas
 * x funciona por um tempo determinado (uma volta)
 * 
 */
public class MontanhaRussaTest {
	MontanhaRussa mr;
	
	@Before
	public void setUp() throws Exception {
		mr = new MontanhaRussa();
		mr.setComprimento(1000);
		mr.setLoopings(14);
		mr.setLugares(20);
		mr.setVelocidadeMaxima(260.4f);
	}
	
	@Test
	public void TestTempoDeterminado() {
		mr.setPosicaoAtual(mr.getComprimento());
		assertTrue(mr.getPosicaoAtual() == 0);
		
		mr.setPosicaoAtual(mr.getComprimento() + 1);
		assertTrue(mr.getPosicaoAtual() == 0);
	}
	
	@Test
	public void TestSetPosicao() {
		mr.setPosicaoAtual(0);
		assertTrue(mr.getPosicaoAtual() == 0);
		
		mr.setPosicaoAtual(mr.getComprimento() - 1);
		assertTrue(mr.getPosicaoAtual() == 999);
	}
	
	@Test
	public void TestRecebePassageiros() {
		assertEquals(true, mr.recebePassageiros(10));
		assertEquals(false, mr.recebePassageiros(mr.getLugares()+1));
	}
	
	@Test
	public void TestAcelear() {
		mr.acelera(0);
		assertTrue(mr.getVelocidadeAtual() == 0);
		
		mr.acelera(100);
		assertTrue(mr.getVelocidadeAtual() == 100);
		
		mr.acelera(mr.getVelocidadeMaxima()+0.00000001f);
		assertTrue(mr.getVelocidadeAtual() == mr.getVelocidadeMaxima());
		
		mr.acelera(mr.getVelocidadeMaxima()+Float.MIN_VALUE);
		assertTrue(mr.getVelocidadeAtual() == mr.getVelocidadeMaxima());
		
		mr.acelera(-100);
		assertEquals(true, mr.getVelocidadeAtual() == 0);
	}
	

}





