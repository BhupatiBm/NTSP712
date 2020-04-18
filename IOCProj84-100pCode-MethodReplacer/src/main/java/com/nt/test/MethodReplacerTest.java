package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.BankService;

public class MethodReplacerTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService service=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Bean 
		service=ctx.getBean("bankService",BankService.class);
		System.out.println("serivce  obj class name::"+service.getClass()+"---->"+service.getClass().getSuperclass());
		//invoke method
		System.out.println("Intr Amount::"+service.calcSimpleIntrAmount(100000, 12));
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
