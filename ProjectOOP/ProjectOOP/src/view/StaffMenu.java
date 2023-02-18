package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class StaffMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffMenu frame = new StaffMenu();
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
	public StaffMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 538);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STAFF MENU");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		lblNewLabel.setBounds(244, 10, 191, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1 .");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(74, 93, 45, 33);
		contentPane.add(lblNewLabel_1);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowBook frame = new ShowBook();
				frame.setVisible(true);
				dispose();
			}
		});
		btnView.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnView.setBounds(129, 136, 191, 33);
		contentPane.add(btnView);
		
		JLabel lblNewLabel_1_1 = new JLabel("2 .");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(74, 136, 45, 33);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("3 .");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(74, 179, 45, 33);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("4 .");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(74, 222, 45, 33);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("5 .");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setBounds(74, 265, 45, 33);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JButton btnSearch = new JButton("Search Book");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchBook frame = new SearchBook();
				frame.setVisible(true);
				dispose();
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSearch.setBounds(129, 179, 191, 33);
		contentPane.add(btnSearch);
		
		JButton btnInsert = new JButton("Insert New Book");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddBook frame = new AddBook();
				frame.setVisible(true);
				dispose();
			}
		});
		btnInsert.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnInsert.setBounds(129, 222, 191, 33);
		contentPane.add(btnInsert);
		
		JButton btnLogout = new JButton("Log Out");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				frame.setVisible(true);
				dispose();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogout.setBounds(129, 308, 191, 33);
		contentPane.add(btnLogout);
		
		JButton btnSearchCustomer = new JButton("Search Customer");
		btnSearchCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchCustomer frame = new SearchCustomer();
				frame.setVisible(true);
				dispose();
			}
		});
		btnSearchCustomer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSearchCustomer.setBounds(129, 93, 191, 33);
		contentPane.add(btnSearchCustomer);
		
		JButton btnBuyBook = new JButton("Buy Book");
		btnBuyBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuyBook frame = new BuyBook();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBuyBook.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBuyBook.setBounds(129, 265, 191, 33);
		contentPane.add(btnBuyBook);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("6 .");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1.setBounds(74, 308, 45, 33);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
	}
}
