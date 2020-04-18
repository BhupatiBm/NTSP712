package com.nt.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service
public class wishService implements messageGenerator {

	public String messageGenerator() {
		Calendar cal=null;
		int hour=0;
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<=12)
			return "Good morning";
		if(hour<=16 && hour>=12)
			return "Good afternoon";
		else
			return "Good night";
	}
  
}
