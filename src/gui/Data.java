package gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Data {
	
	Books[] Books = new Books[30];
	int BooksCount = 0;
	
	int libCount = 0;
	Librarian[] lib = new Librarian[30];	
	
	int stdCount = 0;
	Student[] std = new Student[30];

	IssueBooks[] issBooks = new IssueBooks[30];
	int issCount = 0;

	public Object[][] admins = new Object[30][2];
	public int adCount = 0;

	private void addAdmin(String user, String password) {
		this.admins[adCount][0] = user;
		this.admins[adCount][1] = password;
		this.adCount++;
	}

	private void readData() {
		String line = "";
		String path = "Books.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				Books[BooksCount] = new Books(values[0] , values[1], values[2], values[3], Integer.parseInt(values[4]), Integer.parseInt(values[5]), values[6]);
				BooksCount++;
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
				
			    lib[libCount] = new Librarian(value[0], value[1], value[2], value[3], value[4], value[5], value[6]);
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
				
			    std[stdCount] = new Student(value[0], value[1], value[2], value[3], value[4], value[5], value[6], Integer.parseInt(value[7]));
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
				String[] value = line.split(",");
				issBooks[issCount] =new IssueBooks(Integer.parseInt(value[0]), value[1], value[2], value[3], value[4], value[5]);						
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
			FileWriter fw = new FileWriter("Books.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			for (int i = 0; i < BooksCount; i++) {
				Object[] temp = Books[i].getAll();
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
				Object[] temp = issBooks[i].getAll();
				pw.println(temp[0] + "," + temp[1] + "," + temp[2] + "," + temp[3] + "," + temp[4] + "," + temp[5]);
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