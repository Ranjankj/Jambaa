package com.aopDemo.aopDemo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aopDemo.aopDemo.data.Dao2;

@Component
public class Business2 {
	@Autowired
	private Dao2 dao2;
	
	public String doSomething() {
		return dao2.retreiveData();
	}
	
}
