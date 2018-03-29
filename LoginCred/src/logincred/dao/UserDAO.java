package logincred.dao;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class UserDAO {

	public boolean isValid(String id, String password){
		Connection con= DBConnection.getConnection(); //get DB connection
		//select * from user where id=102 and password='Pratik'
		//String query= "select * from user where id="+id+"and password="+password;
		
		Statement statement;
		try { //Statement- static query ie without where condition
			//statement = con.createStatement();
			//ResultSet rs= statement.executeQuery(query);
			PreparedStatement pSt=con.prepareStatement("select * from user where id=? and password=?");
			pSt.setString(1, id);
			pSt.setString(2, password);
			ResultSet rs= pSt.executeQuery();
			
			if(rs.next()) //to check if id & password are correct or not
				return true;
			else
				return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
