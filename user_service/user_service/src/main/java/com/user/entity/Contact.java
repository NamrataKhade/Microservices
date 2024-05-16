package com.user.entity;

public class Contact {
	private long cID;
	private String contactName;
	private String email;
	private Long userID;
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(long cID, String contactName, String email, Long userID) {
		super();
		this.cID = cID;
		this.contactName = contactName;
		this.email = email;
		this.userID = userID;
	}

	public long getcID() {
		return cID;
	}

	public void setcID(long cID) {
		this.cID = cID;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}
	
	
	

}
