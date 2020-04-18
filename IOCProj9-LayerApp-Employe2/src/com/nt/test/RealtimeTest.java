package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;


public class RealtimeTest {
	public static void main(String[] args) {
		BeanFactory factory=null;
		MainController controller=null;
		String empno=null,empname=null,empdept=null,empsal=null,result=null;
		EmployeeVO vo=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cnfg/applicationContext.xml"));
		controller=factory.getBean("controller",MainController.class);
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("Enter Employee Number: ");
		empno=sc.next();
		System.out.println("Enter Employee Name: ");
		empname=sc.next();
		System.out.println("Enter Employee Department: ");
		empdept=sc.next();
		System.out.println("Enter Employee Salary: ");
		empsal=sc.next();
		vo=new EmployeeVO();
		vo.setEmpNo(empno);
		vo.setEmpName(empname);
		vo.setEmpDept(empdept);
		vo.setEmpSall(empsal);
		try {
			result=controller.processEmployee(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Interface problem");
		}
	}

}
