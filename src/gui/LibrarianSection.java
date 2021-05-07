package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;

public class LibrarianSection extends JFrame {

	private JPanel contentPane;

	public LibrarianSection(Data data) {
		
		setTitle("Librarian Section");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Librarian Section");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(157, 27, 225, 37);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Add Books");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddBook x = new AddBook(data);
				x.setVisible(true);
				LibrarianSection.this.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(157, 100, 225, 37);
		contentPane.add(btnNewButton);

		JButton btnViewBooks = new JButton("View Books");
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewBooks x = new ViewBooks(data);
				x.setVisible(true);
				LibrarianSection.this.setVisible(false);
			}
		});
		btnViewBooks.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnViewBooks.setBounds(157, 160, 225, 37);
		contentPane.add(btnViewBooks);

		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibraryManagement x = new LibraryManagement(data);
				x.setVisible(true);
				LibrarianSection.this.setVisible(false);
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogout.setBounds(157, 400, 225, 37);
		contentPane.add(btnLogout);

		JButton btnIssueBooks = new JButton("Issue Book");
		btnIssueBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBook x = new IssueBook(data);
				x.setVisible(true);
				LibrarianSection.this.setVisible(false);
			}
		});
		btnIssueBooks.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnIssueBooks.setBounds(157, 220, 225, 37);
		contentPane.add(btnIssueBooks);

		JButton btnViewIssuedBooks = new JButton("View Issued Books");
		btnViewIssuedBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewIssuedBooks x = new ViewIssuedBooks(data);
				x.setVisible(true);
				LibrarianSection.this.setVisible(false);
			}
		});
		btnViewIssuedBooks.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnViewIssuedBooks.setBounds(157, 280, 225, 37);
		contentPane.add(btnViewIssuedBooks);

		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReturnBook x = new ReturnBook(data);
				x.setVisible(true);
				LibrarianSection.this.setVisible(false);
			}
		});
		btnReturnBook.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReturnBook.setBounds(157, 340, 225, 37);
		contentPane.add(btnReturnBook);
		setLocation(new Point(500, 100));
	}
}