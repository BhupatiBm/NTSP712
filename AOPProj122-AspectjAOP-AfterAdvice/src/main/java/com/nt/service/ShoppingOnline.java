package com.nt.service;

public class ShoppingOnline {
	float total=0.0f;
	public float generateBillAmount(String products[],float prices[]) {
		for(float p:prices)
			total= p+total;
		return total;
	}

}
