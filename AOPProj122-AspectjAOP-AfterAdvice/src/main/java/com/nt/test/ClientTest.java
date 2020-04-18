package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ShoppingOnline;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ShoppingOnline proxy=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
		proxy=ctx.getBean("Shopping",ShoppingOnline.class);
		System.out.println("Total :"+proxy.generateBillAmount(new String[] {"tv","ac"},new float[] {5000,1000}));
		((AbstractApplicationContext) ctx).close();

	}

}
//(new String[] {"tv","ac"},new float[] {500,1000})
//(new String[] {"trouser","shirt"},new float[] {9000,8000} )
