package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.bean.CheckVoting;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		CheckVoting chv=null;
		ctx= new FileSystemXmlApplicationContext("src/main/java/com/nt/cfg/applicationContext.xml");
		chv=ctx.getBean("cv",CheckVoting.class);
		System.out.println(chv.checkVotingeligibility());
		((AbstractApplicationContext) ctx).close();

	}

}
