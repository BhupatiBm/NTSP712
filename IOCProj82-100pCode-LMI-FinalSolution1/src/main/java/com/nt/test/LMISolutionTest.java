package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WebContainer;
import com.nt.config.AppConfig;

public class LMISolutionTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WebContainer container=null,container1=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Bean
		container=ctx.getBean("container",WebContainer.class);
		System.out.println("taget Bean obj class name::"+container.getClass()+"  "+container.getClass().getSuperclass());
		//invoke methods
		container.processRequest("hello");
		System.out.println("...................................................");
		//get Bean
		container1=ctx.getBean("container",WebContainer.class);
		//invoke methods
		container1.processRequest("hai");
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
