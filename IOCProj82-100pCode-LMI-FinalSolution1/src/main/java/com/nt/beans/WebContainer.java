package com.nt.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("container")
public abstract class WebContainer {
	
	public WebContainer() {
		System.out.println("WebContainer:: 0-param constructor");
	}
	
	@Lookup
	public abstract RequestHandler getRequestHandler();
	
	public  void  processRequest(String data) {
		RequestHandler handler=null;
		System.out.println("processing request with data::"+data);
		//get Dependent Bean class object
		handler=getRequestHandler();
		//invoke method
		handler.handleRequest(data);
	}

}
