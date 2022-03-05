package com.aopDemo.aopDemo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutConfig {
	// here we can create all poincuts in a single file
	// then we only have to use  functionName
	
	
	@Pointcut("\"execution(* com.aopDemo.aopDemo.business.*.*(..))\"")
	public void dataLayerExecution() {};
	
	
	// copy the qualified path and paste it to the execution place
	//com.aopDemo.aopDemo.aspect.PointCutConfig.dataLayerExecution()
}
