package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;

import com.nt.vo.StudentVO;

public class SchoolStudentTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		MainController controller=null;
		String sno=null,sname=null,saddress=null,m1=null,m2=null,m3=null,result=null;
		StudentVO vo=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cnfg/applicationContext.xml"));
		controller=factory.getBean("controller",MainController.class);
		Scanner sc;
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
