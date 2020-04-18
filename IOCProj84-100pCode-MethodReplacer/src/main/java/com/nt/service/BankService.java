package com.nt.service;

public  class BankService {
	
	public BankService() {
		System.out.println("BankService:0-param constructor");
	}
	
	public    float  calcSimpleIntrAmount(float pAmt,float time) {
		System.out.println("BankService.calcSimpleIntrAmount()");
		return  (pAmt*2.0f*time)/100.0f;
	}

}
