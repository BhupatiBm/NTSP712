package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.SheduleReminder;

public class ClientApp {
	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		SheduleReminder sr=null;
		//create io conitainer
		ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get bean
		sr=ctx.getBean("reminder",SheduleReminder.class);
		System.out.println(sr.showTodaysApontments());
		
	}
}
