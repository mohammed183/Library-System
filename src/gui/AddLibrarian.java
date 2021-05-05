package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.CharConversionException;
import java.util.regex.Pattern;

public class AddLibrarian extends JFrame {

	private JPanel contentPane;
	private JTextField nametext;
	private JTextField emailtext;
	private JTextField passwordtext;
	private JTextField addresstext;
	private JTextField citytext;
	private JLabel lblNewLabel_2;
	private JTextField contacttext;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField idText;
	private JLabel idMessage;
	private JLabel nameMessage;
	private JLabel emailMessage;
	private JLabel addressmessage;
	private JLabel citymessage;
	private JLabel contactmessage;
	
	
	public static boolean isValid(String email)// email validation function
	{
		String emailRegex = "^[a-zA-Z0-9_+&*-\\.]+@([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

		if (email == null)
			return false;
		return Pattern.matches(emailRegex, email);
	}

	public AddLibrarian(Data data) {
		
		
		setPreferredSize(new Dimension(560, 530));
		
		setTitle("Add Librarian");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 530);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Add Librarian");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(207, 0, 144, 37);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(36, 103, 75, 24);
		contentPane.add(lblNewLabel_1);

		nametext = new JTextField();
		nametext.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(Character.isLetter(e.getKeyChar()) || Character.isWhitespace(e.getKeyChar()) || Character.isISOControl(e.getKeyChar())) {
					nameMessage.setText("");
					nametext.setEditable(true);
				}
				else {
					nameMessage.setText("Only characrers and spaces are allowed!");
					nametext.setEditable(false);
				}
			}
		});
		nametext.setBounds(175, 107, 212, 24);
		contentPane.add(nametext);
		nametext.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Email:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(36, 223, 75, 24);
		contentPane.add(lblNewLabel_1_1);

		emailtext = new JTextField();
		emailtext.setCaretColor(Color.BLACK);
		emailtext.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				
				if(Character.isLetter(e.getKeyChar()) || Character.isWhitespace(e.getKeyChar()) 
						|| Character.isDigit(e.getKeyChar()) || Character.isISOControl(e.getKeyChar()) || 
						e.getKeyChar() == '@' || e.getKeyChar() =='.' || e.getKeyChar() == '-' || e.getKeyChar() == '_' ) 
				{
					emailMessage.setText("");
					emailtext.setEditable(true);
				}
				else 
				{
					emailMessage.setText(e.getKeyChar() + " not allowed");
					emailtext.setEditable(false);
				}			
			}
		});
		emailtext.setForeground(Color.BLACK);
		emailtext.setColumns(10);
		emailtext.setBounds(175, 227, 212, 24);
		contentPane.add(emailtext);

		JLabel lblNewLabel_1_2 = new JLabel("Password:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(36, 163, 75, 24);
		contentPane.add(lblNewLabel_1_2);

		passwordtext = new JTextField();
		passwordtext.setColumns(10);
		passwordtext.setBounds(175, 167, 212, 24);
		contentPane.add(passwordtext);

		JLabel lblNewLabel_1_3 = new JLabel("Address:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3.setBounds(36, 283, 75, 24);
		contentPane.add(lblNewLabel_1_3);

		addresstext = new JTextField();
		addresstext.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(Character.isLetter(e.getKeyChar()) || Character.isWhitespace(e.getKeyChar()) 
						|| Character.isDigit(e.getKeyChar()) || Character.isISOControl(e.getKeyChar())
						|| e.getKeyChar() =='.' || e.getKeyChar() == '-' || e.getKeyChar() == '_' )
				{
					addressmessage.setText("");
					addresstext.setEditable(true);
				}
				else {
					addressmessage.setText(e.getKeyChar() + "not allowed");
					addresstext.setEditable(false);
				}					
			}
		});
		addresstext.setColumns(10);
		addresstext.setBounds(175, 287, 212, 24);
		contentPane.add(addresstext);

		JLabel lblNewLabel_1_4 = new JLabel("City:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_4.setBounds(36, 343, 75, 24);
		contentPane.add(lblNewLabel_1_4);

		citytext = new JTextField();
		citytext.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(Character.isLetter(e.getKeyChar()) || Character.isWhitespace(e.getKeyChar()) || Character.isISOControl(e.getKeyChar())) {
					citymessage.setText("");
					citytext.setEditable(true);
				}
				else {
					citymessage.setText("Only characrers and spaces are allowed!");
					citytext.setEditable(false);
				}		
			}
		});
		citytext.setColumns(10);
		citytext.setBounds(175, 347, 212, 24);
		contentPane.add(citytext);

		lblNewLabel_2 = new JLabel("Contact number:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(36, 403, 100, 24);
		contentPane.add(lblNewLabel_2);

		contacttext = new JTextField();
		contacttext.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(Character.isDigit(e.getKeyChar()) || e.getKeyChar() == '+' || Character.isISOControl(e.getKeyChar())) {	
					contactmessage.setText("");
					contacttext.setEditable(true);
				}
				else {
					contactmessage.setText("numbers only!");
					contacttext.setEditable(false);
				}							
			}
		});
		contacttext.setColumns(10);
		contacttext.setBounds(175, 407, 212, 24);
		contentPane.add(contacttext);

		btnNewButton = new JButton("Add Librarian");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (nametext.getText().equals("") || passwordtext.getText().equals("") || emailtext.getText().equals("")
						|| addresstext.getText().equals("") || citytext.getText().equals("")
						|| contacttext.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill all Data!", "Message", JOptionPane.PLAIN_MESSAGE);
				} 
				else if(!isValid(emailtext.getText())) {
					JOptionPane.showMessageDialog(null, "Please Enter a Valid Email!", "Message", JOptionPane.PLAIN_MESSAGE);
				}
				else {
					data.lib[data.libCount][0] = idText.getText();
					data.lib[data.libCount][1] = nametext.getText().trim();
					data.lib[data.libCount][2] = passwordtext.getText();
					data.lib[data.libCount][3] = emailtext.getText();
					data.lib[data.libCount][4] = addresstext.getText().trim();
					data.lib[data.libCount][5] = citytext.getText().trim();
					data.lib[data.libCount][6] = contacttext.getText();
					data.libCount++;

					idText.setText("");
					nametext.setText("");
					passwordtext.setText("");
					emailtext.setText("");
					addresstext.setText("");
					citytext.setText("");
					contacttext.setText("");
					JOptionPane.showMessageDialog(null, "Librarian added successfully!", "Message",JOptionPane.PLAIN_MESSAGE);
					data.updateLibData();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(207, 452, 144, 34);
		contentPane.add(btnNewButton);

		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSection x = new AdminSection(data);
				x.setVisible(true);
				AddLibrarian.this.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setBounds(10, 460, 80, 20);
		contentPane.add(btnNewButton_1);
		
		idText = new JTextField();
		idText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if(Character.isDigit(e.getKeyChar()) || Character.isISOControl(e.getKeyChar())) {
					idMessage.setText("");
					idText.setEditable(true);

				}
				else {
					idText.setEditable(false);
					idMessage.setText("numbers only!");
				}
			}
		});
		idText.setColumns(10);
		idText.setBounds(175, 51, 212, 24);
		contentPane.add(idText);
		
		JLabel lblNewLabel_1_5 = new JLabel("ID:");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_5.setBounds(36, 47, 75, 24);
		contentPane.add(lblNewLabel_1_5);
		
		idMessage = new JLabel("");
		idMessage.setFont(new Font("Tahoma", Font.PLAIN, 8));
		idMessage.setForeground(Color.RED);
		idMessage.setBounds(175, 73, 212, 13);
		contentPane.add(idMessage);
		
		nameMessage = new JLabel("");
		nameMessage.setForeground(Color.RED);
		nameMessage.setFont(new Font("Tahoma", Font.PLAIN, 8));
		nameMessage.setBounds(175, 128, 212, 13);
		contentPane.add(nameMessage);
		
		emailMessage = new JLabel("");
		emailMessage.setForeground(Color.RED);
		emailMessage.setFont(new Font("Tahoma", Font.PLAIN, 8));
		emailMessage.setBounds(175, 249, 212, 13);
		contentPane.add(emailMessage);
		
		addressmessage = new JLabel("");
		addressmessage.setForeground(Color.RED);
		addressmessage.setFont(new Font("Tahoma", Font.PLAIN, 8));
		addressmessage.setBounds(175, 309, 212, 13);
		contentPane.add(addressmessage);
		
		citymessage = new JLabel("");
		citymessage.setForeground(Color.RED);
		citymessage.setFont(new Font("Tahoma", Font.PLAIN, 8));
		citymessage.setBounds(175, 371, 212, 13);
		contentPane.add(citymessage);
		
		contactmessage = new JLabel("");
		contactmessage.setForeground(Color.RED);
		contactmessage.setFont(new Font("Tahoma", Font.PLAIN, 8));
		contactmessage.setBounds(175, 429, 212, 13);
		contentPane.add(contactmessage);
		setLocation(new Point(500, 100));
	}
}
