package com.nt.hander;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface handler {
	public String handler(HttpServletRequest req,HttpServletResponse res)throws Exception; 

}
