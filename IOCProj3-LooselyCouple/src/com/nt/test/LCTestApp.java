package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.bens.Flipkart;

public class LCTestApp {

	public static void main(String[] args) {
	 BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/config/applicationContext.xml"));
	 Flipkart bean=factory.getBean("fkrt",Flipkart.class);
	 String billmsg=bean.purchase(new String[] {"IPHONE 7+","BOOK","SHOOSE"}, new float[] {75000f,2000f,890f});
	 System.out.println(billmsg);
	 
	}

}
