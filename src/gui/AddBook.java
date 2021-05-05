package gui;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class AddBook extends javax.swing.JFrame {

	public AddBook(Data data) {
		setTitle("Add book");
		setResizable(false);
		setPreferredSize(new Dimension(560, 530));
		initComponents(data);
	}

	private void initComponents(Data data) {

		Callnotxt = new javax.swing.JTextField();
		Callnotxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(Character.isDigit(e.getKeyChar()) || Character.isISOControl(e.getKeyChar())) {
					CallnoMessage.setText("");
					Callnotxt.setEditable(true);
				}
				else {
					Callnotxt.setEditable(false);
					CallnoMessage.setText("numbers only!");
				}								
			}
		});
		Nametxt = new javax.swing.JTextField();

		Authtxt = new javax.swing.JTextField();
		Authtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(Character.isLetter(e.getKeyChar()) || Character.isWhitespace(e.getKeyChar()) || Character.isISOControl(e.getKeyChar()) ||
						e.getKeyChar() == '.' || e.getKeyChar() == '-') {
					AuthMessage.setText("");
					Authtxt.setEditable(true);
				}
				else {
					AuthMessage.setText("Only characrers and spaces are allowed!");
					Authtxt.setEditable(false);
				}				
			}
		});
		Publishertxt = new javax.swing.JTextField();
		Publishertxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			
				if(Character.isLetter(e.getKeyChar()) || Character.isWhitespace(e.getKeyChar()) || Character.isISOControl(e.getKeyChar())) {
					PublisherMessage.setText("");
					Publishertxt.setEditable(true);
				}
				else {
					PublisherMessage.setText("Only characrers and spaces are allowed!");
					Publishertxt.setEditable(false);
				}		
			}
		});
		Quantitytxt = new javax.swing.JTextField();
		Quantitytxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(Character.isDigit(e.getKeyChar()) || Character.isISOControl(e.getKeyChar())) {
					QuantityMessage.setText("");
					Quantitytxt.setEditable(true);
				}
				else {
					Quantitytxt.setEditable(false);
					QuantityMessage.setText("numbers only!");
				}				
			}
		});
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton2.setBounds(new Rectangle(10, 460, 80, 20));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		Callnotxt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		Nametxt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});

		Authtxt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField3ActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(102, 102, 102));
		jLabel1.setText("Add Book");

		jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 13)); // NOI18N
		jLabel2.setText("Call No:");

		jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 13)); // NOI18N
		jLabel3.setText("Name:");

		jLabel4.setFont(new Font("Tahoma", Font.PLAIN, 13)); // NOI18N
		jLabel4.setText("Author:");

		jLabel5.setFont(new Font("Tahoma", Font.PLAIN, 13)); // NOI18N
		jLabel5.setText("Publisher:");

		jLabel6.setFont(new Font("Tahoma", Font.PLAIN, 13)); // NOI18N
		jLabel6.setText("Quantity:");

		jButton1.setText("Add");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt, data);
			}
		});

		jButton2.setText("Back");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt, data);
			}
		});
		
		CallnoMessage = new JLabel("");
		CallnoMessage.setForeground(Color.RED);
		CallnoMessage.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		NameMessage = new JLabel("");
		NameMessage.setFont(new Font("Tahoma", Font.PLAIN, 8));
		NameMessage.setForeground(Color.RED);
		
		AuthMessage = new JLabel("");
		AuthMessage.setForeground(Color.RED);
		AuthMessage.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		PublisherMessage = new JLabel("");
		PublisherMessage.setForeground(Color.RED);
		PublisherMessage.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		QuantityMessage = new JLabel("");
		QuantityMessage.setForeground(Color.RED);
		QuantityMessage.setFont(new Font("Tahoma", Font.PLAIN, 8));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addGap(201)
					.addComponent(jLabel1)
					.addContainerGap(227, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(473, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
					.addGap(95)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jLabel6)
						.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
						.addComponent(jLabel3)
						.addComponent(jLabel2)
						.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addComponent(QuantityMessage, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(layout.createSequentialGroup()
							.addComponent(PublisherMessage, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(layout.createSequentialGroup()
							.addComponent(AuthMessage, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(layout.createSequentialGroup()
							.addComponent(NameMessage, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(CallnoMessage, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(Alignment.TRAILING, layout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(jButton1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
									.addComponent(Publishertxt, Alignment.LEADING)
									.addComponent(Authtxt, Alignment.LEADING)
									.addComponent(Nametxt, Alignment.LEADING)
									.addComponent(Callnotxt, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
									.addComponent(Quantitytxt, Alignment.LEADING)))
							.addGap(104))))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addGap(22)
					.addComponent(jLabel1)
					.addGap(43)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel2)
						.addComponent(Callnotxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(CallnoMessage, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(Nametxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(NameMessage, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(Authtxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel4))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(AuthMessage, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(Publishertxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel5))
					.addGap(4)
					.addComponent(PublisherMessage, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(Quantitytxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel6))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(QuantityMessage, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
					.addComponent(jButton1)
					.addGap(36)
					.addComponent(jButton2)
					.addContainerGap())
		);
		getContentPane().setLayout(layout);

		pack();
		setLocation(new Point(500, 100));
	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {}
	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {}
	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {}
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt, Data data) {

		if (Quantitytxt.getText().equals("") || Publishertxt.getText().equals("") || Authtxt.getText().equals("")
				|| Nametxt.getText().equals("") || Callnotxt.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Please fill all Data!", "Message", JOptionPane.PLAIN_MESSAGE);
		} 

		else{
			Boolean callNoValid = true;
			String textDisplay = "";
			for(int i = 0;i < data.count; i++)
			{
				if(Callnotxt.getText().equals(data.books[i][0])) {					
					callNoValid = false;
					textDisplay = "This call number is already used!!";
				}
			}
			
			if(callNoValid) {
				
			data.books[data.count][0] = Callnotxt.getText();
			data.books[data.count][1] = Nametxt.getText().trim();
			data.books[data.count][2] = Authtxt.getText().trim();
			data.books[data.count][3] = Publishertxt.getText().trim();
			data.books[data.count][4] = Quantitytxt.getText();
			data.count++;
			
			Quantitytxt.setText("");
			Publishertxt.setText("");
			Authtxt.setText("");
			Nametxt.setText("");
			Callnotxt.setText("");
			data.updateBookData();
			
			textDisplay = "Book added successfully!";
			JOptionPane.showMessageDialog(null, textDisplay, "Message", JOptionPane.PLAIN_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, textDisplay, "Message", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt, Data data) {
		LibrarianSection x = new LibrarianSection(data);
		x.setVisible(true);
		this.setVisible(false);
	}
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JTextField Callnotxt;
	private javax.swing.JTextField Nametxt;
	private javax.swing.JTextField Authtxt;
	private javax.swing.JTextField Publishertxt;
	private javax.swing.JTextField Quantitytxt;
	private JLabel CallnoMessage;
	private JLabel NameMessage;
	private JLabel AuthMessage;
	private JLabel PublisherMessage;
	private JLabel QuantityMessage;
}