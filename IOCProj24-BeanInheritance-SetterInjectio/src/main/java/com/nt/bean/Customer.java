package com.nt.bean;

public class Customer {
	private String sname;
	private String bno;
	private String BikeName;
	private String cc;
	private String engine;
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setBno(String bno) {
		this.bno = bno;
	}
	public void setBikeName(String bikeName) {
		BikeName = bikeName;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Customer [sname=" + sname + ", address=" + bno + ", BikeName=" + BikeName + ", cc=" + cc
				+ ", engine=" + engine + "]";
	}
	
	
}
