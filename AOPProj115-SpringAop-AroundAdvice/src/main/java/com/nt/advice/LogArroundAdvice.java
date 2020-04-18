package com.nt.advice;



import java.util.Arrays;
import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogArroundAdvice implements MethodInterceptor {
	private static Logger logger=Logger.getLogger(LogArroundAdvice.class);
	static{
		PropertyConfigurator.configure("src/main/java/com/nt/commons/log.properties");
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retval=null;
		Object args[]=null;
		logger.debug("entering into "+invocation.getMethod().getName()+" With args "+Arrays.toString(invocation.getArguments())+"at"+new Date());
		args=invocation.getArguments();
		
		if(((float)args[0])<=0 || ((float)args[1])<=0 || ((float)args[2])<=0)
			throw new IllegalArgumentException("input must be +ve and greater than zero");
			
		
		retval=invocation.proceed();
		
		
		if(((float)retval)>= 5000)
			retval=(float)retval+(float)retval*0.2f;
		logger.debug("exited from "+invocation.getMethod().getName()+" with args "+Arrays.toString(invocation.getArguments())+ "at" +new Date());
		return retval;
	}

}
