package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component("voter")
@PropertySource("classpath:com/nt/commons/myfile.properties")
public class VotingElgibilityCheck {
	@Value("${name}")
	@Nullable
	 private  String name;
	
	@Value("${addrs}")
	@Nullable
	 private  String addrs;
	
	@Value("${age}")
	 private  int age;
	
	@Nullable
	 private  Date verificationDate;
	 
	 
	 public VotingElgibilityCheck() {
		System.out.println("VotingElgibilityCheck.VotingElgibilityCheck()");
	}
	
	
	 @PostConstruct
	public void myInit() {
		System.out.println("VotingElgibilityCheck.myInit()");
		
		verificationDate=new Date();
		if(name==null || age<=0 || age>=125)
			throw new IllegalArgumentException("Invalid name,age values");
	}
	
	 @PreDestroy
	public void myDestroy() {
		System.out.println("VotingElgibilityCheck.myDestroy()");
		name=null;
		age=0;
		addrs=null;
		verificationDate=null;
		
	}
	
	
	public  @Nullable String  checkUrVotingElgibility() {
		if(age<18)
			return "Mr/Miss/Mrs"+name+" u r not elgible for voting";
		else
			return "Mr/Miss/Mrs"+name+" u r  elgible for voting";
	}
	

}
