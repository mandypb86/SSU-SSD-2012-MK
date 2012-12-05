package com.tim.ticd.model;

public class Customer {
	
	private int ID;
	private String name;
	private String surname;
	private String property;
	private String street;
	private String city;
	private String postcode;
	private String phone;
	private String mobile;
	private String email;
	private String birthdate;
	
	// empty constructor needed for Customer-Wizard
	public Customer(){};
	
	public Customer (int ID, String n, String sn, String p, String st,
			String c, String pc, String ph, String m, String e, String bd) {
		this.ID = ID;
		this.name = n;
		this.property = p;
		this.street = st;
		this.city = c;
		this.postcode = pc;
		this.surname = sn;
		this.mobile = m;
		this.phone = ph;	
		this.email = e;
		this.birthdate = bd;
		
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

}
