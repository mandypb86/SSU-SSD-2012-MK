package com.tim.ticd.model;

import java.util.List;


public class Accommodation {

	private int id;
	private String name;
	private String street;
	private String city;
	private String postcode;
	private String phone;
	private String email;
	private String website;
	private int rooms;
	private float price;
	private String image;
	private List<String> facilities;
	
	
	public Accommodation(int id, String n, String s, String c, String pc,
			String ph, String e, String w, int r, float p, String im, List<String> f)
	{
		this.id = id;
		this.name = n;
		this.street = s;
		this.city = c;
		this.postcode = pc;
		this.email = e;
		this.website = w; 
		this.rooms = r;
		this.price = p;
		this.image = im;
		this.facilities = f;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
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
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public List<String> getFacilities() {
		return facilities;
	}
	public void setFacilities(List<String> facilities) {
		this.facilities = facilities;
	}
	
	
}
