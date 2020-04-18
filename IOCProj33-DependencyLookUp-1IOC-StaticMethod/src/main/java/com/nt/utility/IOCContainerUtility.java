package com.nt.utility;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class IOCContainerUtility {
	private static BeanFactory factory=null;
	static {
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfg/applicationContext.xml"));
	}
	public static BeanFactory getContainer() {
		if(factory!=null)
			return factory;
		else
			return null;
	} 

}
