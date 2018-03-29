package logincred.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static String driver= "org.h2.Driver";
	private static String url= "jdbc:h2:~/test";
	private static String name= "sa";
	private static String password= "";
	
	private DBConnection() {
		
	}
	
	public static Connection getConnection()
	{
		Connection connection= null;
		
		try {								//load DB driver
			Class.forName("driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {								//get the connection
			connection= DriverManager.getConnection(url, name, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
}
