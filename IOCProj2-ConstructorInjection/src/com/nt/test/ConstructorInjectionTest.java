package com.nt.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest {
	public static void main(String[] args) {
		BeanFactory factory=null;
		WishMessageGenerator generator=null;
		factory=new XmlBeanFactory(new ClassPathResource("ApplicationContext.xml"));
		generator =(WishMessageGenerator)factory.getBean("wmg");
		
		System.out.println(generator.generateMessage(" Bhupati "));
		
	}

}
