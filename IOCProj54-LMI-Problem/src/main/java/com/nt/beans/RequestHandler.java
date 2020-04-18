package com.nt.beans;

public class RequestHandler {
	public static int count,reqcount;

	public RequestHandler() {
		count++;
		System.out.println("RequestHandler:0-param constructor::"+count);
	}
	public   void  processRequest(String data) {
		reqcount++;
		System.out.println("processing request no"+reqcount+" with data"+data+"by handler ::"+count);
	}

}
