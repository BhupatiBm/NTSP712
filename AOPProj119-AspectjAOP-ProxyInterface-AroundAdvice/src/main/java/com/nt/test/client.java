package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.InterBankService;

public class client {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		InterBankService proxy=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		proxy=ctx.getBean("bank",InterBankService.class);
		System.out.println(proxy.getClass());
		
		try {
			System.out.println("simple intrest is:"+proxy.simpleIntrest(1000, 10, 1.4f));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("************************************************************");
		
		try {
			System.out.println("compound intrest is:"+proxy.compoundIntrest(1000, 2, 1.4f));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("compound intrest is:"+proxy.compoundIntrest(1000, 2, 1.4f));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("compound intrest is:"+proxy.compoundIntrest(1000, 2, 1.4f));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		((AbstractApplicationContext) ctx).close();
		
	}
}
