package gui;

import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;
import java.awt.Dimension;

public class ViewBooks extends javax.swing.JFrame {

	public ViewBooks(Data data) {
		setResizable(false);
		setPreferredSize(new Dimension(736, 530));
		setTitle("Books");
		initComponents(data);
		AddBooks(data);
	}

	public void AddBooks(Data data) {
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		for (int i = 0; i < data.count; i++) {
			model.addRow(data.books[i]);
		}
	}

	private void initComponents(Data data) {

		jScrollBar1 = new javax.swing.JScrollBar();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTable1.setForeground(new java.awt.Color(51, 0, 51));
		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Call No:", "Name: ", "Author:", "Publisher:", "Quantity:" }) {
			Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.Integer.class };
			boolean[] canEdit = new boolean[] { false, false, false, false, false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jTable1.setToolTipText("");
		jTable1.setGridColor(new java.awt.Color(0, 0, 0));
		jScrollPane1.setViewportView(jTable1);

		JButton btnNewButton = new JButton("back");
		btnNewButton.setSize(new Dimension(80, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianSection x = new LibrarianSection(data);
				x.setVisible(true);
				ViewBooks.this.setVisible(false);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 702, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(617, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		getContentPane().setLayout(layout);

		pack();
		setLocation(new Point(500, 100));
	}

	private javax.swing.JScrollBar jScrollBar1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
}
