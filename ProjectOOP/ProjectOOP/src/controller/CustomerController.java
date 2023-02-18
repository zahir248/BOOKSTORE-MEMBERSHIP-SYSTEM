package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.db;
import model.Customer;

public class CustomerController {

	private static Customer customer;
	
	public CustomerController(Customer customer) {
		super();
		this.customer = customer;
	}
	
	public CustomerController() {
		
	}
	
	public static int addCustomer() throws ClassNotFoundException, SQLException {
		int success = 0;
		
		String sql = "insert into customer(name, age, phoneNo, email) values(?,?,?,?)";
		Connection conn = db.doConnection();
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		
		
		preparedStatement.setString(1, customer.getName());
		System.out.println (customer.getName());
		preparedStatement.setString(2, customer.getAge());
		System.out.println (customer.getAge());
		preparedStatement.setString(3, customer.getPhoneNo());
		System.out.println (customer.getPhoneNo());
		preparedStatement.setString(4, customer.getEmail());
		System.out.println (customer.getEmail());
		
		success = preparedStatement.executeUpdate();
		preparedStatement.close();
		conn.close();
		return success;	
	}
	
	public static String searchCustomer() throws ClassNotFoundException, SQLException {
		String success = "0";
		
		String sql = "select phoneNo from customer where phoneNo = ?";
		Connection conn = db.doConnection();
		PreparedStatement preparedStatement =  conn.prepareStatement(sql);
		
		preparedStatement.setString(1, customer.getPhoneNo());
		System.out.println (customer.getPhoneNo());
		
		ResultSet resultset = preparedStatement.executeQuery();
		
		if(resultset.next()) {
			success = resultset.getString(1);
		}
		conn.close();
		return success;	
	}
}
