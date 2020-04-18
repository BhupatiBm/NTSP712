package com.nt.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

public class FactoryMethodTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Calendar c1=null;
		Properties s1=null;
		Class c2=null;
		String st1=null,st2=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("src/main/java/com/nt/cfg/applicationContext.xml"));
		
		c1=factory.getBean("cal",Calendar.class);
		System.out.println("Calender data::"+c1+"	calender class name::"+c1.getClass());
		System.out.println("************************************************************************");
		
		s1= factory.getBean("propes",Properties.class);
		System.out.println("Calender data::"+s1+"	calender class name::"+s1.getClass());
		System.out.println("************************************************************************");
		
		c2=factory.getBean("cl",Class.class);
		System.out.println("Calender data::"+c2+"	calender class name::"+c2.getClass());
		System.out.println("************************************************************************");
		
		st1=factory.getBean("s2",String.class);
		System.out.println("Calender data::"+st1+"	calender class name::"+st1.getClass());
		System.out.println("************************************************************************");
		

		st2=factory.getBean("s4",String.class);
		System.out.println("Calender data::"+st2+"	calender class name::"+st2.getClass());
		
	}

}
