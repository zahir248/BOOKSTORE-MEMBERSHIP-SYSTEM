package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.BookController;
import model.Book;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class SearchBook extends JFrame {

	private Book book;
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textAuthor;
	private JTextField textPrice;
	private JTextField textId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchBook frame = new SearchBook();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SearchBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 493);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSearchBookMenu = new JLabel("SEARCH BOOK MENU");
		lblSearchBookMenu.setFont(new Font("Calibri", Font.BOLD, 30));
		lblSearchBookMenu.setBounds(250, 38, 271, 52);
		contentPane.add(lblSearchBookMenu);
		
		JLabel lblNewLabel_1 = new JLabel("ID :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(198, 111, 120, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(198, 147, 120, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Author :");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(198, 183, 120, 26);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Price :");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(198, 219, 120, 26);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textId = new JTextField();
		textId.setColumns(10);
		textId.setBounds(328, 111, 239, 26);
		contentPane.add(textId);
		
		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(328, 147, 239, 26);
		contentPane.add(textName);
		
		textAuthor = new JTextField();
		textAuthor.setColumns(10);
		textAuthor.setBounds(328, 183, 239, 26);
		contentPane.add(textAuthor);
		
		textPrice = new JTextField();
		textPrice.setColumns(10);
		textPrice.setBounds(328, 219, 239, 26);
		contentPane.add(textPrice);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textName.getText();
				
				Book book = new Book();
				BookController Book = new BookController(book);
				
				try {
					book = BookController.searchBook(name);
					
			}catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
				
				if(book != null) {
					textId.setText(book.getId());
					textName.setText(book.getName());
					textAuthor.setText(book.getAuthor());
					textPrice.setText(book.getPrice());
				}
				else
					System.out.println("test");
			}
		});
		
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSearch.setBounds(271, 282, 85, 32);
		contentPane.add(btnSearch);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffMenu frame = new StaffMenu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(436, 282, 85, 32);
		contentPane.add(btnBack);
	}
}
