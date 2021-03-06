package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankServices;

public class ClientTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankServices proxy=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		proxy=ctx.getBean("bankService",BankServices.class);
		
		try {
		System.out.println(proxy.transferMoney(102, 101, 520));
		}
		catch(IllegalAccessException  iae) {
			iae.printStackTrace();
		}
		((AbstractApplicationContext) ctx).close();
	}

}
