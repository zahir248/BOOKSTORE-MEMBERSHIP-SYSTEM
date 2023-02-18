package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.db;
import model.Book;

public class BookController {

	private static Book book;
	private static ArrayList<Book> ambik = new ArrayList<Book>();
	
	public BookController(Book book) {
		super();
		this.book = book;
	}

	public static Book searchBook(String name) throws ClassNotFoundException, SQLException {
	
		String sql = "select id, name, author, price from book where name = ?";
		Connection conn = db.doConnection();
		PreparedStatement preparedStatement =  conn.prepareStatement(sql);
		preparedStatement.setString(1, name);
		ResultSet resultset = preparedStatement.executeQuery();
		
		if(resultset.next()) {
		
			book.setId(resultset.getString(1));
			System.out.println (book.getId());
			book.setName(resultset.getString(2));
			System.out.println (book.getName());
			book.setAuthor(resultset.getString(3));
			System.out.println (book.getAuthor());
			book.setPrice(resultset.getString(4));
			System.out.println (book.getPrice());

			conn.close();
			return book;
		}
		else 
		{
			conn.close();
			return null;
		}
	}
	
	public static int addBook() throws ClassNotFoundException, SQLException {
		int success = 0;
		
		String sql = "insert into book(id, name, author, price) values(?,?,?,?)";
		Connection conn = db.doConnection();
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		
		preparedStatement.setString(1, book.getId());
		System.out.println (book.getId());
		preparedStatement.setString(2, book.getName());
		System.out.println (book.getName());
		preparedStatement.setString(3, book.getAuthor());
		System.out.println (book.getAuthor());
		preparedStatement.setString(4, book.getPrice());
		System.out.println (book.getPrice());
		
		success = preparedStatement.executeUpdate();
		preparedStatement.close();
		conn.close();
		return success;
	}

	public static ArrayList<Book> viewBook() throws ClassNotFoundException, SQLException {
		
		String sql = "select * from book";
		Connection conn = db.doConnection();
		PreparedStatement preparedStatement =  conn.prepareStatement(sql);
		ResultSet resultset = preparedStatement.executeQuery();
		
		ambik.clear();
		while(resultset.next()) {
			
			Book buku = new Book();
			
			buku.setId(resultset.getString(1));
			System.out.println (buku.getId());
			buku.setName(resultset.getString(2));
			System.out.println (buku.getName());
			buku.setAuthor(resultset.getString(3));
			System.out.println (buku.getAuthor());
			buku.setPrice(resultset.getString(4));
			System.out.println (buku.getPrice());
			
			Book book = new Book(buku.getId(),buku.getName(),buku.getAuthor(),buku.getPrice());
			ambik.add(book);
		
		}
		preparedStatement.close();
		conn.close();
		return ambik;
	}
}
