package model;

public class Customer {

	protected String name;
	protected String age;
	protected String phoneNo;
	protected String email;
	
	public Customer() {
		
	}
	public Customer(String phoneNo) {
		super();
		this.phoneNo = phoneNo;
	}
	public Customer(String name, String age, String phoneNo, String email) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setage(String age) {
		this.age = age;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
