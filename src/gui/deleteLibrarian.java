package gui;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Point;
import java.awt.Dimension;


public class deleteLibrarian extends javax.swing.JFrame {

    public deleteLibrarian(Data data) {
    	setPreferredSize(new Dimension(560, 530));
    	setLocation(new Point(500, 100));
    	setResizable(false);
    	setTitle("Delete Librarian");
        initComponents(data);
    }

    private void initComponents(Data data) {

        delName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton2.setToolTipText("Delete Librarian");
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        delId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        delName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt, data);
            }
        });

        jButton2.setFont(new Font("Tahoma", Font.PLAIN, 10)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt, data);
            }
        });

        jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 13)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 13)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Delete Librarian");

        delId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(215)
        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(175)
        					.addComponent(jLabel4))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(123)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel2)
        						.addComponent(jLabel3))
        					.addGap(56)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(delId, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
        						.addComponent(delName, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))))
        			.addGap(185))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(29)
        			.addComponent(jLabel4)
        			.addGap(72)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(delName, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2))
        			.addGap(83)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(delId, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3))
        			.addPreferredGap(ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        			.addGap(14)
        			.addComponent(jButton2)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {};

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt, Data data) {
    	
		AdminSection x = new AdminSection(data);
		x.setVisible(true);
		this.setVisible(false);	
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {}
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt, Data data) {

    	int newCount = data.libCount;
    	data.libCount =0;
    	for(int i = 0; i < newCount; i++) {
    		if(delName.getText().equals(data.lib[i][1]) && delId.getText().equals(data.lib[i][0])) {
    			JOptionPane.showMessageDialog(null, "Deleted successfully!", "Message",JOptionPane.PLAIN_MESSAGE);
    			continue;
    		}
    		else {
    			data.lib[data.libCount] = data.lib[i];
    			data.libCount++;
    		}
    	}  	
    	if(newCount == data.libCount) {  	
        	JOptionPane.showMessageDialog(null, "Sorry, unable to delete!", "Message",JOptionPane.PLAIN_MESSAGE);
        	}
    	data.updateLibData();
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField delName;
    private javax.swing.JTextField delId;
}