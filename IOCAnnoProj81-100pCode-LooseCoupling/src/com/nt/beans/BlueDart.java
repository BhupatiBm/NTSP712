package com.nt.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bDart")
public class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BlueDart:: 0-param constructor");
	}
	
	public   String  deliver(int oid) {
		return "BlueDart is delivering  "+oid+" order id products";
	}

}
