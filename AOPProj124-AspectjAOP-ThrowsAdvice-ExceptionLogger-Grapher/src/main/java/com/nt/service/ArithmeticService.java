package com.nt.service;

public class ArithmeticService {
	public float div(int x,int y) {
		if(y==0)
			throw new IllegalArgumentException("y not be 0");
		else
			return (float)x/y;
	}

}
