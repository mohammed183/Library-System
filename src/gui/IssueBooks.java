package gui;

public class IssueBooks {
	
	private int id;
	
	private String bookCallNo;
	
	private String StudentId;
	
	private String StudentName;
	
	private String StudentContact;
	
	private String date;
		
	
	public IssueBooks(int id, String bookCallNo, String StudentId, String StudentName, String StudentContact, String date ) {
		this.id = id;
		this.bookCallNo = bookCallNo;
		this.StudentId = StudentId;
		this.StudentName = StudentName;
		this.StudentContact = StudentContact;
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
	public void setStudentId(String StudentId) {
		this.StudentId = StudentId;
	}

	public String getStudentId() {
		return StudentId;
	}
	
	
	public Object[] getAll() {
		
		Object[] all = {this.id, this.bookCallNo, this.StudentId, this.StudentName, this.StudentContact, this.date};
		return all;
	}
	

}