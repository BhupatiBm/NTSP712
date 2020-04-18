package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;
import com.nt.config.AppConfig;

public class AutowireTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Flipkart fpkt=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get bean
		fpkt=ctx.getBean("fpkt",Flipkart.class);
		//invoke the method
		System.out.println(fpkt.shopping(new String[] {"cake","drinks","snacks"},new float[] {1000,500,1000}));
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}
}
