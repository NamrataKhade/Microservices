package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

	private Long userID;
	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

	private String name;
	private String phone;
	
	List<Contact> contact=new ArrayList<>();
	
	public User() {
		super();
	}

	public User(Long userID, String name, String phone, List<Contact> contact) {
		super();
		this.userID = userID;
		this.name = name;
		this.phone = phone;
		this.contact = contact;
	}

	public User(Long userID, String name, String phone) {
		super();
		this.userID = userID;
		this.name = name;
		this.phone = phone;
	}
	
	

}
