package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Person;

public class NullInjectionTest {
	public static void main(String[] args) {
		
	BeanFactory fact;
	Person ps;
	fact=new XmlBeanFactory(new ClassPathResource("com/nt/cnfg/ApplicationContext.xml"));
	ps=fact.getBean("pd",Person.class);
	System.out.println(ps);
	System.out.println("********************************");
	System.out.println(ps.toString());
	
	}
}
