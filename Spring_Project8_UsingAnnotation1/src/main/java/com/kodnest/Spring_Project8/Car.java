package com.kodnest.Spring_Project8;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

	/*
	//@Autowired Internally make use of 'byType'
	==> @Autowired will not make use of Setter and Constructor if we want setter is to be used
	then put @Autowired on Settor() method,
	
	///ly 
     if we want constructor is to be used then put @Autowired on Constructor() method,
	*/
	
   //01.
    @Autowired 
	Driver dr;

	public Car() {
		System.out.println("0-Para Constructor executed");
	}

	//02. 
    //@Autowired
	public Car(Driver dr) {
		this.dr = dr;
		System.out.println("Parameterized Constructor executed");
	}

	public Driver getDr() {
		return dr;
	}

	//03 
	//@Autowired
	public void setDr(Driver dr) {
		this.dr = dr;
		System.out.println("Setter got excecuted");
	}

	@Override
	public String toString() {
		return "Car [dr=" + dr + "]";
	}
}
