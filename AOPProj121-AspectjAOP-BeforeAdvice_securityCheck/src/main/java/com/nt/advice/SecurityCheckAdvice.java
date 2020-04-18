package com.nt.advice;


import com.nt.manager.AuthenticateManager;

public class SecurityCheckAdvice {
	AuthenticateManager manager;

	public SecurityCheckAdvice(AuthenticateManager manager) {
		this.manager = manager;
	}
	
	public void checkCreditionals(int acno,float amount) {
		System.out.println("args values are---> acno:"+acno+"  amount:"+amount);
		if(!manager.validateUser()) {
			throw new IllegalArgumentException("Invalid craditionals");
		}
	}
	
	
	
	

}
