package com.kodnest.SpringBoot1;

public class Student {
	//Attributes
	int rollNo;
	String name;
	int yop;

	//non-parameterized constructor
	public Student() {
	}

	//parameterized constructor
	public Student(int rollNo, String name, int yop) {
		this.rollNo = rollNo;
		this.name = name;
		this.yop = yop;
	}
	
	//Getters and Setters
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	//toString() method
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", yop=" + yop + "]";
	}
	
}
