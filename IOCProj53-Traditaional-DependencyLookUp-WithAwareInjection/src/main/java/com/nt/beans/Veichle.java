package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Veichle implements ApplicationContextAware{
	private String beanId;
	private ApplicationContext ctx=null;

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Veichle.setApplicationContext()::1 param");
		this.ctx=ctx;
		
	}
	
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
		Engine eng=null;
		//get dependency bean class object through(lookup)
		eng=ctx.getBean(beanId, Engine.class);
		eng.start();
		System.out.println("journy started from::"+startplace+".... end at::"+destplace);
		eng.stop();
	}

	

}
