package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.MathFunctions;

public class ClientTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		MathFunctions proxy=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		proxy=ctx.getBean("mathFun",MathFunctions.class);
		System.out.println(proxy.sum(5,6));
		System.out.println("***********************");
		System.out.println(proxy.subs(5,6));
		System.out.println("***********************");
		System.out.println(proxy.mul(5,6));
		System.out.println("***********************");
		System.out.println(proxy.div(5,6));
		System.out.println("***********************");
		System.out.println("throws error::"+proxy.div(5,0));
		System.out.println("***********************");
		
	}

}
