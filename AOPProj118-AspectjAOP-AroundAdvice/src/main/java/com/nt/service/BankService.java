package com.nt.service;

public class BankService {
	public float simpleIntrest(float p,float t,float r) {
		return (p*t*r)/100;
	}
	public float compoundIntrest(float p,float t,float r) {
		return (float) (p*Math.pow((1+r/100.0f),t)-p);
	}

}
