package db.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * 
 */
public class HumanoDAOMySQL extends MySQL implements HumanoDAO {

	public HumanoDAOMySQL() throws SQLException {
		super();
	}

	// Verifica se o humano possui ou não um Humano
	public void save(Humano h) throws SQLException {
		if(h.getId() == 0) {
			String insertSQL = "INSERT INTO humanos(nome, peso, altura, morto, nascimento) "
					+ "VALUES(?, ?, ?, ?, ?)";	
			PreparedStatement preparedStatement = con.prepareStatement(insertSQL);
			preparedStatement.setString(1, h.getNome());
			preparedStatement.setDouble(2, h.getPeso());
			preparedStatement.setDouble(3, h.getAltura());
			preparedStatement.setBoolean(4, h.isMorto());
			preparedStatement.setDate(5, new Date(h.getNascimento().getTime()));
			preparedStatement.executeUpdate();
			
		} else {
			String updateSQL = "UPDATE humanos "
					+ "SET nome=?, peso=?, altura=?, morto=?, nascimento=? "
					+ "WHERE id = ?";	
			PreparedStatement preparedStatement = con.prepareStatement(updateSQL);
			preparedStatement.setString(1, h.getNome());
			preparedStatement.setDouble(2, h.getPeso());
			preparedStatement.setDouble(3, h.getAltura());
			preparedStatement.setBoolean(4, h.isMorto());
			preparedStatement.setDate(5, new Date(h.getNascimento().getTime()));
			preparedStatement.setInt(6, h.getId());
			preparedStatement.executeUpdate();
		}
	}

	public void delete(int id) throws SQLException {
		String deleteSQL = "DELETE FROM humanos WHERE id = ?";
		PreparedStatement preparedStatement = con.prepareStatement(deleteSQL);
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
	}

	public List<Humano> list() throws SQLException {
		String selectSQL = "SELECT * FROM humanos";
		// O PreparedStatement permite inserir parametros nas consultas SQL.
		PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
		ResultSet rs = preparedStatement.executeQuery();
		
		List<Humano> lh = new ArrayList<>();
		while (rs.next()) {
			lh.add(populateHumano(rs));
		}
		return lh;
	}

	public List<Humano> search(String nome) throws SQLException {
		String selectSQL = "SELECT * FROM humanos WHERE nome LIKE ?";
		// O PreparedStatement permite inserir parametros nas consultas SQL.
		PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
		preparedStatement.setString(1, "%"+nome+"%");
		ResultSet rs = preparedStatement.executeQuery();
		
		List<Humano> lh = new ArrayList<>();
		while(rs.next()) {
			lh.add(populateHumano(rs));
		}
		return lh;
	}
	
	public Humano find(int id) throws SQLException {
		String selectSQL = "SELECT * FROM humanos WHERE id = ?";
		// O PreparedStatement permite inserir parametros nas consultas SQL.
		PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
		preparedStatement.setInt(1, id);
		ResultSet rs = preparedStatement.executeQuery();
		
		if(rs.next()) {
			Humano h = populateHumano(rs);
			return h;
		}
		return null;
	}
	
	private Humano populateHumano(ResultSet rs) throws SQLException {
		Humano h = new Humano();
		h.setId(rs.getInt("id"));
		h.setNome(rs.getString("nome"));
		h.setPeso(rs.getDouble("peso"));
		h.setAltura(rs.getDouble("altura"));
		h.setNascimento(rs.getDate("nascimento"));
		return h;
	}

}
