package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
	static Connection conn=null;
	public static Connection doConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_oop","root","");
		return conn;
	}
	

	
	public static void main(String[] args) {
		try {
			System.out.println(db.doConnection());
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
	}



	public static void db_insert(String name, String phoneNo, String username, String password) {
		// TODO Auto-generated method stub
		
	}
}