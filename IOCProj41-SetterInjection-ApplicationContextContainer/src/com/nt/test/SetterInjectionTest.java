package com.nt.test;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		Resource res=null;
		ApplicationContext ctx=null;
		Object obj=null;
		WishMessageGenerator generator=null;
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cnfg/ApplicationContext.xml");
		
		generator =ctx.getBean("wmg",WishMessageGenerator.class);
		System.out.println("result::"+generator.generateMessage(" Bhupati "));
		
	}

}
