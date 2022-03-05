package com.aopDemo.aopDemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AroundAdvice {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Around("execution(* com.aopDemo.aopDemo.business.*.*(..))")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime =  System.currentTimeMillis();
		joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		logger.info("The time taken for {}  is {}",joinPoint,endTime-startTime);
		
	}
}
