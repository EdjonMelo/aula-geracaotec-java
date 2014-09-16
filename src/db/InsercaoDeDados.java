package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import testes.db.Autor;

public class InsercaoDeDados {

	public static void main(String[] args) throws SQLException {
		Connection con = Conexao.criarConexao();
		addAutor(con, "Nassor Paulino da Silva", "Brasil");
		addAutor(con, "John Boyne", "Irlanda");
	}

	public static void addAutor(Connection con, String autor, String pais) throws SQLException {
		// SQL para inserir valores
		String insertSQL = "INSERT INTO autores(nome, pais) VALUES(?, ?)";

		PreparedStatement preparedStatement = con.prepareStatement(insertSQL);
		preparedStatement.setString(1, autor);
		preparedStatement.setString(2, pais);
		preparedStatement.executeUpdate();
	}
	
	public static Autor findByName(Connection con, String nome) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM autores WHERE nome = ?");
		preparedStatement.setString(1, nome);
		ResultSet rs = preparedStatement.executeQuery();
		
		if (rs.next()) { // enquanto houver linhas de resultado, mover para a próxima.
			Autor autor = new Autor(
				rs.getString("nome"),
				rs.getString("pais")
			);
			return autor;
		}
		
		return null;
	}

//	// Criando conexão com a base de dados
//	public static Connection criarConexao() throws SQLException {
//		Connection con = DriverManager.getConnection(
//				"jdbc:mysql://localhost:3306/testes", "root", "");
//		return con;
//	}

}
