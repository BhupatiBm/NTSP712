package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.nt.bean.Customer;

public class BeanInheritanceTest {
	public static void main(String[] args) {
		BeanFactory factory=null;
		Customer cus1=null,cus2=null;
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfg/applicationContext.xml"));
		cus1=factory.getBean("pu1",Customer.class);
		System.out.println(cus1);
		System.out.println("********************************");
		cus2=factory.getBean("pu2",Customer.class);
		System.out.println(cus2);
	}

}
