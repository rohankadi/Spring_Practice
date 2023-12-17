package com.kodnest.Spring_Project5;

public class Person {

	Mobile mob;

	public Person() {
	}

	public Person(Mobile mob) {
		this.mob = mob;
	}

	public Mobile getMob() {
		return mob;
	}

	public void setMob(Mobile mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Person [mob=" + mob + "]";
	}
}
