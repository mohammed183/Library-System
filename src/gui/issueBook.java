package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class issueBook extends JFrame {

	private JPanel contentPane;
	private JTextField callTxt;
	private JTextField stdTxt;
	private JTextField stdntTxt;
	private JTextField conTxt;

	public issueBook(Data data) {
		setResizable(false);
		setPreferredSize(new Dimension(560, 530));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Book Call No:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(45, 129, 148, 28);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Student ID:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(45, 187, 148, 28);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Student Name:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(45, 246, 148, 28);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Student Contact:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(45, 306, 148, 28);
		contentPane.add(lblNewLabel_4);

		JLabel idM = new JLabel("");
		idM.setForeground(Color.RED);
		idM.setBounds(203, 97, 203, 13);
		contentPane.add(idM);
		
		JLabel callMessage = new JLabel("");
		callMessage.setForeground(Color.RED);
		callMessage.setFont(new Font("Tahoma", Font.PLAIN, 8));
		callMessage.setBounds(203, 164, 203, 13);
		contentPane.add(callMessage);
		
		JLabel stdMessage = new JLabel("");
		stdMessage.setForeground(Color.RED);
		stdMessage.setFont(new Font("Tahoma", Font.PLAIN, 8));
		stdMessage.setBounds(203, 223, 203, 13);
		contentPane.add(stdMessage);
		
		JLabel stdntMessage = new JLabel("");
		stdntMessage.setForeground(Color.RED);
		stdntMessage.setFont(new Font("Tahoma", Font.PLAIN, 8));
		stdntMessage.setBounds(203, 283, 203, 13);
		contentPane.add(stdntMessage);
		
		JLabel conMessage = new JLabel("");
		conMessage.setForeground(Color.RED);
		conMessage.setFont(new Font("Tahoma", Font.PLAIN, 8));
		conMessage.setBounds(203, 344, 203, 13);
		contentPane.add(conMessage);

		callTxt = new JTextField();
		callTxt.setTransferHandler(null);
		callTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(Character.isDigit(e.getKeyChar()) || Character.isISOControl(e.getKeyChar())) {
					callMessage.setText("");
					callTxt.setEditable(true);

				}
				else {
					callTxt.setEditable(false);
					callMessage.setText("numbers only!");				
				}
			}
		});
		callTxt.setBounds(203, 129, 203, 28);
		contentPane.add(callTxt);
		callTxt.setColumns(10);

		stdTxt = new JTextField();
		stdTxt.setTransferHandler(null);
		stdTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if(Character.isDigit(e.getKeyChar()) || Character.isISOControl(e.getKeyChar())) {
					stdMessage.setText("");
					stdTxt.setEditable(true);

				}
				else {
					stdTxt.setEditable(false);
					stdMessage.setText("numbers only!");				
				}
			
				
		
				
			}
		});
		stdTxt.setBounds(203, 187, 203, 28);
		contentPane.add(stdTxt);
		stdTxt.setColumns(10);

		stdntTxt = new JTextField();
		stdntTxt.setTransferHandler(null);
		stdntTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(Character.isLetter(e.getKeyChar()) || Character.isWhitespace(e.getKeyChar()) || Character.isISOControl(e.getKeyChar())) {
					stdntMessage.setText("");
					stdntTxt.setEditable(true);
				}
				else {
					stdntMessage.setText("Only characrers and spaces are allowed!");
					stdntTxt.setEditable(false);
				}
	
			}
		});
		stdntTxt.setBounds(203, 246, 203, 28);
		contentPane.add(stdntTxt);
		stdntTxt.setColumns(10);

		conTxt = new JTextField();
		conTxt.setTransferHandler(null);
		conTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
											
				if(Character.isDigit(e.getKeyChar()) || e.getKeyChar() == '+' || Character.isISOControl(e.getKeyChar())) {	
					conMessage.setText("");
					conTxt.setEditable(true);
				}
				else {
					conMessage.setText("numbers only!");
					conTxt.setEditable(false);
				}					
			}
		});
		conTxt.setBounds(203, 306, 203, 28);
		contentPane.add(conTxt);
		conTxt.setColumns(10);

		JButton btnNewButton = new JButton("Issue");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Boolean found = false;

				if (callTxt.getText().equals("") || stdTxt.getText().equals("")
						|| stdntTxt.getText().equals("")
						|| conTxt.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill all Data!", "Message", JOptionPane.PLAIN_MESSAGE);
				} else {
					for (int i = 0; i < data.count; i++) {
						if (callTxt.getText().equals(data.books[i][0])) {
							Integer x = Integer.parseInt((String) data.books[i][4]);
								if (x < 1) {
									found = true;
									JOptionPane.showMessageDialog(null, "Book Currently not available", "Message", JOptionPane.PLAIN_MESSAGE);
								}
								else {
									if(data.issCount == 0)
										data.issBooks[data.issCount][0] = "1";
										else {
											Integer temp = Integer.parseInt(data.issBooks[data.issCount-1][0].toString()) + 1;
											data.issBooks[data.issCount][0] = temp.toString();
										}
										
										data.issBooks[data.issCount][1] = callTxt.getText();// book call number
										data.issBooks[data.issCount][2] = stdTxt.getText();
										data.issBooks[data.issCount][3] = stdntTxt.getText().trim();
										data.issBooks[data.issCount][4] = conTxt.getText();
										
										Date date = new Date();
										SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
										
										data.issBooks[data.issCount][5] = format.format(date);
										data.issCount++;

										Integer temp = Integer.parseInt(data.books[i][4].toString()) -  1;
										data.books[i][4] = temp.toString();
										callTxt.setText("");
										stdntTxt.setText("");
										stdTxt.setText("");
										conTxt.setText("");
										data.updateissueData();
										data.updateBookData();
										found = true;
										JOptionPane.showMessageDialog(null, "Book issued successfully!", "Message",
												JOptionPane.PLAIN_MESSAGE);
								}
							
						}
					}
					if (!found) {
						JOptionPane.showMessageDialog(null, "wrong Book Call No!! ", "Message",
								JOptionPane.PLAIN_MESSAGE);
					}

				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(203, 429, 132, 37);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianSection x = new LibrarianSection(data);
				x.setVisible(true);
				issueBook.this.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(10, 460, 80, 20);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_6 = new JLabel("Issue Book");
		lblNewLabel_6.setForeground(Color.GRAY);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(111, 10, 295, 37);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("Notify student that returns after more than two days will be charged 2$ per extra day!!");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(12, 352, 534, 53);
		contentPane.add(lblNewLabel);
		
		

		setLocation(new Point(500, 100));
	}
}