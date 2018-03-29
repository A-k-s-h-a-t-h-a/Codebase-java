package logincred.dao;

public class TestDBConnection {

	public static void main(String[] args) {
		if (DBConnection.getConnection() ==null)
			System.out.println("Could not establish connection");
		else
			System.out.println("Successfully connected to database");
	}
}
