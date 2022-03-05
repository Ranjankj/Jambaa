package com.aopDemo.aopDemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class UserAccessAspect {
	Logger logger = LoggerFactory.getLogger(this.getClass());
//	 execution(* package_name.*.*(..))
	@Before("execution(* com.aopDemo.aopDemo.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		logger.info("Your Access Granted-{}", joinPoint);
		
	}
//	 JoinPoint is the methods which are intercepted by the aspect(or AOP)
	@AfterReturning(value = "execution(* com.aopDemo.aopDemo.business.*.*(..))",
			returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result ) {
		logger.info("joinPoint {} and the result is {}",joinPoint, result);
		
	}
	
	@After("execution(* com.aopDemo.aopDemo.business.*.*(..))")
	public void after(JoinPoint joinPoint) {
		logger.info("joinPoint {} After Advice",joinPoint);
		
	}
	
	
	
}

/*
 * some more advice
 * 1. After
 * 2. AfterThrowing
 * 
 * */
