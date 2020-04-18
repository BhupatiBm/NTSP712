package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.manager.AuthenticateManager;
import com.nt.service.BankService;

public class ClientTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		AuthenticateManager manager=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfg/ApplicationContext.xml");
		proxy=ctx.getBean("BankService", BankService.class);
		manager=ctx.getBean("authManager",AuthenticateManager.class);
		manager.signIn("BHUPATI", "123456");
		System.out.println(proxy.withdraw(1001, 100));
		System.out.println(proxy.deposite(1001, 645));
		System.out.println(proxy.withdraw(1002, 100));
		manager.signOut();
		((AbstractApplicationContext) ctx).close();
	}

}
