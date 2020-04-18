package com.nt.beans;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class CalendarFactoryBean implements FactoryBean<Calendar> {
	private int year;
	private int month;
	private int date;
	public CalendarFactoryBean(int year, int month,int date) {
		System.out.println("CalendarFactoryBean::3 param constructor");
		this.year = year;
		this.month = month-1;
		this.date = date;
	}
	@Override
	public Calendar getObject() throws Exception {
		System.out.println("CalendarFactoryBean.getObject()");
		Calendar calendar=null;
		calendar=Calendar.getInstance();
		calendar.set(Calendar.YEAR,year);
		calendar.set(Calendar.MONTH,month);
		calendar.set(Calendar.DATE,date);
		return calendar;
	}
	@Override
	public Class<?> getObjectType() {
		System.out.println("CalendarFactoryBean.getObjectType()");
		return Calendar.class;
	}
	@Override
	public boolean isSingleton() {
		System.out.println("CalendarFactoryBean.isSingleton()");
		return false;
	}
	

}
