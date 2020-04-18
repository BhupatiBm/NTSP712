package com.nt.beans;

import java.util.Date;

import javax.xml.crypto.Data;

import lombok.Setter;

public class Person {
	private String name;
	private String address;
	private int age;
	private Date dob;

	public Person(String name, String address, int age, Date dob) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + ", dob=" + dob + "]";
	}
	
	
	

}
