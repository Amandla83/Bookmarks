package com.semanticsquare.thrillio.entities;

public class User {
	private long id;
	private String e_mail;
	private String password;
	private String firstName;
	private String lastName;
	private int gender;
	private String userType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}
