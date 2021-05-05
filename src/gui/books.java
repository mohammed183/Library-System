package gui;

public class books {
	private String callNo = "";
	private String name = "";
	private String author = "";
	private String publisher = "";
	private Integer quantity;
	private Integer issued;
	private String addDate = "";

	books(String callNo, String name, String author, String publisher, Integer quantity, Integer issued,
			String addDate) {
		this.callNo = callNo;
		this.addDate = addDate;
		this.author = author;
		this.name = name;
		this.quantity = quantity;
		this.issued = issued;
		this.publisher = publisher;
	}

	void setQuantity(int x) {
		this.quantity += x;
	}
	
	void setIssued(int x) {
		this.issued += x;
	}

	String getCallNo() {
		return this.callNo;
	}

	Integer getQuantity() {
		return this.quantity;
	}

	Object[] getAll() {
		Object[] all = { this.callNo, this.name, this.author, this.publisher, this.quantity, this.issued,
				this.addDate };
		return all;
	}
}
