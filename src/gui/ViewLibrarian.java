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
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Point;

public class ViewLibrarian extends JFrame {

	private JPanel contentPane;
	public JTable LibrarianTable;

	public ViewLibrarian(Data data) {
		
		setTitle("Librarians information");
		initComponents(data);
		AddLibrarian(data);
	}

	public void AddLibrarian(Data data) {
		DefaultTableModel model = (DefaultTableModel) LibrarianTable.getModel();
		for (int i = 0; i < data.libCount; i++) {
			
			model.addRow(data.lib[i].getAll());
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

		LibrarianTable = new JTable();
		LibrarianTable.setFont(new Font("Tahoma", Font.PLAIN, 13));
		LibrarianTable.setModel(new DefaultTableModel(
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
		LibrarianTable.getColumnModel().getColumn(0).setResizable(false);
		LibrarianTable.getColumnModel().getColumn(1).setResizable(false);
		LibrarianTable.getColumnModel().getColumn(2).setResizable(false);
		LibrarianTable.getColumnModel().getColumn(3).setResizable(false);
		LibrarianTable.getColumnModel().getColumn(4).setResizable(false);
		LibrarianTable.getColumnModel().getColumn(5).setResizable(false);
		LibrarianTable.getColumnModel().getColumn(6).setResizable(false);
		scrollPane.setViewportView(LibrarianTable);

		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AdminSection x = new AdminSection(data);
				x.setVisible(true);
				ViewLibrarian.this.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(10, 433, 80, 20);
		contentPane.add(btnNewButton);
		setLocation(new Point(500, 100));
	}
}