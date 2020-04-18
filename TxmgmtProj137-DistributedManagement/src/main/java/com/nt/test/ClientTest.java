package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class ClientTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		proxy=ctx.getBean("bankService",BankService.class);
		try {
			System.out.println(proxy.monyTransfer(102, 1911, 53));
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
