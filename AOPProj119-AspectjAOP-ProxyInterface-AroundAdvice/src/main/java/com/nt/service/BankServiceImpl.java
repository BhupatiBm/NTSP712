package com.nt.service;

public class BankServiceImpl implements InterBankService{
	@Override
	public float simpleIntrest(float p,float t,float r) {
		return (p*t*r)/100;
	}
	@Override
	public float compoundIntrest(float p,float t,float r) {
		return (float) (p*Math.pow((1+r/100.0f),t)-p);
	}

}
