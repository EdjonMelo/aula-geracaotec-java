package testes.db;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import db.Conexao;
import db.InsercaoDeDados;

public class InsercaoTest {

	private static Connection con;
	private Autor autor;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		con = Conexao.criarConexao("testes");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		con = null;
	}

	@Before
	public void setUp() throws Exception {
		autor = new Autor("Nassor", "Brasil");
	}

	@Test
	public void insert() throws SQLException {
		InsercaoDeDados.addAutor(con, autor.getNome(), autor.getPais());
		assertEquals("Nassor", InsercaoDeDados.findByName(con, "Nassor").getNome());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
