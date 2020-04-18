package com.nt.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=null;
		String pname=null,pgender=null,pjob_status=null;
		int page=0,psalary=0;
		pw=res.getWriter();
		res.setContentType("text/html");
		pname=req.getParameter("name");
		page=Integer.parseInt(req.getParameter("age"));
		pgender=req.getParameter("gender");
		pjob_status=req.getParameter("job");
		psalary=Integer.parseInt(req.getParameter("salary"));
		
		/*pw.println(pname);
		pw.println(page);
		pw.println(pgender);
		pw.println(pjob_status);
		pw.println(psalary);*/
		if(pgender.equalsIgnoreCase("m"))
		{
			if(page>=22) 
			{
				if(pjob_status.equalsIgnoreCase("emp") )
				{
					if(psalary>=25000)
					{
					  pw.println("<h1 style='color:green;text-align:center'>Mr."+pname+" You are eligible for marriage...still think twice..it is a 60year project</h1>");
					}
					else
						pw.println("<h1 style='color:red;text-align:center'>Mr."+pname+" You are not eligible for marriage...earn salary 25k or more</h1>");
				}
				else
					pw.println("<h1 style='color:red;text-align:center'>Mr."+pname+" You are not eligible for marriage...find a JOB..enjy life</h1>");
		    }
			else
				pw.println("<h1 style='color:red;text-align:center'>Mr."+pname+" You are not eligible for marriage...you are uder age...enjoy your life..</h1>");
	    }
	else
		{
			if(page>=18) 
			{
				if(pjob_status.equalsIgnoreCase("emp")) 
				{
					pw.println("<h1 style='color:green;text-align:center'>Miss."+pname+" You are eligible for marriage...still think abot that boy</h1>");
				}
				else
					pw.println("<h1 style='color:red;text-align:center'>Miss."+pname+" You are not eligible for marriage...find a job and become indipendent yourself</h1>");
			}
			else
				pw.println("<h1 style='color:red;text-align:center'>Miss."+pname+" You are not eligible for marriage...you are under age</h1>");
		}
		pw.println("<a href='input.html'>home</a>");
		pw.close();
	}
	
	
}
