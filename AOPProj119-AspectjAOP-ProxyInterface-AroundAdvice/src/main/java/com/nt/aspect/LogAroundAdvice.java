package com.nt.aspect;

import java.util.Arrays;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAroundAdvice {
	private static Logger logger=Logger.getLogger(LogAroundAdvice.class);
	static{
		PropertyConfigurator.configure("src/main/java/com/nt/commons/log.properties");
	}
	public Object logging(ProceedingJoinPoint pjp) throws Throwable{
		Object retval=null;
		Object args[]=pjp.getArgs();
		logger.debug("Entering into "+pjp.getSignature()+" with args "+Arrays.toString(pjp.getArgs()));
		if(((float)args[0])<=0 || ((float)args[1])<=0 || ((float)args[2])<=0  )
			throw new IllegalArgumentException("enter +ve value ");
		
		else
			retval=pjp.proceed(args);
		
		logger.debug("Exited from"+pjp.getSignature()+"with args"+Arrays.toString(pjp.getArgs()));
		return retval;
	}

}
