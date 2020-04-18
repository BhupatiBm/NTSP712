package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Bank;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext ctx;
		Bank bank=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		bank=ctx.getBean("bank",Bank.class);
		System.out.println("Intr Amt::"+bank.clcIntrAmt(1000, 2000,0.2f));

	}
	
}
