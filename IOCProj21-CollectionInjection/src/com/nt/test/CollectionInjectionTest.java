package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.bens.Student;

public class CollectionInjectionTest {
	public static void main(String[] args) {
		BeanFactory factory;
		Student st1=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cnfg/applicationContext.xml"));
		st1=factory.getBean("mrk",Student.class);
		System.out.println(st1);
		System.out.println("*************************************");
		System.out.println(st1.toString());
		
	}

}
