package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;
import com.nt.service.CollegeMGMTservice;
@WebServlet(value="/controller",loadOnStartup = 1)
public class MainControllerServlet extends HttpServlet{
	private DefaultListableBeanFactory factory ;
	@Override
	public void init() throws ServletException {
	XmlBeanDefinitionReader reader=null;
	factory=new DefaultListableBeanFactory();
	reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		StudentDTO sdto=null;
		EmployeeDTO edto=null;
		String s1=null;
		s1=req.getParameter("s1");
		CollegeMGMTservice service=null;
		String result=null;
		RequestDispatcher rd=null;
		service=factory.getBean("clgImpl", CollegeMGMTservice.class);
		if(s1.equalsIgnoreCase("Register Student")) {
			sdto=new StudentDTO();
			sdto.setId(Integer.parseInt(req.getParameter("sid")));
			sdto.setName(req.getParameter("sname"));
			sdto.setAddress(req.getParameter("saddress"));
			sdto.setCourse(req.getParameter("scourse"));
			result=service.registerStudent(sdto);
			req.setAttribute("resultMsg", result);
		}
		else {
			edto=new EmployeeDTO();
			edto.setId(Integer.parseInt(req.getParameter("eid")));
			edto.setName(req.getParameter("ename"));
			edto.setAddress(req.getParameter("eaddress"));
			edto.setQlfy(req.getParameter("eqlfy"));
			result=service.registerEmployee(edto);
			req.setAttribute("resultMsg", result);
		}
		
		rd = req.getRequestDispatcher("/result.jsp");
		rd.forward(req, res);
		
		
	}
	
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	doGet(req, res);
	}
	@Override
	public void destroy() {
		factory=null;
	}
	
	
}
