package com.customer.jquery;

public class City {
 int id;
 String name;
 String country_code;
 String district;
 String info;
public City(int id, String name, String country_code, String district, String info) {
	super();
	this.id = id;
	this.name = name;
	this.country_code = country_code;
	this.district = district;
	this.info = info;
}
public City(int id) {
	super();
	this.id = id;
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
public String getCountry_code() {
	return country_code;
}
public void setCountry_code(String country_code) {
	this.country_code = country_code;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getInfo() {
	return info;
}
public void setInfo(String info) {
	this.info = info;
}
 
 
}
