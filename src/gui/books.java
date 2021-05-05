package gui;

public class books {
	public int count = 0;
	private String callNo;
	private String name;
	private String author;
	private String publisher;
	private int quantity;
	private int issued;
	private String addDate;

	void setAll(String callNo, String name, String author, String publisher, int quantity, String addDate, int issued) {
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

	String getCallNo() {
		return this.callNo;
	}
	
	int getQuantity() {
		return this.quantity;
	}
}
