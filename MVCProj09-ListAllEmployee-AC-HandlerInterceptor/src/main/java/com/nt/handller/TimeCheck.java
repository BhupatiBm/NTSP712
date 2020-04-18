package com.nt.handller;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TimeCheck implements HandlerInterceptor{
	

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		Calendar dt=null;
		int hour=0;
		RequestDispatcher rd=null;
		dt=Calendar.getInstance();
		hour=dt.get(Calendar.HOUR_OF_DAY);
		System.out.println("pre handler");
		if(hour<=19 || hour>=20) {
			rd=req.getRequestDispatcher("/timeout.jsp");
			rd.forward(req, res);	
			return false;
		}
		else
			return true;
				
		}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
			System.out.println("post handler");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("after compition");
		}
}
