package gui;

public class librarian {
	
	private String id;
	
	private String name;
	
	private String password;
	
	private String email;
	
	private String address;
	
	private String city;
	
	private String contact;
	
	public int count = 0;
	
	public librarian() {}
	
	public librarian(String id, String name, String password, String email, String address, String city, String contact) {
		
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.address = address;
		this.city = city;
		this.contact = contact;
	}
	
	// increase the number of librarians
	public void setCount(int count) {
		this.count = count;
	}
	
	// get number of librarians
	public int getCount() {
		return count;
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
	
	public String[] getAll() {
		String[] all = {this.id, this.name, this.password, this.email, this.address, this.city, this.contact};
		return all;
	}
	
	
}