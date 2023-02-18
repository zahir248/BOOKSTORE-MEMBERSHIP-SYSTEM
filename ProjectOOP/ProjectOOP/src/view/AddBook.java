package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import model.Book;
import controller.BookController;
import controller.CustomerController;

public class AddBook extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtAuthor;
	private JTextField txtPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddBook frame = new AddBook();
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
	public AddBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INSERT NEW BOOK");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		lblNewLabel.setBounds(232, 27, 242, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(170, 90, 120, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(170, 126, 120, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Author :");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(170, 162, 120, 26);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Price :");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(170, 198, 120, 26);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(300, 90, 239, 26);
		contentPane.add(txtId);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(300, 126, 239, 26);
		contentPane.add(txtName);
		
		txtAuthor = new JTextField();
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(300, 162, 239, 26);
		contentPane.add(txtAuthor);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(300, 198, 239, 26);
		contentPane.add(txtPrice);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txtId.getText();
				String name = txtName.getText();
				String author = txtAuthor.getText();
				String price = txtPrice.getText();
				
				Book book = new Book(id, name, author, price);
				BookController Book = new BookController(book);
				
				int success = 0;
				try {
					success = BookController.addBook();
					if(success !=0) {
						JOptionPane.showMessageDialog(null, "Book has been added...");
						AddBook frame = new AddBook();
						frame.setVisible(true);
						dispose();
					}
					else {
						System.out.println("already done");
					}
			}catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAdd.setBounds(243, 261, 85, 32);
		contentPane.add(btnAdd);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffMenu frame = new StaffMenu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(408, 261, 85, 32);
		contentPane.add(btnBack);
	}
}
