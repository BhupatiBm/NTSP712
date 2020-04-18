package com.nt.test;

import java.io.ObjectInputStream.GetField;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Student;

public class ClientAppTest {
	public static void main(String[] args) {
		BeanFactory factory;
		Student st=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		st=factory.getBean("st",Student.class);
		System.out.println(st.toString());
	}

}
