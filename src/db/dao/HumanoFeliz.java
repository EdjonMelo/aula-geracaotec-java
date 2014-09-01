package db.dao;

import java.sql.SQLException;
import java.util.List;

// execute no console da base doc/mysql/humano.sql antes de começar a executar.
public class HumanoFeliz {
	public static void main(String[] args) throws SQLException {
//		insertData();
//		retrieveData();
		deleteData();
	}
	
	public static void retrieveData() throws SQLException {
		List<Humano> lh;
		HumanoDAOMySQL humanoDao = new HumanoDAOMySQL();
		
		System.out.println("List:");
		lh = humanoDao.list();
		for(Humano h : lh) {
			System.out.println(h);
		}
		System.out.println("\n");
		
		System.out.println("Search:");
		lh = humanoDao.search("ano");
		for(Humano h : lh) {
			System.out.println(h);
		}
		System.out.println("\n");
		
		System.out.println("Find:");
		System.out.println(humanoDao.find(2));
		System.out.println("\n");
	}
	
	public static void deleteData() throws SQLException {
		List<Humano> lh;
		HumanoDAOMySQL humanoDao = new HumanoDAOMySQL();
		
		lh = humanoDao.list();
		for(Humano h : lh) {
			humanoDao.delete(h.getId());
		}
	}
	
	public static void insertData() throws SQLException {
		HumanoDAOMySQL humanoDao = new HumanoDAOMySQL();
		Humano nassor = new Humano("Nassor", 110.5, 1.9, false);
		humanoDao.save(nassor); // insert
		
		nassor.setId(1);
		nassor.setNome("Nassor Paulino da Silva");
		humanoDao.save(nassor); // update
		
		humanoDao.save(new Humano("Cicrano", 210.5, 1.3, true));
		humanoDao.save(new Humano("Fuluano", 60.5, 1.6, true));
		humanoDao.save(new Humano("Beltrano", 80.5, 1.83, true));
	}
}
