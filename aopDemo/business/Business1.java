package com.aopDemo.aopDemo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aopDemo.aopDemo.data.Dao1;

@Component
public class Business1 {
	@Autowired
	private Dao1 dao1;
	
	public String doSomething() {
		return dao1.retreiveData();
	}
	
}
