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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import controller.StaffController;
import controller.LoginController;
import model.Staff;
import javax.swing.JPasswordField;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 407);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		lblNewLabel.setBounds(260, 27, 172, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(246, 90, 120, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(246, 157, 100, 26);
		contentPane.add(lblNewLabel_1_1);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(376, 98, 239, 19);
		contentPane.add(txtUsername);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(376, 165, 239, 19);
		contentPane.add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				String password = txtPassword.getText();
				
				Staff staff = new Staff(username,password);
				LoginController Staff = new LoginController(staff);
				
				String success = "";
				try {
					success = LoginController.login();
					
					if(success == "0") {
						JOptionPane.showMessageDialog(null, "Wrong id or password");
						//System.out.println ("Permission Denied");
					}
					else {
						JOptionPane.showMessageDialog(null, "Permission Granted");
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
				
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setBounds(240, 219, 85, 32);
		contentPane.add(btnLogin);
		
		JButton btnCancel = new JButton("Exit");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Thank you....");
				dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancel.setBounds(530, 219, 85, 32);
		contentPane.add(btnCancel);
		
		JButton btnSignup = new JButton("SignUp");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffSignUp frame = new StaffSignUp();
				frame.setVisible(true);
				dispose();
			}
		});
		btnSignup.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSignup.setBounds(382, 219, 100, 32);
		contentPane.add(btnSignup);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBackground(new Color(128, 128, 255));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\ProjectOOP\\images\\image.jpg"));
		lblNewLabel_2.setBounds(-63, 59, 274, 231);
		contentPane.add(lblNewLabel_2);
	}
}
