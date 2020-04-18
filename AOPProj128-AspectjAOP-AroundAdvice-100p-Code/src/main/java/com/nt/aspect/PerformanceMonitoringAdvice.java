package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Aspect
@Order(1)
@Component
public class PerformanceMonitoringAdvice{
	private long start,end;
	@Around("execution(float com.nt.service.*.*(..))")
	public Object pMonitor(ProceedingJoinPoint pjp)throws Throwable{
		Object retval=null;
		start=System.currentTimeMillis();
		retval=pjp.proceed();
		end=System.currentTimeMillis();
		System.out.println(pjp.getSignature()+" with "+Arrays.toString(pjp.getArgs())+" has taken "+(end-start)+" ms.");
		return retval;
	}

}
