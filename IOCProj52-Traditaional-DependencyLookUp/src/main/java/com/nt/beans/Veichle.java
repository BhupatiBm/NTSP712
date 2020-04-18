package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Veichle {
	private String beanId;

	public Veichle(String beanId) {
		System.out.println("Veichle::1 param constructor::method");
		this.beanId = beanId;
	}
	
	public void entertaniment() {
		//System.out.println("Veichle.entertaniment()::method");
		System.out.println("dvd player");
	}
	
	public void horn() {
		//System.out.println("Veichle.horn()");
		System.out.println("skoda horn");
	}
	
	public void journey(String startplace,String destplace) {
		//System.out.println("Veichle.journey()::method");
		ApplicationContext ctx=null;
		Engine eng=null;
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get dependency class oblect thhrough (lookup)
		eng=ctx.getBean(beanId, Engine.class);
		eng.start();
		System.out.println("journy started from::"+startplace+".... end at::"+destplace);
		eng.stop();
	}
	

}
