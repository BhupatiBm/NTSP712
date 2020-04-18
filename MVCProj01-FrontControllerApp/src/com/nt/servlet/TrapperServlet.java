package com.nt.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.hander.CountryHandler;
import com.nt.hander.LanguageHandler;
import com.nt.hander.handler;
@WebServlet(urlPatterns = "*.doo",loadOnStartup = 1)

public class TrapperServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String path=null;
		handler handler=null;
		String lvn=null;
		String target=null;
		RequestDispatcher  rd=null;
		path=req.getServletPath();
		try {
			if(path.equalsIgnoreCase("/langs.doo")) {
				handler=new LanguageHandler();
			}

			if(path.equalsIgnoreCase("/countries.doo")) {
				handler=new CountryHandler();
			}
			else {
				throw new IllegalArgumentException("invalid request URL"); 
			}
			
			lvn=handler.handler(req, res);
		}
		catch (Exception e) {
			e.printStackTrace();   
		}

		//perform view management
		try {
			if(lvn.equalsIgnoreCase("disp_lang")) {
				target="show_lang.jsp";	
			}
			if(lvn.equalsIgnoreCase("disp_country")) {
				target="show_countries.jsp";
			}
			else {
				throw new IllegalArgumentException("invalid view"); 
			}
			
			//forward to target page
			rd=req.getRequestDispatcher(target);
			rd.forward(req, res);

		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
