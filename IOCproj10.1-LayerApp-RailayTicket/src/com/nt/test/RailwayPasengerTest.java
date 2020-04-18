package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.RailwayController;
import com.nt.vo.RailwayVO;

public class RailwayPasengerTest {

	public static void main(String[] args) {
		System.out.println("RailwayPasengerTest.main()");
		BeanFactory factory;
		RailwayController controller;
		RailwayVO vo=null;
		Scanner scn=null;
		String tno=null,pname=null,age=null,gender=null,from=null,to=null,costpkm=null,dist=null,result=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfg/applicationContext.xml"));
		controller=factory.getBean("railCont",RailwayController.class);
		scn=new Scanner(System.in);
		System.out.println("Ticket no::");
		tno=scn.nextLine();
		System.out.println("Pasenger Name::");
		pname=scn.nextLine();
		System.out.println("Age::");
		age=scn.nextLine();
		System.out.println("Gender::");
		gender=scn.nextLine();
		System.out.println("From::");
		from=scn.nextLine();
		System.out.println("To::");
		to=scn.nextLine();
		System.out.println("Fare per KM::");
		costpkm=scn.nextLine();
		System.out.println("Distance::");
		dist=scn.nextLine();
		vo=new RailwayVO();
		vo.setTicketNo(tno);
		vo.setPassangerName(pname);
		vo.setGender(gender);
		vo.setAge(age);
		vo.setOrigin(from);
		vo.setDistance(to);
		vo.setDistance(dist);
		vo.setCostPerKM(costpkm);
		
		try {
			result=controller.processPasenger(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Interface problem");
		}

	}

}
