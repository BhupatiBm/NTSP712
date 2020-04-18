package com.nt.beans;

import javax.sound.midi.Soundbank;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class MyServletContainer {
	
	public MyServletContainer() {
	   System.out.println("MyServletContainer.0-param consturctor");
	 
	}
	public abstract RequestHandler getRequestHandler();
	
	public void  handleRequest(String data) {
		
		RequestHandler handler=null;
		  System.out.println("MyServletContainer.handleRequest() with Data:::"+data);
		  //get Dependent Bean 
		  handler=getRequestHandler();
		  //System.out.println("1234:"+handler);
		  //System.out.println("5566"+data);
		  handler.processRequest(data);
	}

	

}
