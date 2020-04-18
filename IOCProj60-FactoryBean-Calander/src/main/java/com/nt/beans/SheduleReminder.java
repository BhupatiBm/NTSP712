package com.nt.beans;

import java.util.Calendar;
import java.util.Date;

public class SheduleReminder {
	private Calendar date;
	
	public SheduleReminder(Calendar date) {
		this.date=date;
	}
	public String showTodaysApontments() {
		Calendar sysDate=Calendar.getInstance();
		if(date.get(Calendar.YEAR)==sysDate.get(Calendar.YEAR) && date.get(Calendar.MONTH)==sysDate.get(Calendar.MONTH) && date.get(Calendar.DATE)==sysDate.get(Calendar.DATE))
		{
			return "Doctor apontment is today";
		}
		else
			return "No apointment today";
					}

}
