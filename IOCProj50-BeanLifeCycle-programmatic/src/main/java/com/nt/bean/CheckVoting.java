package com.nt.bean;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CheckVoting implements InitializingBean,DisposableBean{
	private String name;
	private String address;
	private int age;
	private Date verificationDate;
	public CheckVoting() {
		System.out.println("CheckVoting::0 param constructor");
	}
	public void setName(String name) {
		System.out.println("CheckVoting.setName()");
		this.name = name;
	}
	public void setAddress(String address) {
		System.out.println("CheckVoting.setAddress()");
		this.address = address;
	}
	public void setAge(int age) {
		System.out.println("CheckVoting.setAge()");
		this.age = age;
	}
	
	//custom init method
	public void myInit() {
		System.out.println("CheckVoting.myInit()");
		verificationDate=new Date();
		if(name==null||age<0||age>128)
			throw new IllegalArgumentException("invalid name and age");
	}
	//destroy method
	public void myDestroy() {
		System.out.println("CheckVoting.myDestroy()");
		name=null;
		age=0;
		address=null;
	}
	//check voting eligibility
	public String checkVotingeligibility() {
		if(age>=18)
			return name+" You are eligible for voting";
		else
			return name+" you are not eligible for voting";
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("CheckVoting.afterPropertiesSet()");
		verificationDate=new Date();
		if(name==null||age<0||age>128)
			throw new IllegalArgumentException("invalid name and age");
	
	}
	
	public void destroy() throws Exception {
		System.out.println("CheckVoting.destroy()");
		name=null;
		age=0;
		address=null;
	
	}
	
	
}
