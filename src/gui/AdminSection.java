package gui;
import java.awt.Point;
import java.awt.Dimension;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AdminSection extends javax.swing.JFrame {

	public AdminSection(Data data) {
		setTitle("Admin Section");
		setPreferredSize(new Dimension(530, 560));
		setLocation(new Point(500, 100));
		setResizable(false);
		initComponents(data);
	}

	private void initComponents(Data data) {

		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		
		jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jButton1.setText("Add Libriaren");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt, data);
			}
		});

		jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jButton2.setText("View Libriaren");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt, data);
			}
		});
		
		jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jButton3.setText("Delete Libriaren");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt, data);
			}
		});
		
		jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jButton4.setText("Logout");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt, data);
			}
		});
		
		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(102, 102, 102));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Admin Section");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap(163, Short.MAX_VALUE)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))
							.addGap(134))
						.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
							.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
							.addGap(142))))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(57)
					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(49)
					.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(101, Short.MAX_VALUE))
		);
		getContentPane().setLayout(layout);
		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt, Data data) {
		AddLibrarian x = new AddLibrarian(data);
		x.setVisible(true);
		AdminSection.this.setVisible(false);
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt, Data data) {

		LibraryManagement x = new LibraryManagement(data);
		x.setVisible(true);
		AdminSection.this.setVisible(false);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt, Data data) {
		deleteLibrarian x = new deleteLibrarian(data);
		x.setVisible(true);
		AdminSection.this.setVisible(false);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt, Data data) {

		viewLibrarian x = new viewLibrarian(data);
		x.setVisible(true);
		this.setVisible(false);

	}

	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
}
