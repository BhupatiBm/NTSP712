package com.nt.advice;


import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.manager.AuthenticateManager;
@Component
public class SecurityCheckAdvice {
	@Autowired
	AuthenticateManager manager;
	public SecurityCheckAdvice(AuthenticateManager manager) {
		this.manager = manager;
	}
	
	@Pointcut("execution(String com.nt.service.BankServiceImpl.*(..)) and args(acno,amount)")
	public void muPtc() {
		
	}
	
	@Before("myPtc")
	public void checkCreditionals(int acno,float amount) {
		System.out.println("args values are---> acno:"+acno+"  amount:"+amount);
		if(!manager.validateUser()) {
			throw new IllegalArgumentException("Invalid craditionals");
		}
	}
	
	
	
	

}
