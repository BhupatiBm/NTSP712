package com.nt.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.comp.Veichle;

public class StrategyTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Veichle viechle=null;
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/config/applicationContext.xml"));
		viechle=factory.getBean("vech",Veichle.class);
		viechle.journy("bbsr", "sblp");
		
	}

}
