package com.nt.beans;

import java.util.Date;

public class SheduleReminder {
	private Date date;
	
	public SheduleReminder(Date date) {
		this.date=date;
	}
	public String showTodaysApontments() {
		Date sysDate=new Date();
		if(date.getYear()==sysDate.getYear() && date.getMonth()==sysDate.getMonth() && date.getDate()==sysDate.getDate())
			return "Doctor apontment is today";
		else
			return "No apointment today";
	}

}
