package com.nt.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AllAdvices {
	
	@Pointcut("execution(*com.nt.service.MathFunctions.*(..))")
	public void pCut() {
	}
	
	@Around("pCut()")
	public Object monitor(ProceedingJoinPoint pjp)throws Throwable{
		System.out.println("from around advice");
		Object rtval=pjp.proceed();
		return rtval;
	}
	@Before("pCut()")
	public void logBefore(JoinPoint jp)throws Throwable{
		System.out.println("from before advice");
	}
	
	@AfterReturning(value="pCut()", returning = "res")
	public void logAfter(JoinPoint jp , int res)throws Throwable{
		System.out.println("from after advice");
	}
	
	@AfterThrowing(value="pCut()",throwing = "ex")
	public void logThrow(JoinPoint jp,Exception ex)throws Throwable{
		System.out.println("from throw advice");
	}

}
