package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Point;
import java.awt.Color;

public class LibrarianLoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField nameTxt;
	private JPasswordField passTxt;

	public LibrarianLoginForm(Data data) {
		setTitle("Librarian Login Form");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Librarian Login ");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(194, 26, 203, 37);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Enter Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(61, 158, 90, 13);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Enter Password:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(61, 226, 118, 13);
		contentPane.add(lblNewLabel_2);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean login = false;

			//	for (int i = 0; i < data.libCount; i++) {
			//		if (nameTxt.getText().equals(data.lib[i][1]) && passTxt.getText().equals(data.lib[i][2]))
			//			login = true;
			//	}
			//	if (login) {
					LibrarianSection x = new LibrarianSection(data);
					x.setVisible(true);
					LibrarianLoginForm.this.setVisible(false);
			//	} else {
			//		JOptionPane.showMessageDialog(null, "Invalid username or password!", "Message",
			//				JOptionPane.PLAIN_MESSAGE);
			//	}
			}
		});
		btnNewButton.setBounds(205, 406, 129, 32);
		contentPane.add(btnNewButton);

		nameTxt = new JTextField();
		nameTxt.setBounds(205, 150, 192, 32);
		contentPane.add(nameTxt);
		nameTxt.setColumns(10);

		passTxt = new JPasswordField();
		passTxt.setBounds(205, 211, 192, 32);
		contentPane.add(passTxt);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibraryManagement admin = new LibraryManagement(data);
				admin.setVisible(true);
				LibrarianLoginForm.this.setVisible(false);
			}
		});
		btnBack.setBounds(10, 460, 80, 20);
		contentPane.add(btnBack);
		setLocation(new Point(500, 100));
	}
}