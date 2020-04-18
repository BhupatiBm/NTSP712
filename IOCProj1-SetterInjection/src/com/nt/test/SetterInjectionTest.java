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
		WishMessageGenerator generator=null;
		res= new FileSystemResource("src/com/nt/cnfg/ApplicationContext.xml");
		factory=new XmlBeanFactory(res);
		obj=factory.getBean("wmg");
		generator =(WishMessageGenerator)obj;
		System.out.println("result::"+generator.generateMessage(" Bhupati "));
		
	}

}
