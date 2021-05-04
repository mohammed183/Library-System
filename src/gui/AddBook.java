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

public class AddBook extends javax.swing.JFrame {

	public AddBook(Data data) {
		setResizable(false);
		setPreferredSize(new Dimension(560, 530));
		initComponents(data);
	}

	private void initComponents(Data data) {

		Callnotxt = new javax.swing.JTextField();
		Nametxt = new javax.swing.JTextField();
		Authtxt = new javax.swing.JTextField();
		Publishertxt = new javax.swing.JTextField();
		Quantitytxt = new javax.swing.JTextField();
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
		jLabel1.setText("Add Books");

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

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addGap(201)
					.addComponent(jLabel1)
					.addContainerGap(217, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
					.addGap(95)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jLabel6)
						.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
						.addComponent(jLabel3)
						.addComponent(jLabel2)
						.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(Publishertxt, Alignment.LEADING)
							.addComponent(Authtxt, Alignment.LEADING)
							.addComponent(Nametxt, Alignment.LEADING)
							.addComponent(Callnotxt, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
							.addComponent(Quantitytxt, Alignment.LEADING)))
					.addGap(104))
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(463, Short.MAX_VALUE))
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
					.addGap(31)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(Nametxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel3))
					.addGap(35)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(Authtxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel4))
					.addGap(34)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(Publishertxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel5))
					.addGap(32)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(Quantitytxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel6))
					.addPreferredGap(ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
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
		} else {
			data.books[data.count][0] = Callnotxt.getText();
			data.books[data.count][1] = Nametxt.getText();
			data.books[data.count][2] = Authtxt.getText();
			data.books[data.count][3] = Publishertxt.getText();
			data.books[data.count][4] = Quantitytxt.getText();
			data.count++;

			Quantitytxt.setText("");
			Publishertxt.setText("");
			Authtxt.setText("");
			Nametxt.setText("");
			Callnotxt.setText("");
			data.updateBookData();
			JOptionPane.showMessageDialog(null, "Book added successfully!", "Message", JOptionPane.PLAIN_MESSAGE);
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
}