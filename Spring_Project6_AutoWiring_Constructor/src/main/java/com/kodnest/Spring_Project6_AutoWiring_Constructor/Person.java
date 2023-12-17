package com.kodnest.Spring_Project6_AutoWiring_Constructor;

public class Person {

	Mobile mob;

	public Person() {
	}

	public Person(Mobile mob) {
		this.mob = mob;
		System.out.println("Constructor got excecuted");
	}

	public Mobile getMob() {
		return mob;
	}

	public void setMob(Mobile mob) {
		this.mob = mob;
		System.out.println("Setter got excecuted");
	}

	@Override
	public String toString() {
		return "Person [mob=" + mob + "]";
	}
}
