package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.LoginController;
import model.Staff;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JButton;

import model.Customer;
import controller.CustomerController;

public class SearchCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField textPhoneNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchCustomer frame = new SearchCustomer();
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
	public SearchCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCustomerSearchMenu = new JLabel("CUSTOMER SEARCH MENU");
		lblCustomerSearchMenu.setFont(new Font("Calibri", Font.BOLD, 30));
		lblCustomerSearchMenu.setBounds(122, 10, 341, 38);
		contentPane.add(lblCustomerSearchMenu);
		
		JLabel lblNewLabel_1_1 = new JLabel("Phone No. :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(82, 109, 106, 26);
		contentPane.add(lblNewLabel_1_1);
		
		textPhoneNo = new JTextField();
		textPhoneNo.setColumns(10);
		textPhoneNo.setBounds(212, 117, 239, 19);
		contentPane.add(textPhoneNo);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String phoneNo = textPhoneNo.getText();
				
				Customer Customer = new Customer(phoneNo);
				CustomerController Customer1 = new CustomerController(Customer);
		
				String success = "";
				try {
					success = CustomerController.searchCustomer();
					
					if(success == "0") {
						JOptionPane.showMessageDialog(null, "Customer not been registered!");
						//System.out.println ("Permission Denied");
					}
					else {
						JOptionPane.showMessageDialog(null, "Customer has been registered.");
						//System.out.println ("Permission Granted");
						StaffMenu frame = new StaffMenu();
						frame.setVisible(true);
						dispose();
					}
				}catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSearch.setBounds(122, 180, 85, 32);
		contentPane.add(btnSearch);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffMenu frame = new StaffMenu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancel.setBounds(262, 180, 85, 32);
		contentPane.add(btnCancel);
		
		JButton btnSignup = new JButton("SignUp");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerSignUp frame = new CustomerSignUp();
				frame.setVisible(true);
				dispose();
			}
		});
		
		btnSignup.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSignup.setBounds(393, 180, 100, 32);
		contentPane.add(btnSignup);
	}
}
