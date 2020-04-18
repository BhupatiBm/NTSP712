package com.nt.aspect;

import java.io.FileWriter;

import org.aspectj.lang.JoinPoint;

public class AuditingAdvice {
	private String manager=null;
	
	public void setManager(String manager) {
		this.manager=manager;
	}
	
	public void audit(JoinPoint jp,int loanId)throws Throwable{
		Object args[]=null;
		String auditMsg=null;
		FileWriter writer=null;
		args=jp.getArgs();
		auditMsg=args[0]+"loan id having loan amount "+args[1]+" for the purpose of "+args[2]
						+"has come for the aproval to the managet:"+manager+"/n/n";
		writer=new FileWriter("f:/logges/auditlog.txt",true);
		writer.write(auditMsg);
		writer.flush();
		writer.close();
	}

}
