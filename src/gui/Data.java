package gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Data {

	public Object[][] books = new Object[30][5];
	public int count = 0;

	public Object[][] lib = new Object[30][7];
	public int libCount = 0;

	public Object[][] issBooks = new Object[30][6];
	public int issCount = 0;

	public Object[][] admins = new Object[30][2];
	public int adCount = 0;

	private void addAdmin(String user, String password) {
		this.admins[adCount][0] = user;
		this.admins[adCount][1] = password;
		this.adCount++;
	}

	private void readData() {
		String line = "";
		String path = "books.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((line = br.readLine()) != null) {
				this.books[this.count] = line.split(",");
				this.count++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		path = "lib.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((line = br.readLine()) != null) {
				this.lib[this.libCount] = line.split(",");
				this.libCount++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		path = "issued.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((line = br.readLine()) != null) {
				this.issBooks[this.issCount] = line.split(",");
				this.issCount++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void updateLibData() {
		try {
			FileWriter fw = new FileWriter("lib.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			//pw.println("Id,Name,Password,Email,Address,City,Contact");
			for (int i = 0; i < libCount; i++) {

				pw.println(lib[i][0] + "," + lib[i][1] + "," + lib[i][2] + "," + lib[i][3] + "," + lib[i][4] + ","
						+ lib[i][5] + "," + lib[i][6]);
				pw.flush();
			}
			pw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
		
	
	public void updateBookData() {
		try {
			FileWriter fw = new FileWriter("books.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			//pw.println("Call No,Name,Author,Pubisher,Qyantity");
			for (int i = 0; i < count; i++) {

				pw.println(books[i][0] + "," + books[i][1] + "," + books[i][2] + "," + books[i][3] + "," + books[i][4]);
				pw.flush();
			}
			pw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
	
	public void updateissueData() {
		try {
			FileWriter fw = new FileWriter("issued.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			//pw.println("Id,Name,Password,Email,Address,City,Contact");
			for (int i = 0; i < issCount; i++) {
				
				pw.println(issBooks[i][0] + "," + issBooks[i][1] + "," + issBooks[i][2] + "," + issBooks[i][3] + "," + issBooks[i][4] + ","
						+ issBooks[i][5]);
				pw.flush();
			}
			pw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] argv) {
		
		Data data = new Data();
		
		data.addAdmin("admin", "admin");
		data.readData();
		
		LibraryManagement open = new LibraryManagement(data);
		open.setVisible(true);
		
	}
}