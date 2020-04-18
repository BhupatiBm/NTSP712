package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Cricketer;

public class DependencyLookupTest {
	public static void main(String[] args) {
		BeanFactory factory=null;
		Cricketer crcket=null;
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfg/applicationContext.xml"));
		crcket=factory.getBean("crck",Cricketer.class);
		crcket.filding();
		crcket.batting(factory);
		crcket.bowling();
	}

}
