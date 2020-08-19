package bookstore;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

	static Connection conn;
	
	
	public static Connection getConnection() throws Exception {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/bookstore";
			String username = "";
			String password = "";
			
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");

			return conn;
			
		} catch(Exception e) {
			System.out.println(e);
		}
		
		return null;
	}
	
	public static void connection() {
		try {
			Connection conn = getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

