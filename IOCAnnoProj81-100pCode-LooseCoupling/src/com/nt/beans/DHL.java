package com.nt.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dhl")
public class DHL  implements Courier{
	
	public DHL() {
		System.out.println("DHL:: 0-param constructor");
	}
	
	public   String  deliver(int oid) {
		return "DHL is delivering  "+oid+" order id products";
	}

}
