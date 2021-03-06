package com.nt.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformaceMonitoringAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retValue=null;
		long start=0,end=0;
		start=System.currentTimeMillis();
		retValue=invocation.proceed();
		end=System.currentTimeMillis();
		System.out.println(invocation.getMethod().getName()+" has taken "+(end-start)+"ms to complete the execution");
		return retValue;
	}

}
