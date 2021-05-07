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

public class ViewIssuedBooks extends JFrame {

	private JPanel contentPane;
	public JTable issbooktable;

	public ViewIssuedBooks(Data data) {
		setTitle("Issued Books");
		initComponents(data);
		AddIssuedBook(data);
	}

	public void AddIssuedBook(Data data) {
		DefaultTableModel model = (DefaultTableModel) issbooktable.getModel();
		for (int i = 0; i < data.issCount; i++) {
			model.addRow(data.issBooks[i].getAll());
		}
	}

	private void initComponents(Data data) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 609, 321);
		contentPane.add(scrollPane);

		issbooktable = new JTable();
		issbooktable.setFont(new Font("Tahoma", Font.PLAIN, 13));
		issbooktable.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "id", "book callno", "Student id", "Student name", "Student contact", "issued date" }) {
			Class[] columnTypes = new Class[] { Integer.class, Integer.class, Integer.class, String.class, Long.class,
					String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] { false, true, true, true, true, true };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		issbooktable.getColumnModel().getColumn(0).setResizable(false);
		issbooktable.getColumnModel().getColumn(1).setResizable(false);
		issbooktable.getColumnModel().getColumn(2).setResizable(false);
		issbooktable.getColumnModel().getColumn(3).setResizable(false);
		issbooktable.getColumnModel().getColumn(4).setResizable(false);
		issbooktable.getColumnModel().getColumn(5).setResizable(false);
		scrollPane.setViewportView(issbooktable);

		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				LibrarianSection x = new LibrarianSection(data);
				x.setVisible(true);
				ViewIssuedBooks.this.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(10, 435, 80, 20);
		contentPane.add(btnNewButton);
		setLocation(new Point(500, 100));

	}
}