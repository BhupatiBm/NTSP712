package com.nt.aspect;

import java.util.Arrays;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Aspect
@Order(2)
@Component
public class LogAroundAdvice {
	private static Logger logger=Logger.getLogger(LogAroundAdvice.class);
	static{
		PropertyConfigurator.configure("src/main/java/com/nt/commons/log.properties");
	}
	@Around("execution(float com.nt.service.*.*(..))")
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
