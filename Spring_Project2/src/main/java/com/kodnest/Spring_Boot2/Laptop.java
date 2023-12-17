package com.kodnest.Spring_Boot2;

public class Laptop {
	//Attributes
	int serialNo;
	String brand;
	int price;
	//zero-parameterised constructor
	public Laptop() {
	}

	//parameterised constructor
	public Laptop(int serialNo, String brand, int price) {
		this.serialNo = serialNo;
		this.brand = brand;
		this.price = price;
	}
	//tostring()
	@Override
	public String toString() {
		return "Laptop [serialNo=" + serialNo + ", brand=" + brand + ", price=" + price + "]";
	}

	//getters and setters
	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
