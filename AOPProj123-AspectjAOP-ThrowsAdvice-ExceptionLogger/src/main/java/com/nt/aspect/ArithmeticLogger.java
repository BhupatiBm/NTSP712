package com.nt.aspect;

import org.aspectj.lang.JoinPoint;

public class ArithmeticLogger {
	public void exceptionLogging(JoinPoint jp,Exception ae)throws Throwable{
		
		throw new IllegalArgumentException("hi hi:"+ae.getMessage());
	}
}
