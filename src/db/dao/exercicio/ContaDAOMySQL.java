package db.dao.exercicio;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.dao.MySQL;

/*
 * CREATE TABLE contas (
 * 	id int unsigned NOT NULL auto_increment,
 * 	saldo double NOT NULL,
 *  limite double,
 *  nome VARCHAR(255),
 *  PRIMARY KEY(id)
 * );
 */
public class ContaDAOMySQL extends MySQL implements ContaDAO {

	public ContaDAOMySQL() throws SQLException {
		super();
	}

	public void save(Conta c) throws SQLException {
		if (c.getIdentificador() == 0) {
			String insertSQL = "INSERT INTO contas(saldo, limite, nome) "
					+ "VALUES(?, ?, ?)";
			PreparedStatement preparedStatement = con
					.prepareStatement(insertSQL);
			preparedStatement.setDouble(1, c.getSaldo());
			preparedStatement.setDouble(2, c.getLimite());
			preparedStatement.setString(3, c.getNome());
			preparedStatement.executeUpdate();
		} else {
			String updateSQL = "UPDATE contas SET saldo=?, limite=?, nome=? "
					+ "WHERE id = ?";
			PreparedStatement preparedStatement = con
					.prepareStatement(updateSQL);
			preparedStatement.setDouble(1, c.getSaldo());
			preparedStatement.setDouble(2, c.getLimite());
			preparedStatement.setString(3, c.getNome());
			preparedStatement.setInt(4, c.getIdentificador());
			preparedStatement.executeUpdate();
		}
	}

	public void delete(int id) throws SQLException {
		String deleteSQL = "DELETE FROM contas WHERE id = ?";
		PreparedStatement preparedStatement = con.prepareStatement(deleteSQL);
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
	}

	@Override
	public List<Conta> list() throws SQLException {
		String selectSQL = "SELECT * FROM contas";
		PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
		ResultSet rs = preparedStatement.executeQuery();

		List<Conta> lc = new ArrayList<>();
		while (rs.next()) {
			lc.add(new Conta(rs.getInt("id"), rs.getDouble("saldo"), rs
					.getDouble("limite"), rs.getString("nome")));
		}

		return lc;
	}

	public Conta find(int id) throws SQLException {
		String selectSQL = "SELECT * FROM contas WHERE id = ?";
		PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
		preparedStatement.setInt(1, id);
		ResultSet rs = preparedStatement.executeQuery();

		if (rs.next()) {
			return new Conta(rs.getInt("id"), rs.getDouble("saldo"),
					rs.getDouble("limite"), rs.getString("nome"));
		}

		return null;

	}

}
