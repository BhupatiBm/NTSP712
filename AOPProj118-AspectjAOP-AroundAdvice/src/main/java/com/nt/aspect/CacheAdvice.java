package com.nt.aspect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;

public class CacheAdvice {
	Map<String,Object> cache=new HashMap<String, Object>();
	public Object caching(ProceedingJoinPoint pjp)throws Throwable{
		String key=pjp.getSignature()+Arrays.toString(pjp.getArgs());
		if(!cache.containsKey(key)) {
			Object retval=pjp.proceed();
			cache.put(key, retval);
			System.out.println("from target");
			return retval;
			
		}
		else {
			System.out.println("from catch");
			return cache.get(key);
		}
	}

}
