package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuyBook extends JFrame {

	private JPanel contentPane;
	private JTextField txtBookName;
	private JTextField txtBookQuant;
	private JTextField txtCustomerTel;
	private JTextField txtDate;
	private JTextField txtPrice;
	private JTextField txtBuyID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyBook frame = new BuyBook();
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
	public BuyBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 824, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buy Book");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		lblNewLabel.setBounds(331, 30, 131, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Book Name       : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(136, 151, 160, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Book Quantity   : ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(136, 199, 160, 38);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Customer Tel    :");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(136, 247, 160, 38);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Date                 :");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(136, 343, 160, 38);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		txtBookName = new JTextField();
		txtBookName.setColumns(10);
		txtBookName.setBounds(306, 165, 239, 19);
		contentPane.add(txtBookName);
		
		txtBookQuant = new JTextField();
		txtBookQuant.setColumns(10);
		txtBookQuant.setBounds(306, 213, 239, 19);
		contentPane.add(txtBookQuant);
		
		txtCustomerTel = new JTextField();
		txtCustomerTel.setColumns(10);
		txtCustomerTel.setBounds(306, 261, 239, 19);
		contentPane.add(txtCustomerTel);
		
		txtDate = new JTextField();
		txtDate.setColumns(10);
		txtDate.setBounds(306, 357, 239, 19);
		contentPane.add(txtDate);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Total Price        :");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_2.setBounds(136, 295, 160, 38);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(306, 309, 239, 19);
		contentPane.add(txtPrice);
		
		JLabel lblNewLabel_1_2 = new JLabel("Payment ID      : ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(136, 103, 160, 38);
		contentPane.add(lblNewLabel_1_2);
		
		txtBuyID = new JTextField();
		txtBuyID.setColumns(10);
		txtBuyID.setBounds(306, 117, 239, 19);
		contentPane.add(txtBuyID);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String buyID = txtBuyID.getText();
				String bookname = txtBookName.getText();
				String quantity = txtBookQuant.getText();
				String phoneNo = txtCustomerTel.getText();
				String totalPrice = txtPrice.getText();
				String date = txtDate.getText();
				
				
				
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConfirm.setBounds(211, 418, 101, 32);
		contentPane.add(btnConfirm);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffMenu frame = new StaffMenu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancel.setBounds(414, 418, 101, 32);
		contentPane.add(btnCancel);
	}
}
