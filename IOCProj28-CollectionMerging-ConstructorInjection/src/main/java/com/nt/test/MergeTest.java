package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.nt.bean.Employee;

public class MergeTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Employee emp=null;
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfg/applicationContext.xml"));
		emp=factory.getBean("ep2",Employee.class);
		System.out.println(emp);

	}

}
