package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
	
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator::1 param constructor");
		this.date=date;
	}
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0 param constructor");
	}
	public String generateMessage(String user) {
		int hour=0;
		System.out.println("injected Date::"+date);
		hour=date.getHours();
		if(hour<12)
			return "Good Morning:::"+user;
		else if(hour<16)
			return "Good AfterNoon:::"+user;
		else if(hour<20)
			return "Good Evening:::"+user;
		else
			return "Good Night:::"+user;
	}

}
