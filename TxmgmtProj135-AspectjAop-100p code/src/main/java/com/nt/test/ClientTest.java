package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.cfgs.ApplicationConfig;
import com.nt.service.BankServices;

public class ClientTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankServices proxy=null;
		ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
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
