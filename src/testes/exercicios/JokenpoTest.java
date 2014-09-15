package testes.exercicios;

import static org.junit.Assert.*;

import org.junit.Test;

public class JokenpoTest {

	@Test
	public void pedra() throws Exception {
		assertEquals("empate", Jokenpo.jogar("pedra", "pedra"));
		assertEquals("vitoria", Jokenpo.jogar("pedra", "tesoura"));
		assertEquals("derrota", Jokenpo.jogar("pedra", "papel"));
	}
	
	@Test public void tesoura() throws Exception {
		assertEquals("empate", Jokenpo.jogar("tesoura", "tesoura"));
		assertEquals("vitoria", Jokenpo.jogar("tesoura", "papel"));
		assertEquals("derrota", Jokenpo.jogar("tesoura", "pedra"));
	}
	
	@Test public void papel() throws Exception {
		assertEquals("empate", Jokenpo.jogar("papel", "papel"));
		assertEquals("vitoria", Jokenpo.jogar("papel", "pedra"));
		assertEquals("derrota", Jokenpo.jogar("papel", "tesoura"));
	}
	
	@Test(expected = Exception.class)
	public void erroTodos() throws Exception {
		Jokenpo.jogar("raio", "trovao");
	}
	
	@Test(expected = Exception.class)
	public void erroVc() throws Exception {
		Jokenpo.jogar("papel", "vaca");
	}
	
	@Test(expected = Exception.class)
	public void erroEu() throws Exception {
		Jokenpo.jogar("cogumelo", "papel");
	}

}















