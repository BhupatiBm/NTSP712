package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.TestBean;

public class SpringBeanLifeCycleTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		TestBean test=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
		test=ctx.getBean("tb", TestBean.class);
		System.out.println("result::"+test.sayHello("bhupati"));
		((AbstractApplicationContext) ctx).close();
	}

}
