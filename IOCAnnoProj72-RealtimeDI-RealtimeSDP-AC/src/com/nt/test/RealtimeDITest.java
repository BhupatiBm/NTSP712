package com.nt.test;

import java.io.Closeable;
import java.util.Scanner;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.vo.StudentVO;

public class RealtimeDITest {

	public static void main(String[] args) {
         ApplicationContext ctx=null;		
		MainController controller=null;
		Scanner sc=null;
		String sname=null,sadd=null,m1=null,m2=null,m3=null;
		StudentVO vo=null;
		//create IOC containe
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
        //get Controller class obj
		controller=ctx.getBean("controller",MainController.class);
		//read inputs
		sc=new Scanner(System.in);
		 System.out.println("Enter student name::");
		 sname=sc.next();
		 System.out.println("Enter student addrs::");
		 sadd=sc.next();
		 System.out.println("Enter student Marks1::");
		 m1=sc.next();
		 System.out.println("Enter student Marks2::");
		 m2=sc.next();
		 System.out.println("Enter student Marks3::");
		 m3=sc.next();
		 
		 //prepare VO class obj
		 vo=new StudentVO();
		 vo.setSname(sname); vo.setSadd(sadd);
		 vo.setM1(m1); vo.setM2(m2); vo.setM3(m3);
		 
		 //invoke method
		 try {
			 System.out.println(controller.processStudent(vo));
		 }
		 catch(Exception e) {
			 System.out.println("Internal Problem");
			 e.printStackTrace();
		 }
		 //close container
		 ((AbstractApplicationContext) ctx).close();
	}
}
