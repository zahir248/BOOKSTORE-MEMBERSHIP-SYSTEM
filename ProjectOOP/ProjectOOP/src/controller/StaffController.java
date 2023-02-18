package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import view.StaffSignUp;
import database.db;
import view.Login;
import model.Staff;
import model.Book;

public class StaffController {
	
	private static Staff staff;

	
	
	
	public StaffController(Staff staff) {
		super();
		this.staff = staff;
	}

	public StaffController() {
		
	}
	
	public static int addStaff() throws ClassNotFoundException, SQLException {
		int success = 0;
		
		String sql = "insert into staff(name, phoneNo, username, password) values(?,?,?,?)";
		Connection conn = db.doConnection();
		PreparedStatement preparedStatement =  conn.prepareStatement(sql);
		
		
		preparedStatement.setString(1, staff.getName());
		System.out.println (staff.getName());
		preparedStatement.setString(2, staff.getPhoneNo());
		System.out.println (staff.getPhoneNo());
		preparedStatement.setString(3, staff.getUsername());
		System.out.println (staff.getUsername());
		preparedStatement.setString(4, staff.getPassword());
		System.out.println (staff.getPassword());
		
		success = preparedStatement.executeUpdate();
		preparedStatement.close();
		conn.close();
		return success;	
	}
	
	
}