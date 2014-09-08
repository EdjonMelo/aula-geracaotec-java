package db.dao.exercicio;

import java.sql.SQLException;
import java.util.List;

public interface ContaDAO {
	public void save(Conta c) throws SQLException;
	public void delete(int id) throws SQLException;
	public List<Conta> list() throws SQLException;
	public Conta find(int id) throws SQLException;
}
