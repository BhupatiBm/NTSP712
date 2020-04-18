package com.nt.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BookStoreMgmtService;

@WebServlet("/controller")
public class MainControllerServlet extends HttpServlet {
	private ApplicationContext ctx;
	
	@Override
	public void init() throws ServletException {
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	}
    
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String cata=null;
		BookStoreMgmtService  service=null;
		List<Map<String,Object>> list=null;
		RequestDispatcher rd=null;
	    //read form data
		cata=req.getParameter("catagory");
		//get Service class object
		service=ctx.getBean("BookStoreService",BookStoreMgmtService.class);
		try {
		//invoke method
		list=service.searchBookByCatagory(cata);
		System.out.println(list.size());
		//keep results in requst scope
		req.setAttribute("BookList",list);
		//forward to show_detais.jsp
		rd=req.getRequestDispatcher("/show_details.jsp");
		rd.forward(req,res);
		}
		catch(Exception e) {
			e.printStackTrace();
			rd=req.getRequestDispatcher("/error.jsp");
			rd.forward(req,res);
		}
		
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
	
	@Override
	public void destroy() {
	   //close container
		((AbstractApplicationContext) ctx).close();
	}

}
