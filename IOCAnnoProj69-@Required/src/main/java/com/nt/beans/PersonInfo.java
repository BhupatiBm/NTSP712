package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Required;

public class PersonInfo {
	private int pid;
	private String name;
	private  Address  addrs;
	private  Calendar  sysDate;
	
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	@Required
	public void setAddrs(Address addrs) {
		this.addrs = addrs;
	}
	public void setSysDate(Calendar sysDate) {
		this.sysDate = sysDate;
	}
	
	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", name=" + name + ", addrs=" + addrs + ", sysDate=" + sysDate + "]";
	}
	

}
