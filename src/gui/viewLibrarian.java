package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Point;

public class viewLibrarian extends JFrame {

	private JPanel contentPane;
	public JTable librarianTable;

	public viewLibrarian(Data data) {
		
		setTitle("Librarians information");
		initComponents(data);
		AddLibrarian(data);
	}

	public void AddLibrarian(Data data) {
		DefaultTableModel model = (DefaultTableModel) librarianTable.getModel();
		for (int i = 0; i < data.libCount; i++) {
			model.addRow(data.lib[i]);
		}
	}

	private void initComponents(Data data) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 609, 328);
		contentPane.add(scrollPane);

		librarianTable = new JTable();
		librarianTable.setFont(new Font("Tahoma", Font.PLAIN, 13));
		librarianTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Name", "Password", "Email", "Address", "City", "Contact"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class, Object.class, Object.class, Long.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				true, true, false, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		librarianTable.getColumnModel().getColumn(0).setResizable(false);
		librarianTable.getColumnModel().getColumn(1).setResizable(false);
		librarianTable.getColumnModel().getColumn(2).setResizable(false);
		librarianTable.getColumnModel().getColumn(3).setResizable(false);
		librarianTable.getColumnModel().getColumn(4).setResizable(false);
		librarianTable.getColumnModel().getColumn(5).setResizable(false);
		librarianTable.getColumnModel().getColumn(6).setResizable(false);
		scrollPane.setViewportView(librarianTable);

		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AdminSection x = new AdminSection(data);
				x.setVisible(true);
				viewLibrarian.this.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(10, 433, 80, 20);
		contentPane.add(btnNewButton);
		setLocation(new Point(500, 100));
	}
}