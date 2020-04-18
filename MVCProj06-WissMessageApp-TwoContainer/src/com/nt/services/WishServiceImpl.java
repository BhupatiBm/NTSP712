package com.nt.services;

import java.util.Calendar;

public class WishServiceImpl implements WishService {

	@Override
	public String generateWishMessage() {
		String message=null;
		Calendar cal=null;
		int hour=0;
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12)
			message="Good morning";
		else if(hour>12 && hour<20)
			message="Good evening";
		else
			message="good night"; 
		
		return message;
	}

}
