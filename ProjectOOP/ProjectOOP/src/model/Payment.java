package model;

public class Payment {

	private String buyID;
	private String bookname;
	private String quantity;
	private String phoneNo;
	private String totalPrice;
	private String date;
	
	public Payment() {
		
	}
	public String getBuyID() {
		return buyID;
	}
	public void setBuyID(String buyID) {
		this.buyID = buyID;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
