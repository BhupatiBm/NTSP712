package com.nt.service;

public class BankService {
	public float calcIntrAmount(float p,float r,float t) {
		System.out.println("BankService.calcIntrAmount()");
		return (p*t*r)/100;
	}

}
