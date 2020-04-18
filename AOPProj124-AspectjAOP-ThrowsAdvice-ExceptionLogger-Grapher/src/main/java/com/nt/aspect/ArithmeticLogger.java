package com.nt.aspect;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.aspectj.lang.JoinPoint;

public class ArithmeticLogger {
	private static Logger logger=Logger.getLogger(ArithmeticLogger.class);
	static{
		PropertyConfigurator.configure("src/main/java/com/nt/commons/log.properties");
	}
	public void exceptionLogging(JoinPoint jp,Exception ex)throws Throwable{
		logger.fatal(jp.getSignature()+"with args "+jp.getArgs()+"has raised"+ex+"exception");
		//throw new IllegalArgumentException("hi hi:"+ex.getMessage());
	}
}
