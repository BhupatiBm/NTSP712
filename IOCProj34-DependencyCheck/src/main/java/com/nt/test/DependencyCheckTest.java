package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.nt.bean.Student;

public class DependencyCheckTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Student st=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions( new FileSystemResource( "src/main/java/com/nt/cfg/applicationContext.xml"));
		st=factory.getBean("stu",Student.class);
		System.out.println(st);

	}

}
