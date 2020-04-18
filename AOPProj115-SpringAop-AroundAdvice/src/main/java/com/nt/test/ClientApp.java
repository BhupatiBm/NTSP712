package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.BankService;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		proxy=ctx.getBean("pfb",BankService.class);
		
		try {
			System.out.println("intrest amount is"+proxy.calcIntrAmount(5000, (float) 1, 20));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("------------------------------------------------");
		
		try {
			System.out.println("intrest amount is"+proxy.calcIntrAmount(50000,1, 10));
		}
		catch (Exception e) {
			e.printStackTrace();	
		}
		((AbstractApplicationContext) ctx).close();
	}
}
