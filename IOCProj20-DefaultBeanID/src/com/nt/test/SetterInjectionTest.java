package com.nt.test;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		WishMessageGenerator generator=null,generator1=null;
		res= new FileSystemResource("src/com/nt/cnfg/ApplicationContext.xml");
		factory=new XmlBeanFactory(res);
		obj=factory.getBean("com.nt.beans.WishMessageGenerator");
		generator =(WishMessageGenerator)obj;
		System.out.println("result1::"+generator.generateMessage(" Bhupati "));
		System.out.println("***************************************************");
		generator1= factory.getBean("com.nt.beans.WishMessageGenerator#1" ,WishMessageGenerator.class);
		System.out.println("result2::"+generator1.generateMessage(" rani "));
	}

}
