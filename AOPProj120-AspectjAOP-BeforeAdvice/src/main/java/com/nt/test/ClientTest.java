package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankLoanAprover;

public class ClientTest {
	public static void main(String[] args) {
		BankLoanAprover proxy=null;
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
		proxy=ctx.getBean("bank",BankLoanAprover.class);
		System.out.println("loan::"+proxy.Aprove(101, 25000, "agriculture"));
		System.out.println("*****************************************************");
		System.out.println("loan::"+proxy.Aprove(102, 5000, "veichle"));
		((AbstractApplicationContext) ctx).close();
	}

}
