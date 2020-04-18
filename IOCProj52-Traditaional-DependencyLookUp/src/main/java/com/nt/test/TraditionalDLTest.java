package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Veichle;

public class TraditionalDLTest {
	public static void main(String[] args) {
		//System.out.println("TraditionalDLTest.main()");
		ApplicationContext ctx=null;
		Veichle vc=null;
		//create ioc contaiiner
		ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get targetbean class object
		vc=ctx.getBean("veichle",Veichle.class);
		//invoke the methods
		vc.journey("bbsr","angul");
		vc.entertaniment();
		vc.horn();
		((AbstractApplicationContext) ctx).close();
		
	}

}
