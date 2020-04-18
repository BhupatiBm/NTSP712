package com.nt.bean;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC  implements Courier{
	
	public DTDC() {
		System.out.println("DTDC:: 0-param constructor");
	}
	
	public   String  deliver(int oid) {
		return "DTDC is delivering  "+oid+" order id products";
	}

}
