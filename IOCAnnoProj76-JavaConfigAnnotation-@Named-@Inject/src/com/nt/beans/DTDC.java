package com.nt.beans;

import javax.inject.Named;

@Named("dtdc")
public class DTDC  implements Courier{
	
	public DTDC() {
		System.out.println("DTDC:: 0-param constructor");
	}
	
	public   String  deliver(int oid) {
		return "DTDC is delivering  "+oid+" order id products";
	}

}
