package modelo.factorymethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import modelo.builder.Nivel;
import modelo.prototype.AptoImpl;

public class AptoDAO {
	private IDBAdapter dbAdapter;
	public AptoDAO() {
		dbAdapter= DBFactory.getDefaultDBAdapter();
	}
	public List<AptoImpl> finAllNiveles(){
		Connection connection = dbAdapter.getConnection();
		List<AptoImpl> AptoList = new ArrayList<>();
		try {
			PreparedStatement statement= connection.prepareStatement("SELECT idnivel"+ "FROM Torre");
			ResultSet results = statement.executeQuery();
			while(results.next()) {
				AptoList.add(new AptoImpl());	
			}
			return AptoList;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally {
			try {
				connection.close();
			}catch (Exception e) {}
		}	
	}
	public boolean saveNivel(Nivel nivel, int idTorre) {
		Connection connection = dbAdapter.getConnection();
		try {
			PreparedStatement statement= connection.prepareStatement("INSERT INTO Nivel(Torre_idTorre) Values(?)");
			statement.setInt(1,idTorre);
			statement.executeUpdate();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			try {
				connection.close();
			}catch (Exception e) {}
				
			}
		}

}
