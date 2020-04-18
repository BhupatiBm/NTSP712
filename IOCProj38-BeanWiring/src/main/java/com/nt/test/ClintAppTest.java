package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.TravelAgent;

public class ClintAppTest {

	public static void main(String[] args) {
		TravelAgent ta=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfg/applicationContext.xml");
		ta=(TravelAgent) factory.getBean("ta");
		System.out.println(ta);

	}

}
