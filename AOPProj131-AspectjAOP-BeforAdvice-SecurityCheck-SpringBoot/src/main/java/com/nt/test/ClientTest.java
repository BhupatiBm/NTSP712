package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import com.nt.manager.AuthenticateManager;
import com.nt.service.BankService;

@SpringBootApplication
@ComponentScan(basePackages = "com.nt.advice,com.nt.dao,com.nt.manager,com.nt.service")
public class ClientTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		AuthenticateManager manager=null;
		ctx=SpringApplication.run(ClientTest.class, args);
		proxy=ctx.getBean("bankService", BankService.class);
		manager=ctx.getBean("authManager",AuthenticateManager.class);
		manager.signIn("BHUPATI", "123456");
		System.out.println(proxy.withdraw(1001, 1000.5f));
		System.out.println(proxy.deposite(1001, 645));
		manager.signOut();
		((AbstractApplicationContext) ctx).close();
	}

}
