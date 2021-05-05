package gui;

import javax.swing.JOptionPane;
import java.awt.Point;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.awt.Dimension;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;


public class ReturnBook extends javax.swing.JFrame {


    public ReturnBook(Data data) {
    	setPreferredSize(new Dimension(560, 530));
    	setLocation(new Point(500, 100));
    	setResizable(false);
        initComponents(data);
    }

    private void initComponents(Data data) {

        bookCallText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        studentIdText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bookCallText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Return");
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

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Note: Check the book properly!");

        jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 13)); // NOI18N
        jLabel2.setText("Book Callno:");

        jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 13)); // NOI18N
        jLabel3.setText("Student ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Return Book");

        studentIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(32)
        					.addComponent(jLabel1)
        					.addGap(50))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel3)
        						.addComponent(jLabel2))
        					.addGap(66)))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(studentIdText)
        				.addComponent(bookCallText, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
        			.addContainerGap(167, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(206, Short.MAX_VALUE)
        			.addComponent(jLabel4)
        			.addGap(199))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(214)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(234, Short.MAX_VALUE))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(459, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(30)
        			.addComponent(jLabel4)
        			.addGap(66)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(bookCallText, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2))
        			.addGap(65)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(studentIdText, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3))
        			.addPreferredGap(ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
        			.addComponent(jLabel1)
        			.addGap(7)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        			.addGap(16)
        			.addComponent(jButton2)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt, Data data) {
    	
		LibrarianSection x = new LibrarianSection(data);
		x.setVisible(true);
		this.setVisible(false);	
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt, Data data) {
    	
    	Boolean found = false;
    	for(int i = 0; i < data.issCount; i++) {
    		
    		if(bookCallText.getText().equals(data.issBooks[i][1]) && studentIdText.getText().equals(data.issBooks[i][2])) {
    			int index = -1;
    			for (int j = 0; j < data.count; j++) {
    				if (data.issBooks[i][1].equals(data.books[j][0]) )
    	    			index = j;
    			}
    			Integer temp=Integer.parseInt(data.books[index][4].toString()) + 1;
    			data.books[index][4] =(temp.toString() );
    			index = 0;
    			int count = 0;
    			while (index < data.issCount) {
    				if(index == i) {
    					index++;
    					continue;
    				}
    				data.issBooks[count] = data.issBooks[index];
    				index++;
    				count++;
    			}
    			
    			Date reDate = new Date();
    			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    			Date issDate = null;
				try {
					issDate = format.parse((String) data.issBooks[i][5]);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}    			
				
    			data.issCount--;
    			data.updateBookData();
    			data.updateissueData();
    			
				long diff = reDate.getTime() - issDate.getTime(); 
				int days = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
				found = true;
				System.out.println(days);
				
				if(days > 2) {
					JOptionPane.showMessageDialog(null, "Late return fee should be paid: " + ((days - 2)*2)+ "$", "Message",JOptionPane.PLAIN_MESSAGE);
				}
    			JOptionPane.showMessageDialog(null, "Book returned successfully!", "Message",JOptionPane.PLAIN_MESSAGE);
    			continue;
    		}
    	}
    	  if(!found) {  	
    	JOptionPane.showMessageDialog(null, "Sorry, unable to return book!", "Message",JOptionPane.PLAIN_MESSAGE);
    	}
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField bookCallText;
    private javax.swing.JTextField studentIdText;

}
