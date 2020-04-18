package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ArithmeticService;

public class ClientTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ArithmeticService proxy=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
		proxy=ctx.getBean("arthServ",ArithmeticService.class);
		System.out.println("result::"+proxy.div(5, -0));
		System.out.println("*****************************");
		System.out.println("result::"+proxy.div(1, 12));
	}

}
