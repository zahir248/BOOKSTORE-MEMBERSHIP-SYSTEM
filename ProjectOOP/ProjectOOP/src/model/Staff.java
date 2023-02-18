package model;

public class Staff{

	protected String name;
	protected String phoneNo;
	protected String username;
	protected String password;

	public Staff() {
		
	}
	
	public Staff(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Staff(String name, String phoneNo, String username, String password) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.username = username;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
