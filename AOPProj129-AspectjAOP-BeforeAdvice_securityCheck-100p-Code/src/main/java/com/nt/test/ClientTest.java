package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.cfg.AopConfig;
import com.nt.manager.AuthenticateManager;
import com.nt.service.BankService;

public class ClientTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		AuthenticateManager manager=null;
		ctx=new AnnotationConfigApplicationContext(AopConfig.class);
		proxy=ctx.getBean("bankService", BankService.class);
		manager=ctx.getBean("authManager",AuthenticateManager.class);
		manager.signIn("BHUPATI", "123456");
		System.out.println(proxy.withdraw(1001, 1000.5f));
		System.out.println(proxy.deposite(1001, 645));
		manager.signOut();
		((AbstractApplicationContext) ctx).close();
	}

}
