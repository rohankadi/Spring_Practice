package com.kodnest.Spring_Project4;

public class KodNestClasses {

	Trainer tr;
	
	public KodNestClasses() {
	}

	public KodNestClasses(Trainer tr) {
		this.tr = tr;
	}

	public Trainer getTr() {
		return tr;
	}

	public void setTr(Trainer tr) {
		this.tr = tr;
	}

	@Override
	public String toString() {
		return "KodNestClasses [tr=" + tr + "]";
	}
}
