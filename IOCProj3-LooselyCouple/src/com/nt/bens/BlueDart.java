package com.nt.bens;

public class BlueDart implements Courier {
	 public BlueDart() {
		System.out.println("BlueDart 0 param constructor");
	}
	@Override
	public final String deliver(int orderid, String totalbill) {
		return "BlueDart is delivering your order, having order id:"+orderid+" Bill amount for order is: "+totalbill +" Thank you.";
	}

}
