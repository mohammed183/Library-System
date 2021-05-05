package gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Data {
	
	books[] books = new books[30];
	int booksCount = 0;
	
	int libCount = 0;
	librarian[] lib = new librarian[30];	
	
	int stdCount = 0;
	student[] std = new student[30];

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
				String[] values = line.split(",");
				books[booksCount] = new books(values[0] , values[1], values[2], values[3], Integer.parseInt(values[4]), Integer.parseInt(values[5]), values[6]);
				booksCount++;
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
				String[] value = line.split(",");
				
			    lib[libCount] = new librarian(value[0], value[1], value[2], value[3], value[4], value[5], value[6]);
				libCount++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		path = "stdnts.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((line = br.readLine()) != null) {
				String[] value = line.split(",");
				
			    std[stdCount] = new student(value[0], value[1], value[2], value[3], value[4], value[5], value[6], Integer.parseInt(value[7]));
				stdCount++;
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
				String[] temp = lib[i].getAll();
				pw.println(temp[0] + "," + temp[1] + "," + temp[2] + "," + temp[3] + "," + temp[4] + "," + temp[5] + "," + temp[6]);
				pw.flush();
			}
			pw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void updateStdData() {
		try {
			FileWriter fw = new FileWriter("stdnts.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			for (int i = 0; i < stdCount; i++) {
				Object[] temp = std[i].getAll();
				pw.println(temp[0] + "," + temp[1] + "," + temp[2] + "," + temp[3] + "," + temp[4] + "," + temp[5] + "," + temp[6] + "," + temp[7]);
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

			for (int i = 0; i < booksCount; i++) {
				Object[] temp = books[i].getAll();
				pw.println(temp[0] + "," + temp[1] + "," + temp[2] + "," + temp[3] + "," + temp[4] + "," + temp[5] + "," + temp[6]);
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