package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.A;
import com.nt.beans.B;

public class ClientApp {
	public static void main(String[] args) {
		BeanFactory factory;
		A a=null;
		B b=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//a=factory.getBean("a",A.class);
		b=factory.getBean("b",B.class);
		System.out.println("ClientApp.main()");
	}
}
