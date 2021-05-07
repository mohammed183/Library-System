package gui;

public class Student {
	
	private String id;
	
	private String name;
	
	private String password;
	
	private String email;
	
	private String address;
	
	private String city;
	
	private String contact;
	
	private Integer issBooks = 0;
	
	
	public int count = 0;
	
	public Student(String id, String name, String password, String email, String address, String city, String contact, Integer issBook) {
		this.issBooks = issBook;
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.address = address;
		this.city = city;
		this.contact = contact;
	}
	
	int getIss() {
		return this.issBooks;
	}
	
	void setIss(int x) {
		this.issBooks += x;
	}

	//  get Id method
	public String getId() {
		return id;
	}
	
	//  get name method
	public String getName() {
		return name;
	}
	
	public String getPassword() {
		return password;
	}
	
	//  get password method
	public String getEmail() {
		return email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getContact() {
		return contact;
	}
	
	public Object[] getAll() {
		Object[] all = {this.id, this.name, this.password, this.email, this.address, this.city, this.contact, this.issBooks};
		return all;
	}
	
	
}