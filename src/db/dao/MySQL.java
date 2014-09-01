package db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class MySQL {
	
	protected Connection con;
	
	public MySQL() throws SQLException {
		con = criarConexao();
	}
	
	public static Connection criarConexao() throws SQLException {
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/testes", "root", "");
		return con;
	}
}
