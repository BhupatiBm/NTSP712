package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;

import com.nt.vo.StudentVO;

public class SchoolStudentTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		PropertyPlaceholderConfigurer ppc=null;
		MainController controller=null;
		String sno=null,sname=null,saddress=null,m1=null,m2=null,m3=null,result=null;
		StudentVO vo=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cnfg/applicationContext.xml");
		ppc=factory.getBean("ppc", PropertyPlaceholderConfigurer.class);
		ppc.postProcessBeanFactory(factory);
		controller=factory.getBean("controller",MainController.class);
		Scanner sc=null;
		sc=new Scanner(System.in);
		
		System.out.println("Enter Student name:");
		sname=sc.next();
		System.out.println("Enter Student address:");
		saddress=sc.next();
		System.out.println("Enter Mark1: ");
		m1=sc.next();
		System.out.println("Enter Mark2 : ");
		m2=sc.next();
		System.out.println("Enter Mark3 ");
		vo=new StudentVO();
		m3=sc.next();
	
		vo.setSname(sname);
		vo.setSaddress(saddress);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		try {
			result=controller.procesStudent(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Interface problem");
		}
	}

}
