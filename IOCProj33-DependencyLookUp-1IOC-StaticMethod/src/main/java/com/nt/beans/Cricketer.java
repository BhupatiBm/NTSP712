package com.nt.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.nt.utility.IOCContainerUtility;

public class Cricketer {
	String beanid=null;
	
	public void setBeanid(String beanid) {
		this.beanid = beanid;
	}
	
	public void batting() {
		BeanFactory factory=null;
		int runs=0;
		Bat bat=null;
		factory=IOCContainerUtility.getContainer();
		bat=factory.getBean(beanid,Bat.class);
		runs=bat.scoreRun();
		System.out.println("Crickketer bating with run::"+runs);
	}
	public void bowling() {System.out.println("Cricketer is bowling");}
	public void filding() {System.out.println("Cricketer is filding");}

}
