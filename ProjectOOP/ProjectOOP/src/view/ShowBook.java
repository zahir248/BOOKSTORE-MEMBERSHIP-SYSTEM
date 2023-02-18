package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import controller.BookController;
import model.Book;
import java.awt.Color;

public class ShowBook extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTable table_1_1;
	private Book book;
	private DefaultTableModel model;
	private ArrayList<Book> buku;
	private String[] columnNames = {"Id","Name","Author", "Price"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowBook frame = new ShowBook();
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
	public ShowBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1094, 569);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDisplay = new JButton("Dispaly Data");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					buku = new ArrayList<>();
					buku = BookController.viewBook();
					System.out.println(buku.size());
					
					DefaultTableModel temp = (DefaultTableModel) table_1_1.getModel();
					temp.setRowCount(0);
					
					for(Book book : buku ) {
				    	Object[] objs = {book.getId(),book.getName(),book.getAuthor(),book.getPrice()};
				    	temp.addRow(objs);
				    	}
					
				} catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
				}
			}
		});
		btnDisplay.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDisplay.setBounds(68, 194, 155, 38);
		contentPane.add(btnDisplay);
		model = new DefaultTableModel(columnNames,0);
		System.out.println(model.getColumnCount());
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(252, 62, 818, 460);
		contentPane.add(scrollPane_1);
		
		table_1_1 = new JTable(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Name", "Author", "Price"
			}
		));
		table_1_1.setToolTipText("");
		table_1_1.setBounds(331, 62, 727, 460); 
		scrollPane_1.setViewportView(table_1_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffMenu frame = new StaffMenu();
				frame.setVisible(true);
				dispose();
			}
		});
		
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(68, 317, 129, 38);
		contentPane.add(btnBack);
	}
}
