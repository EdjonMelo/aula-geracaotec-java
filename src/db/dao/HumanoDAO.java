package db.dao;

import java.sql.SQLException;
import java.util.List;

/* O Data Access Object ou DAO é um padrão de projeto que realiza uma tradução entre
 * dois mundos. Nesta aula em específico em relação às nossas classes java e o banco
 * de dados.
 * 
 * Para garantir que todos os métodos serão implementados, foi criada uma interface 
 * HumanoDAO que irá garantir os métodos de inserção, remoção e aquisição dos dados.
 */

public interface HumanoDAO {
	public void save(Humano h) throws SQLException;
	public void delete(int id) throws SQLException;
	public List<Humano> list() throws SQLException;
	public List<Humano> search(String nome) throws SQLException;
	public Humano find(int id) throws SQLException;
}
