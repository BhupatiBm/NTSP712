package com.nt.bean;

public class Customer {
	private String sname;
	private String bno;
	private String BikeName;
	private String cc;
	private String engine;
	
	public Customer(String sname, String bno, String bikeName, String cc, String engine) {
		
		this.sname = sname;
		this.bno = bno;
		BikeName = bikeName;
		this.cc = cc;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Customer [sname=" + sname + ", address=" + bno + ", BikeName=" + BikeName + ", cc=" + cc
				+ ", engine=" + engine + "]";
	}
	
	
}
