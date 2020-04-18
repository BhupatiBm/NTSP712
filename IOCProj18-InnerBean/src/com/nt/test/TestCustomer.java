package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.BankAccount;
import com.nt.beans.BankCustomer;

public class TestCustomer {

	public static void main(String[] args) {
		BeanFactory factory;
		BankCustomer customer=null;
		BankAccount ba=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfg/applicationContext.xml"));
		customer=factory.getBean("bmcusto",BankCustomer.class);
		System.out.println(customer.toString());
		System.out.println( customer.getBalance());
		
	}

}
