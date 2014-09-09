package teste;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import testes.MontanhaRussa;

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
	public void TestRecebePassageiros() {
		assertEquals(true, mr.recebePassageiros(10));
		assertEquals(false, mr.recebePassageiros(mr.getLugares()+1));
	}
	
	@Test
	public void TestMovimenta() {
		mr.movimenta(0);
		assertEquals(true, mr.getVelocidadeAtual() == 0);
		
		mr.movimenta(100);
		assertEquals(true, mr.getVelocidadeAtual() == 100);
		
		mr.movimenta(mr.getVelocidadeMaxima()+Float.MIN_VALUE);
		assertEquals(true, mr.getVelocidadeAtual() == mr.getVelocidadeMaxima());
		
		mr.movimenta(-100);
		assertEquals(true, mr.getVelocidadeAtual() == 0);
	}
	

}





