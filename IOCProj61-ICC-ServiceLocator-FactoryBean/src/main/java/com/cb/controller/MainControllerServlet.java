package com.cb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cb.service.CbScoreMgmtService;
@WebServlet("/controller")
public class MainControllerServlet extends HttpServlet{
	ApplicationContext ctx;
	@Override
	public void init() throws ServletException {
		//create ioc ioc container
		ctx=new ClassPathXmlApplicationContext("com/cb/cfgs/applicationContext.xml");
		
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		CbScoreMgmtService service=null;
		int mid=0;
		String score=null;
		RequestDispatcher rd=null;
		//get service class object
		service=ctx.getBean("cbService",CbScoreMgmtService.class);
		//get match id
		mid=Integer.parseInt(req.getParameter("mid"));
		//invoke method
		score=service.getScore(mid);
		//keep score in requesst sope
		req.setAttribute("scoreBoard",score);
		//forward to result jsp
		rd=req.getRequestDispatcher("/result.jsp");
		rd.forward(req, res);
	}
	
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
	
	@Override
	public void destroy() {
		((AbstractApplicationContext) ctx).close();
	}

}
