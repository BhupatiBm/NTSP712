package com.nt.beans;

import org.springframework.beans.factory.annotation.Required;

public class Address {
	private String houseNo;
	private String street;
	private String location;
	private String state;
	
	
	@Required
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	
	@Required
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", location=" + location + ", state=" + state
				+ "]";
	}

	
}
