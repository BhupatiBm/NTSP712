package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VotingElgibilityCheck;

public class BeanLifeCycleTestDeclarative {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		VotingElgibilityCheck vec=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		vec=ctx.getBean("voter",VotingElgibilityCheck.class);
		//invoke b.method
		System.out.println(vec.checkUrVotingElgibility());
		
		//close container
		((AbstractApplicationContext) ctx).close();
		

	}

}
