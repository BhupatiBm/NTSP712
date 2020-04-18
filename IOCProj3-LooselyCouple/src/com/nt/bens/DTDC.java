package com.nt.bens;

public class DTDC implements Courier {
	public DTDC() {
		System.out.println("DTDC 0 param constructor");
	}
	
	@Override
	public final String deliver(int orderid, String totalbill) {
		return "BlueDart is delivering your order, having order id:"+orderid+" Bill amount for order is: "+totalbill +" Thank you.";
	}
}
