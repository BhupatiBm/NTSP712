package com.nt.service;

import org.springframework.stereotype.Component;

@Component("mathFun")
public class MathFunctions {
	public int sum(int x,int y) {
		return x+y;
	}
	public int subs(int x,int y) {
		return x-y;
	}
	public int mul(int x,int y) {
		return x*y;
	}
	public float div(int x,int y) {
		if(y<=0)
			throw new ArithmeticException("y can not be zero");
		else
			return (float)x/y;
	}

}
