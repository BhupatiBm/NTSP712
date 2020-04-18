package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("handler")
public class RequestHandler {
	private static int count;
	
	private  RequestHandler() {
		count++;
		System.out.println("RequestHandler:: 0-param constructor -->"+count);
	}
	
	public void handleRequest(String data) {
		System.out.println("RequestHandler:: handling request with data:::"+data);
	}

}
