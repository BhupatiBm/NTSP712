package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceMonitoringAdvice{
	private long start,end;
	public Object pMonitor(ProceedingJoinPoint pjp)throws Throwable{
		Object retval=null;
		start=System.currentTimeMillis();
		retval=pjp.proceed();
		end=System.currentTimeMillis();
		System.out.println(pjp.getSignature()+" with "+Arrays.toString(pjp.getArgs())+" has taken "+(end-start)+" ms.");
		return retval;
	}

}
