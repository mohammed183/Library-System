package gui;

public class issueBooks {
	
	private int id;
	
	private String bookCallNo;
	
	private String studentId;
	
	private String studentName;
	
	private String studentContact;
	
	private String date;
		
	
	public issueBooks(int id, String bookCallNo, String studentId, String studentName, String studentContact, String date ) {
		this.id = id;
		this.bookCallNo = bookCallNo;
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentContact = studentContact;
		this.date = date;
	}
	
	public String getBookCallNo() {
		return bookCallNo;
	}


	public void setBookCallNo(String bookCallNo) {
		this.bookCallNo = bookCallNo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	public String getDate() {
		return date;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentId() {
		return studentId;
	}
	
	
	public Object[] getAll() {
		
		Object[] all = {this.id, this.bookCallNo, this.studentId, this.studentName, this.studentContact, this.date};
		return all;
	}
	

}