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

import controller.StaffController;
import model.Staff;
import java.awt.Color;

public class StaffSignUp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7974680154637483292L;
	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtName;
	private JTextField txtPhoneNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffSignUp frame = new StaffSignUp();
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
	public StaffSignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 493);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STAFF SIGN UP PAGE");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		lblNewLabel.setBounds(221, 49, 345, 38);
		contentPane.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtName.setColumns(10);
		txtName.setBounds(278, 142, 235, 19);
		contentPane.add(txtName);
		
		txtPhoneNo = new JTextField();
		txtPhoneNo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtPhoneNo.setColumns(10);
		txtPhoneNo.setBounds(278, 177, 235, 19);
		contentPane.add(txtPhoneNo);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtUsername.setBounds(278, 209, 235, 19);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtPassword.setColumns(10);
		txtPassword.setBounds(278, 244, 235, 19);
		contentPane.add(txtPassword);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Full Name :");
		lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_3.setBounds(58, 135, 169, 25);
		contentPane.add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_3_1 = new JLabel("Phone No. :");
		lblNewLabel_1_1_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_3_1.setBounds(58, 170, 169, 25);
		contentPane.add(lblNewLabel_1_1_1_3_1);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Username :");
		lblNewLabel_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_2_1.setBounds(58, 202, 169, 25);
		contentPane.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Password :");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_2.setBounds(58, 237, 169, 25);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JButton btnSignUp = new JButton("SignUp");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String phoneNo = txtPhoneNo.getText();
				String username = txtUsername.getText();
				String password = txtPassword.getText();
				
				Staff staff = new Staff(name, phoneNo, username, password);
				StaffController Staff = new StaffController(staff);
				
				int success = 0;
				try {
					success = StaffController.addStaff();
					if(success !=0) {
						JOptionPane.showMessageDialog(null, "Staff has been added...");
						AddBook frame = new AddBook();
						frame.setVisible(true);
					}
					else {
						System.out.println("already done");
					}
			}catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
				
				Login frame = new Login();
				frame.setVisible(true);
				dispose();
			}
		});
		
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSignUp.setBounds(171, 294, 107, 38);
		contentPane.add(btnSignUp);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(388, 294, 107, 38);
		contentPane.add(btnBack);
		
		
	}
}
