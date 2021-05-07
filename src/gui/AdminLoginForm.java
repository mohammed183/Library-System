package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.ImageIcon;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Point;
import java.awt.Dimension;

public class AdminLoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField adminNameText;
	private JPasswordField adminPassText;

	public AdminLoginForm(Data data) {
		setPreferredSize(new Dimension(530, 565));
		
		setResizable(false);
		setTitle("Admin Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 530);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(adminNameText.getText().equals(data.admins[0][0]) && adminPassText.getText().equals(data.admins[0][1]) ) {
				AdminSection admin = new AdminSection(data);
				admin.setVisible(true);
				AdminLoginForm.this.setVisible(false);}
				else {
					JOptionPane.showMessageDialog(null, "Invalid name or password!!!", "Message",
							JOptionPane.PLAIN_MESSAGE);
				}	}
		});
		btnNewButton.setBounds(205, 404, 129, 32);
		contentPane.add(btnNewButton);

		adminNameText = new JTextField();
		adminNameText.setBounds(205, 150, 192, 32);
		contentPane.add(adminNameText);
		adminNameText.setColumns(10);

		JLabel lblNewLabel = new JLabel("Admin Login");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(173, 27, 207, 37);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Enter Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(61, 158, 90, 13);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Enter Password:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(61, 226, 118, 13);
		contentPane.add(lblNewLabel_2);

		adminPassText = new JPasswordField();
		adminPassText.setBounds(205, 211, 192, 32);
		contentPane.add(adminPassText);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibraryManagement admin = new LibraryManagement(data);
				admin.setVisible(true);
				AdminLoginForm.this.setVisible(false);
			}
		});
		btnBack.setBounds(10, 460, 80, 20);
		contentPane.add(btnBack);
		setLocation(new Point(500, 100));
	}
}