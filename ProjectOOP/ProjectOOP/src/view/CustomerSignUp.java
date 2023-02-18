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

import model.Customer;
import controller.CustomerController;

public class CustomerSignUp extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtPhoneNo;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerSignUp frame = new CustomerSignUp();
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
	public CustomerSignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCustomerSignUp = new JLabel("CUSTOMER SIGN UP PAGE");
		lblCustomerSignUp.setFont(new Font("Calibri", Font.BOLD, 30));
		lblCustomerSignUp.setBounds(214, 34, 345, 38);
		contentPane.add(lblCustomerSignUp);
		
		JLabel lblNewLabel = new JLabel("Full name :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(176, 111, 107, 25);
		contentPane.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setBounds(293, 111, 288, 25);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblAge = new JLabel("Age :");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAge.setBounds(176, 146, 107, 25);
		contentPane.add(lblAge);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(293, 146, 288, 25);
		contentPane.add(txtAge);
		
		JLabel lblPhoneNo = new JLabel("Phone No :");
		lblPhoneNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPhoneNo.setBounds(176, 181, 107, 25);
		contentPane.add(lblPhoneNo);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(176, 216, 107, 25);
		contentPane.add(lblEmail);
		
		txtPhoneNo = new JTextField();
		txtPhoneNo.setColumns(10);
		txtPhoneNo.setBounds(293, 181, 288, 25);
		contentPane.add(txtPhoneNo);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(293, 216, 288, 25);
		contentPane.add(txtEmail);
		
		JButton btnSignUp = new JButton("SignUp");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String age = txtAge.getText();
				String phoneNo = txtPhoneNo.getText();
				String email = txtEmail.getText(); 
				
				Customer customer = new Customer(name, age, phoneNo, email);
				CustomerController Customer = new CustomerController(customer);
				
				int success = 0;
				try {
					success = CustomerController.addCustomer();
					if(success !=0) {
						JOptionPane.showMessageDialog(null, "Customer has been added...");
					}
					else {
						System.out.println("already done");
					}
			}catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
				
				StaffMenu frame = new StaffMenu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSignUp.setBounds(262, 278, 107, 38);
		contentPane.add(btnSignUp);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchCustomer frame = new SearchCustomer();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(429, 278, 107, 38);
		contentPane.add(btnBack);
	}

}
