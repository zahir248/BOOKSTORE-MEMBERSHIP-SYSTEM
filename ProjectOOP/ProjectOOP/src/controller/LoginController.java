package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import view.StaffSignUp;
import database.db;
import view.Login;
import model.Staff;

public class LoginController {
	
	private static Staff staff;
	
	public LoginController(Staff staff) {
		super();
		this.staff = staff;
	}

	public LoginController() {
		
	}
	
	public static String login() throws ClassNotFoundException, SQLException {
		String success = "0";
		
		String sql = "select username, password from staff where username = ? and password = ?";
		Connection conn = db.doConnection();
		PreparedStatement preparedStatement =  conn.prepareStatement(sql);
		
		preparedStatement.setString(1, staff.getUsername());
		preparedStatement.setString(2, staff.getPassword());
		ResultSet resultset = preparedStatement.executeQuery();
		
		if(resultset.next()) {
			success = resultset.getString(1);
		}
		conn.close();
		return success;	
	}
}