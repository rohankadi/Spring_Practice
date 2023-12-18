package com.kodnest.Spring_Project8_Annotation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	@Autowired
	@Qualifier("dr3")  //it makes @Autowired use of "byName" type autowiring instead of "byType"
	Driver dr;

	public Car() {
	}
	
	public Car(Driver dr) {
		this.dr = dr;
		System.out.println("Constructor got executed");
	}

	public Driver getDr() {
		return dr;
	}

	public void setDr(Driver dr) {
		this.dr = dr;
		System.out.println("Setter got excecuted");
	}
	
	@Override
	public String toString() {
		return "Car [dr=" + dr + "]";
	}
}
